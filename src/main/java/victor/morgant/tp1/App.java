package victor.morgant.tp1;

public class App 
{
    public static void main( String[] args )
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

