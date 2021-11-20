package Strings;

class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        String res = address.replace(".", "[.]");
        return res;
    }    
}
