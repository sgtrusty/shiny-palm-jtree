///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.unapec.corba.mserver;
//
//import mserver.*;
//import org.omg.CosNaming.*;
//import org.omg.CORBA.*;
//import org.omg.CORBA.ORBPackage.InvalidName;
//import org.omg.CosNaming.NamingContextPackage.CannotProceed;
//import org.omg.CosNaming.NamingContextPackage.NotFound;
//import org.omg.PortableServer.*;
//import org.omg.PortableServer.POA;
//import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
//import org.omg.PortableServer.POAPackage.ServantNotActive;
//import org.omg.PortableServer.POAPackage.WrongPolicy;
//
///**
// *
// * @author virt001
// */
//public class RecoServer {
//
//    public RecoServer(String[] args) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        try {
//            //crea instancua al ORB
//            ORB orb = ORB.init(args, null);            
//            //crea instancia a POA 
//            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));       
//            //activa POA Manager
//            rootpoa.the_POAManager().activate();       
//            //instancia de clase Fibonacci
//            RecoImpl recoImpl = new RecoImpl();  
////            recoImpl.setORB(orb);
//            
//            //obtiene la referencia de la clase FiboImpl (servant)
//            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(recoImpl);
//            recollector href = recollectorHelper.narrow(ref);
//            
//            //obtiene referencia
//            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
//            NamingContextExt rootContext = NamingContextExtHelper.narrow(objRef);
//             
//            NameComponent nameComponent[] = rootContext.to_name("Recollector");
//            rootContext.rebind(nameComponent, href);
//            
//            //listo para recibir peticiones
//            System.out.println("Servidor> listo y en espera");
//            orb.run();            
//        } catch (AdapterInactive | InvalidName | ServantNotActive | WrongPolicy | org.omg.CosNaming.NamingContextPackage.InvalidName | NotFound | CannotProceed e) {
//            System.err.println("Error: " + e.getMessage());
//            e.printStackTrace(System.out);
//        }
//    }
//}
