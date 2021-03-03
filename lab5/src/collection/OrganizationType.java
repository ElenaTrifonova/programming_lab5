package collection;

public enum OrganizationType {
    PUBLIC("Public"),
    GOVERNMENT("Government"),
    TRUST("Trust"),
    PRIVATE_LIMITED_COMPANY("Private limited company"),
    OPEN_JOINT_STOCK_COMPANY("Open joint stock company");

    private final String name;

    OrganizationType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static OrganizationType getNamedEnum(String name){
        OrganizationType returnOrg = null;
        for (OrganizationType org: values()){
            if (org.getName().equals(name)) {
                returnOrg = org;
                break;
            }
            else throw new IllegalArgumentException("Type og organization with  name" + name +  "doesn't exist");
        }
        return returnOrg;
    }
}
