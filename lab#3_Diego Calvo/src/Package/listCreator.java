package Package;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Diego Calvo R
 */
public class listCreator {
    
    public static void multilistAL(Node PTR){
        Node n1 = null;
        Node n2 = null;
        Node p,q,r,s;
        
        PTR = new Node("Gabriel Garcia Marquez", n1, n2);
        
        //Primer Autor//     
        p = new Node("100 años de Soledad","GGM100",n2);
        PTR.setLink2(p);
        r = new Node("El Amor en los Tiempos del Colera","GGMATC",n2);
        p.setLink2(r);
        p = new Node("Cronica de una Muerte Anunciada","GGMCMA",n2);
        r.setLink2(p);
        r = new Node("El Otoño del Patriarca","GGMOP",n2);
        p.setLink2(r);
        p = new Node("Del Amor y otros Demonios","GGMAD",n2);
        r.setLink2(p);
    
        //Segundo Autor//
        q= new Node("William Shakespeare",n1,n2);
        PTR.setLink1(q);
        p = new Node("Hamlet","WSH",n2);
        q.setLink2(p);
        r = new Node("La Tempestad","WSLT",n2);
        p.setLink2(r);
        p = new Node("Macbeth","WSM",n2);
        r.setLink2(p);
        r = new Node("Romeo y Julieta","WSRJ",n2);
        p.setLink2(r);
        p = new Node("El Rey Lear","WSRL",n2);
        r.setLink2(p);
        r = new Node("Mucho Ruido y Pocas Nueces","WSMRPN",n2);
        p.setLink2(r);
        
        //Tercer Autor//
        s = new Node("J.K Rowling",n1,n2);
        q.setLink1(s);
        p = new Node("Animales Fantasticos","JKRAF",n2);
        s.setLink2(p);
        r = new Node("Harry Potter y la Piedra Filosofal","JKRHPPF",n2);
        p.setLink2(r);
        p = new Node("Harry Potter y la Camara Secreta","JKRHPCS",n2);
        r.setLink2(p);
        r = new Node("Harry Potter y el Prisionero de Azkaban","JKRHPPA",n2);
        p.setLink2(r);
        p = new Node("Harry Potter y el Caliz de Fuego","JKRHPCF",n2);
        r.setLink2(p);
        r = new Node("Harry Potter y la Orden del Fenix","JKRHPOF",n2);
        p.setLink2(r);
        p = new Node("Harry Potter y el Misterio del Principe","JKRHPMP",n2);
        r.setLink2(p);
        
        //Cuarto Autor//
        q = new Node("Jorge Borges",n1,n2);
        s.setLink1(q);
        p = new Node("La Biblioteca de Babel","JBBB",n2);
        q.setLink2(p);
        r = new Node("El Hacedor","JBH",n2);
        p.setLink2(r);
        p = new Node("El Libro de los Seres Imaginarios","JBLSI",n2);
        r.setLink2(p);
        r = new Node("El Jardin de Senderos que se Bifurcan","JBJSB",n2);
        p.setLink2(r);
        p = new Node("Funes el Memorioso","JBFM",n2);
        r.setLink2(p);
        
        //Quinto Autor//
        s = new Node("Julio Cortázar",n1,n2);
        q.setLink1(s);
        p = new Node("Rayuela","JCR",n2);
        s.setLink2(p);
        r = new Node("Bestiario","JCB",n2);
        p.setLink2(r);
        p = new Node("Modelo para Amar","JCMA",n2);
        r.setLink2(p);
        r = new Node("Casa Tomada","JCCT",n2);
        p.setLink2(r);
        p = new Node("Final de Juego","JCFJ",n2);
        r.setLink2(p);
        r = new Node("Las Armas Secretas","JCAS",n2);
        p.setLink2(r);
        
        //Sexto Autor//
        q = new Node("Mario Vargas Llosa",n1,n2);
        s.setLink1(q);
        p = new Node("La Fiesta del Chivo","MVLFC",n2);
        q.setLink2(p);
        r = new Node("La Ciudad y los Perros","MVLCP",n2);
        p.setLink2(r);
        p = new Node("La Guerra del Fin del Mundo","MVLGFM",n2);
        r.setLink2(p);
        r = new Node("La Casa Verde","MVLCV",n2);
        p.setLink2(r);
        
        //Septimo Autor//
        s = new Node("Sears Zemanky",n1,n2);
        q.setLink1(s);
        p = new Node("Fisica Universitaria 13° Edición","SZFU13E",n2);
        s.setLink2(p);
        
        //Octavo Autor//
        q = new Node("Tom Apostol",n1,n2);
        s.setLink1(q);
        p = new Node("Calculo Vol.1","TACV1",n2);
        q.setLink2(p);
        r = new Node("Calculo Vol.2","TACV2",n2);
        p.setLink2(r);
        
        //Noveno Autor//
        s = new Node("Edgar Alan Poe",n1,n2);
        q.setLink1(s);
        p = new Node("El Principito","EAPP",n2);
        s.setLink2(p);
        r = new Node("Los Crimenes de la Calle Morgue","EAPCCM",n2);
        p.setLink2(r);
        p = new Node("El Corazon Delator","EAPCD",n2);
        r.setLink2(p);
        r = new Node("El Cuervo","EAPC",n2);
        p.setLink2(r);
        p = new Node("La Mascara de la Muerte Roja","EAPMMR",n2);
        r.setLink2(p);
        
        //Decimo Autor//
        q = new Node("Stephen King",n1,n2);
        s.setLink1(q);
        p = new Node("It(Eso)","SKI",n2);
        q.setLink2(p);
        r = new Node("Carrie","SKC",n2);
        p.setLink2(r);
        p = new Node("El Resplandor","SKR",n2);
        r.setLink2(p);
        r = new Node("La Danza de la Muerte","SKDM",n2);
        p.setLink2(r);
        p = new Node("El Misterio de Salem's Lot","SKMSL",n2);
        r.setLink2(p);
                
        System.out.println("se creo PTR1");
        
    }
    
