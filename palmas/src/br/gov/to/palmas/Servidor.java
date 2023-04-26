package br.gov.to.palmas;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import br.gov.to.palmas.notafiscal.NFService;
import br.gov.to.palmas.notafiscal.NFServiceImpl;

public class Servidor {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1099);

        NFService nfService = new NFServiceImpl();
        NFService stubMsgService = (NFService) UnicastRemoteObject
                .exportObject((NFService) nfService, 0);
        registry.rebind("NFService", stubMsgService);
    }
}
