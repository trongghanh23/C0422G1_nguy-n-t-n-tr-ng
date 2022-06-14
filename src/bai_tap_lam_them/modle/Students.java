package bai_tap_lam_them.modle;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class Students extends Person{
    public Students() {
    }

    public Students(int id, String code, String name, String birthday, String address) {
        super(id, code, name, birthday, address);
    }

    @Override
    public void animal() {
        System.out.println("học sinh đi học");
    }

    public String toString(){

        return super.toString();
    }
}