    public static void multilistAE(Node PTR) throws ParseException{
        
        Node n1 = null;
        Node n2 = null;
        Node p,q,r,s;
        String dateInString;
        Date fd;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        
        //Primer Afiliado//
        PTR = new Node("Juan Gonzales",1000,0,n1,n2);
        dateInString = "18/05/2017";
        fd = format.parse(dateInString);
        p = new Node("100 años de Soledad","Gabriel Garcia Marquez","GGM100", fd,n2);
        PTR.setLink4(p);
        dateInString = "19/05/2017";
        fd = format.parse(dateInString);
        r = new Node("It(Eso)","Stephen King","SKI",fd,n2);
        p.setLink4(r);
        
        //Segundo Afiliado//
        q = new Node("Alejandra Rodriguez",1001,0,n1,n2);
        PTR.setLink3(q);
        dateInString = "18/05/2017";
        fd = format.parse(dateInString);
        p = new Node("Romeo y Julieta","William Sheakespeare","WSRJ",fd,n2);
        q.setLink4(p);
        
        //Tercer Afiliado//
        s = new Node("Rocio Ramos",1002,0,n1,n2);
        q.setLink3(s);
        dateInString = "20/05/2017";
        fd = format.parse(dateInString);
        p = new Node("La Mascara de la Muerte Roja","Edgar Alan Poe","EAPMMR",fd,n2);
        s.setLink4(p);
        dateInString = "18/05/2017";
        fd = format.parse(dateInString);
        r = new Node("El Resplandor","Stephen King","SKR",fd,n2);
        p.setLink4(r);
        
        //Cuarto Afiliado//
        q = new Node("Diego Calvo",1003,0,n1,n2);
        s.setLink3(q);
        dateInString = "21/05/2017";
        fd = format.parse(dateInString);
        p = new Node("Los Crimenes de la Calle Morgue","Edgar Alan Poe","EAPCCM",fd,n2);
        q.setLink4(p);
        dateInString = "18/05/2017";
        fd = format.parse(dateInString);
        r = new Node("El Libro de los Seres Imaginarios","Jorge Borges","JBLSI",fd,n2);
        p.setLink4(r);
        dateInString = "28/05/2017";
        fd = format.parse(dateInString);
        p = new Node("Modelo para Amar","Julio Cortázar","JCMA",fd,n2);
        r.setLink4(p);
        
        //Quinto Afiliado//
        s = new Node("Vanesa Lobo",1004,0,n1,n2);
        q.setLink3(s);
        dateInString = "18/05/2017";
        fd = format.parse(dateInString);
        p = new Node("Funes el Memorioso","Jorge Borges","JBFM",fd,n2);
        s.setLink4(p);
        dateInString = "20/05/2017";
        fd = format.parse(dateInString);
        r = new Node("El Misterio de Salem's Lot","Stephen King","SKMSL",fd,n2);
        p.setLink4(r);
        System.out.println("se creo PTR2");
        
    }
    
