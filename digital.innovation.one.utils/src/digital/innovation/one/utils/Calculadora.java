package digital.innovation.one.utils;

import digital.innovation.one.utils.interno.DivHelper;
import digital.innovation.one.utils.interno.MulHelper;
import digital.innovation.one.utils.interno.SubHelper;
import digital.innovation.one.utils.interno.SumHelper;

public class Calculadora {
    private DivHelper divHelper;
    private MulHelper mulHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        mulHelper = new MulHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();

    }

    public int sum(int a, int b){
        return sumHelper.execute(a,b);

    }
    public int sub(int a, int b){
        return subHelper.execute(a,b);

    }
    public int mul(int a, int b){
        return mulHelper.execute(a,b);

    }
    public int div(int a, int b){
        return divHelper.execute(a,b);

    }

}
