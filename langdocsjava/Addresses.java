import java.util.List;

public class Addresses {
    private List<String> lines;

    public Addresses() {
        
    }

    public String extractCity(String cityZip) {
        return cityZip.split(", ")[0];
    }

    public void printNames() {
        for (int i = 0; i < lines.size(); i++) {
            if (!lines.get(i).isEmpty() && (i == 0 || lines.get(i - 1).isEmpty())) {
                System.out.println(lines.get(i));
            }
        }
    }

    public String getAddress(String name) {
        StringBuilder address = new StringBuilder();
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).equals(name) && i + 1 < lines.size()) {
                int j = i + 1;
                while (j < lines.size() && !lines.get(j).isEmpty()) {
                    address.append(lines.get(j)).append("\n");
                    j++;
                }
                break;
            }
        }
        return address.toString();
    }
}