    public static void doublelistE(Node PTR){
        
        Node n=null;
        Node p,q;
        
        PTR = new Node("100 Años de Soledad","Gabriel Garcia Marquez","GGM100",true,1000,n,n);
        p = new Node("El Amor en los Tiempos del Colera","Gabriel Garcia Marquez","GGMATC",false,0,n,PTR);
        PTR.setRight(p);
        q = new Node("Cronica de una Muerte Anunciada","Gabriel Garcia Marquez","GGMCMA",false,0,n,p);
        p.setRight(q);
        p = new Node("El Otoño del Patriarca","Gabriel Garcia Marquez","GGMOP",false,0,n,q);
        q.setRight(p);
        q = new Node("Del Amor y otros Demonios","Gabriel Garcia Marquez","GGMAD",false,0,n,p);
        p.setRight(q);
        p = new Node("Hamlet","William Sheakespeare","WSH",false,0,n,q);
        q.setRight(p);
        q = new Node("La Tempestad","William Sheakespeare","WST",false,0,n,p);
        p.setRight(q);
        p = new Node("Macbeth","William Sheakespeare","WSM",false,0,n,q);
        q.setRight(p);
        q = new Node("Romeo y Julieta","William Sheakespeare","WSRJ",true,1001,n,p);
        p.setRight(q);
        p = new Node("El Rey Lear","William Sheakespeare","WSRL",false,0,n,q);
        q.setRight(p);
        q = new Node("Mucho Ruido y Pocas Nueces","William Sheakespeare","WSMRPN",false,0,n,p);
        p.setRight(q);
        p = new Node("Animales Fantasticos","J.K Rowling","JKRAF",false,0,n,q);
        q.setRight(p);
        q = new Node("Harry Potter y la Piedra Filosofal","J.K Rowling","JKRHPPF",false,0,n,p);
        p.setRight(q);
        p = new Node("Harry Potter y la Camara Secreta","J.K Rowling","JKRHPCS",false,0,n,q);
        q.setRight(p);
        q = new Node("Harry Potter y el Prisionero de Azkaban","J.K Rowling","JKRHPPA",false,0,n,p);
        p.setRight(q);
        p = new Node("Harry Potter y el Caliz de Fuego","J.K Rowling","JKRHPCF",false,0,n,q);
        q.setRight(p);
        q = new Node("Harry Potter y la Orden del Fenix","J.K Rowling","JKRHPOF",false,0,n,p);
        p.setRight(q);
        p = new Node("Harry Potter y el Misterio del Principe","J.K Rowling","JKRHPMP",false,0,n,q);
        q.setRight(p);
        q = new Node("La Biblioteca de Babel","Jorge Borges","JBBB",false,0,n,p);
        p.setRight(q);
        p = new Node("El Hacedor","Jorge Borges","JBH",false,0,n,q);
        q.setRight(p);
        q = new Node("El Libro de los Seres Imaginarios","Jorge Borges","JBLSI",true,1003,n,p);
        p.setRight(q);
        p = new Node("El Jardin de Senderos que se Bifurcan","Jorge Borges","JBJSB",false,0,n,q);
        q.setRight(p);
        q = new Node("Funes el Memorioso","Jorge Borges","JBFM",true,1004,n,p);
        p.setRight(q);
        p = new Node("Rayuela","Julio Corazar","JCR",false,0,n,q);
        q.setRight(p);
        q = new Node("Bestiario","Julio Corazar","JCB",false,0,n,p);
        p.setRight(q);
        p = new Node("Modelo para Amar","Julio Corazar","JCMA",true,1003,n,q);
        q.setRight(p);
        q = new Node("Casa Tomada","Julio Corazar","JCCT",false,0,n,p);
        p.setRight(q);
        p = new Node("Final de Juego","Julio Corazar","JCFJ",false,0,n,q);
        q.setRight(p);
        q = new Node("Las Armas Secretas","Julio Corazar","JCAS",false,0,n,p);
        p.setRight(q);
        p = new Node("La Fiesta del Chivo","Mario Vargas Llosa","MVLFC",false,0,n,q);
        q.setRight(p);
        q = new Node("La Ciudad y los Perros","Mario Vargas Llosa","MVLCP",false,0,n,p);
        p.setRight(q);
        p = new Node("La Guerra del Fin del Mundo","Mario Vargas Llosa","MVLGFM",false,0,n,q);
        q.setRight(p);
        q = new Node("La Casa Verde","Mario Vargas Llosa","MVLCV",false,0,n,p);
        p.setRight(q);
        p = new Node("Fisica Universitaria 13° Edición","Sears Zemanky","SZFU13E",false,0,n,q);
        q.setRight(p);
        q = new Node("Calculo Vol.1","Tomas Apostol","TACV1",false,0,n,p);
        p.setRight(q);
        p = new Node("Calculo Vol.2","Tomas Apostol","TACV2",false,0,n,q);
        q.setRight(p);
        q = new Node("El Principito","Edgar Allan Poe","EAPP",false,0,n,p);
        p.setRight(q);
        p = new Node("Los Crimenes en la Calle Morgue","Edgar Allan Poe","EAPCCM",true,1003,n,q);
        q.setRight(p);
        q = new Node("El Corazon Delator","Edgar Allan Poe","EAPCD",false,0,n,p);
        p.setRight(q);
        p = new Node("El Cuervo","Edgar Allan Poe","EAPC",false,0,n,q);
        q.setRight(p);
        q = new Node("La Mascara de la Muerte Roja","Edgar Allan Poe","EAPMMR",true,1002,n,p);
        p.setRight(q);
        p = new Node("It(Eso)","Stephen King","SKI",true,1000,n,q);
        q.setRight(p);
        q = new Node("Carrie","Stephen King","SKC",false,0,n,p);
        p.setRight(q);
        p = new Node("El Resplandor","Stephen King","SKR",true,1002,n,q);
        q.setRight(p);
        q = new Node("La Danza de la Muerte","Stephen King","SKDM",false,0,n,p);
        p.setRight(q);
        p = new Node("El Misterio de Salem's Lot","Stephen King","SKMSL",true,1004,n,q);
        q.setRight(p);
        System.out.println("se creo PTR3");
        
    }
    
}
