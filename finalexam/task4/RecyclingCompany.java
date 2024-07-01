import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RecyclingCompany implements LegalEntity {
    private String address;
    private String vatNumber;
    private List<Material> materials = new ArrayList<>();

    public RecyclingCompany(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public boolean removeMaterial(Material material) {
        return materials.remove(material);
    }

    public Material findMaterialByName(String name) {
        for (Material m : materials) {
            if (m.getName().equalsIgnoreCase(name)) {
                return m;
            }
        }
        return null;
    }

    public void printMaterials() {
        for (Material m : materials) {
            System.out.println(m);
        }
    }

    public void saveMaterialsToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(materials);
            System.out.println("Materials list saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving materials list: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadMaterialsFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            materials = (List<Material>) ois.readObject();
            System.out.println("Materials list loaded from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading materials list: " + e.getMessage());
        }
    }
}
