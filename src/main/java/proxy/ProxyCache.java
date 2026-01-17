package proxy;

import service.IService;
import service.ServiceImpl;

import java.util.HashMap;
import java.util.Map;


public class ProxyCache implements IService {

    private ServiceImpl service = new ServiceImpl();
    private Map<Integer,Double> cache = new HashMap<>();
    @Override
    public double compute(int t) {
        if(!cache.containsKey(t)){
            double resultat = service.compute(t);
             cache.put(t,resultat);
             return resultat;
        }
        else {
             return cache.get(t);
        }
    }
}
