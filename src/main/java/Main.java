import controllers.Client;
import proxy.ProxyCache;
import service.IService;
import service.ServiceImpl;

public class Main {
    public static void main(String[] args) {
//        IService iService = new ServiceImpl();
        IService proxy = new ProxyCache();
        Client client = new Client();
        client.setService(proxy);
        System.out.println("res="+client.perform(23));
        System.out.println("res="+client.perform(23));
        System.out.println("res="+client.perform(23));
    }
}
