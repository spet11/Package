package com.Package;

public class Store {
    String store;
    String Location;
    String Date;

    public static void main(String[] args) {
        Store st = new Store();
        st.store=" Tesco";
        st.Location=" Leicester";
        st.Date=" 01-01-2000";

        System.out.println("Store Name" + st.store);
        System.out.println("Location" + st.Location);
        System.out.println("Date" + st.Date);

    }
}
