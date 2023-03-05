package Model.Store;

import Model.Toys.PreSchool;

public class PreSchoolStore<P extends PreSchool> extends StoreAbstract{


    public PreSchoolStore(String storeName) {
        super(storeName);
    }

    public PreSchoolStore() {
    }

    @Override
    public String toString() {
        return "SubStore: " +super.toString();
    }
}
