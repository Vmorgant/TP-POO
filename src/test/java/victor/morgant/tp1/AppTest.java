package victor.morgant.tp1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	Boubou b=new Boubou("Elodie");
        Chat c=new Chat("Mickey");
        Chien cn=new Chien("Toto");
        Gigapoueteur g=new Gigapoueteur("Axel");
        Zoo z=new Zoo(15);
        Secteur boubouSecteur=new Secteur(TypeAnimal.Boubou); 
        z.secteursAnimaux.add(boubouSecteur);
        Secteur chatSecteur=new Secteur(TypeAnimal.Chat); 
        z.secteursAnimaux.add(chatSecteur);
        Secteur chienSecteur=new Secteur(TypeAnimal.Chien); 
        z.secteursAnimaux.add(chienSecteur);
        Secteur gigapoueteurSecteur=new Secteur(TypeAnimal.Gigapoueteur); 
        z.secteursAnimaux.add(gigapoueteurSecteur);
        z.nouvelAnimal(b);
        z.nouvelAnimal(c);
        z.nouvelAnimal(cn);
        z.nouvelAnimal(g);
    }
}
