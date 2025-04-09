public String extractCity(String cityZip) {
    int commaIndex = cityZip.indexOf(","); 
    return cityZip.substring(0, commaIndex);
}
public void printNames() {
    for (int i = 0; i < lines.size(); i++) {
        String line = lines.get(i);
        if (!line.equals("") && (i == 0 || lines.get(i - 1).equals(""))) {
            System.out.println(line);
        }
    }
}
public String getAddress(String name) {
    for (int i = 0; i < lines.size(); i++) {
        if (lines.get(i).equals(name)) {
            String address = "";
            i++;
            while (i < lines.size() && !lines.get(i).equals("")) {
                address += lines.get(i) + "\n";
                i++;
            }
            return address;
        }
    }
    return "";
}
