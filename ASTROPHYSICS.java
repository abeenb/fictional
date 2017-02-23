
package akjdbabd;
//#Shubhaarambh
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class ASTROPHYSICS
{
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader buf = new BufferedReader (read);
    double G = 6.67408e-11;
    String p[]={"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Moon"};
    double m[]={3.30e23,4.87e24,5.97e24,6.42e23,1.90e27,5.68e26,8.68e25,1.02e26,7.35e22};
    double rr[]={2440000,6052000,6378000,3397000,71942000,60268000,25559000,24766000,1738000};
    double c = 299792458;
    int day, month, year, second, minute, hour;
    String dayofw = "";
    PrintWriter pow= new PrintWriter(new BufferedWriter (new FileWriter("ASTRO.txt",true)));
    String name = "";
    public void main() throws IOException
    {
        int a=0;
        while(true)
        {
        int p=0;  
        
        System.out.print('\f');  
        Calendar time = new GregorianCalendar();
        Calendar ca1 = Calendar.getInstance();
        GregorianCalendar date = new GregorianCalendar();   
        day = date.get(Calendar.DAY_OF_MONTH); 
        month = date.get(Calendar.MONTH); 
        year = date.get(Calendar.YEAR);   
        second = date.get(Calendar.SECOND); 
        minute = date.get(Calendar.MINUTE); 
        hour = date.get(Calendar.HOUR);  
        int DOW = time.get(GregorianCalendar.DAY_OF_WEEK);
        String dayofw = "";
        ca1.set(year, month, day);
        java.util.Date d = new java.util.Date(ca1.getTimeInMillis());
        int am_pm = time.get(GregorianCalendar.AM_PM);
        switch(DOW){ //switch statement to translate numeric value of DOW to string value
            case 1: dayofw = "Sunday";
            break;
            case 2: dayofw = "Monday";
            break;
            case 3: dayofw = "Tuesday";
            break;
            case 4: dayofw = "Wednesday";
            break;
            case 5: dayofw = "Thursday";
            break;
            case 6: dayofw = "Friday";
            break;
            case 7: dayofw = "Saturday";
            break;

        }
        if (hour == 0){
            hour = 12;
        }
        System.out.println("Today is a " + dayofw);
        if(day==1)
            System.out.println("Current date is "+day+"st "+new SimpleDateFormat("MMMM").format(d)+","+year);
        else if(day==2)
            System.out.println("Current date is "+day+"nd "+new SimpleDateFormat("MMMM").format(d)+","+year);
        else if(day==3)
            System.out.println("Current date is "+day+"rd "+new SimpleDateFormat("MMMM").format(d)+","+year);
        else
            System.out.println("Current date is "+day+"th "+new SimpleDateFormat("MMMM").format(d)+","+year); 

        switch (am_pm) {
            case  Calendar.AM:
            System.out.println("Time Of Logging In is "+hour+" : "+minute+" : "+second + " A.M");
            break;
            default:
            System.out.println("Time Of Logging In is "+hour+" : "+minute+" : "+second + " P.M");
            break;

        } 
        System.out.println("*******************          AstroClinic             *****************");
        System.out.println("*******************     Welcome To AstroClinic       *****************");
        System.out.println("*******************       ENJOY YOUR VISIT           *****************");
        
        
         System.out.println();
            System.out.println("1. To Calculate the time you lose if you are travelling at a particular speed");
            System.out.println("(Using Einstein's Theory of Relativity)");
            System.out.println ("2. To Calculate your mass on any planet");
            System.out.println("3.To Calculate the focal length or object distance or image distance of a lens");
            System.out.println("4.To Calculate the focal length or object distance or image distance of a mirror");
            System.out.println("5.To Know More About Worm Holes, Black Holes , Dark Matter Etc.");
            System.out.println("6.To Enter your feedback");
            System.out.println("7.To Exit");
            try
            {
                a =Integer.parseInt(buf.readLine());
                if(a>7||a<=0)
                {
                    System.out.print('\f');
                    throw new Exception ("Error");
                }
                break;
            }     
            catch(Exception e)
            {System.out.print('\f');}
        }
        Loading();
        switch(a)
        {
            case 1:Rel();break;
            case 2:mass();break;
            case 3:lens();break;
            case 4:mirror();break;
            case 5:info(); break;
            case 6:feed();break;
            case 7:pow.close();feed();Bye();System.exit(0);
            default:System.out.println("ERROR");
        }
    }

    public void mass()throws IOException
    {
        System.out.print('\f');
        int aa=0;
        while(true)
        {
            System.out.println("Enter Your Weight on Earth");

            try
            {
                aa =Integer.parseInt(buf.readLine());
                if(aa<0)
                {
                    throw new Exception ("Error");
                }
                break;
            }     
            catch(Exception e)
            {System.out.print('\f');}
        }
        int bb=0;
        System.out.print('\f');
        while(true)
        {
            System.out.println("Enter the respective Number");
            System.out.println("1.Mercury");
            System.out.println("2.Venus");
            System.out.println("3.Earth");
            System.out.println("4.Mars");
            System.out.println("5.Jupiter");
            System.out.println("6.Saturn");
            System.out.println("7.Uranus");
            System.out.println("8.Neptune");
            System.out.println("9.Moon");
            System.out.println("10.A PLANET OF YOUR IMAGINATION");
            System.out.println("11.To go back to previous menu");

            try
            {
                bb =Integer.parseInt(buf.readLine());
                if(bb<=0||bb>11)
                {
                    throw new Exception ("Error");
                }
                break;
            }     
            catch(Exception e)
            {System.out.print('\f');}
        }
        double mmm=0;
        if(bb==10)
        {
            while(true)
            {
                System.out.println("Enter the mass of your planet");

                try
                {
                    mmm =Double.parseDouble(buf.readLine());
                    if(mmm<0)
                    {
                        throw new Exception ("Error");
                    }
                    break;
                }     
                catch(Exception e)
                {System.out.print('\f');}
            }
            double r=0;
            while(true)
            {
                System.out.println("Enter the radius of your planet");

                try
                {
                    r =Double.parseDouble(buf.readLine());
                    if(r<0)
                    {
                        throw new Exception ("Error");
                    }
                    break;
                }     
                catch(Exception e)
                {System.out.print('\f');}
            }
            System.out.print('\f');
            System.out.println("Your mass on planet "+name+" is "+((G*mmm*aa)/(r*r)/10));
        }
        else if(bb==3)
        {
            System.out.println("Mass on Earth is "+aa+" Kgf");
        }
        else
        {
            System.out.print('\f');System.out.println("Your mass on "+p[bb-1]+" is "+((G*m[bb-1]*aa)/(rr[bb-1]*rr[bb-1]*10))+" Kgf");
        }
        while(true)
            {
                System.out.println("Would you like to see the Menu again...(Y/N).. ");
                char kch=buf.readLine().charAt(0);
                if(kch=='Y' || kch=='y')
                    main();
                else if(kch=='N' || kch=='n')
                {feed();Bye() ;return; }
                else
                    continue;
            }
    }

    public void Rel()throws IOException
    {
        System.out.print('\f');
        double v=0;
        while(true)
        {
            System.out.println("Enter the speed you are travelling at");

            try
            {
                v =Double.parseDouble(buf.readLine());
                if(v<0)
                {

                    throw new Exception ("Error");

                }
                if(v>c){System.out.print('\f');System.out.println("Sorry. Nothing Travels Faster than the speed of Light");continue;}
                break;
            }     
            catch(Exception e)
            {System.out.print('\f');}
        }
        System.out.print('\f');
        System.out.println("One Hour with your speed will be equivalent to "+(1.0/(Math.sqrt(1-(v*v)/(c*c))))+" hours on th Earth");
        while(true)
            {
                System.out.println("Would you like to see the Menu again...(Y/N).. ");
                char kch=buf.readLine().charAt(0);
                if(kch=='Y' || kch=='y')
                    main();
                else if(kch=='N' || kch=='n')
                {feed();Bye() ;return; }
                else
                    continue;
            }
    }

    public void lens()throws IOException
    {
        int ch=0;
        System.out.print('\f');
        while(true)
        {
            System.out.println("What Do you want to calculate");
            System.out.println("1.Focal Length");
            System.out.println("2.Image Distance");
            System.out.println("3.Object Distance");
            try
            {
                ch =Integer.parseInt(buf.readLine());
                if(ch<0||ch>3)
                {
                    throw new Exception ("Error");
                }
                break;
            }     
            catch(Exception e)
            {System.out.print('\f');}
        }
        switch(ch)
        {
            case 1:
            double id=0; double od = 0;
            while(true)
            {
                System.out.println("Enter the Image Distance");

                try
                {
                    id =Double.parseDouble(buf.readLine());
                    if(id<0)
                    {
                        throw new Exception ("Error");
                    }
                    break;
                }     
                catch(Exception e)
                {System.out.print('\f');}
            }
            while(true)
            {
                System.out.println("Enter the Object Distance");

                try
                {
                    od =Double.parseDouble(buf.readLine());
                    if(od<0)
                    {
                        throw new Exception ("Error");
                    }
                    break;
                }     
                catch(Exception e)
                {System.out.print('\f');}
            }
            System.out.println("The Focal Length is "+( (id*od)/(id+od)));
            break;
            case 2:
            double fd=0; double od1 = 0;
            while(true)
            {
                System.out.print('\f');
                System.out.println("Enter the Focal Length");

                try
                {
                    fd =Double.parseDouble(buf.readLine());
                    if(fd<0)
                    {
                        throw new Exception ("Error");
                    }
                    break;
                }     
                catch(Exception e)
                {System.out.print('\f');}
            }
            while(true)
            {
                System.out.println("Enter the Object Distance");

                try
                {
                    od1 =Double.parseDouble(buf.readLine());
                    if(od1<0)
                    {
                        throw new Exception ("Error");
                    }
                    break;
                }     
                catch(Exception e)
                {System.out.print('\f');}
            }
            System.out.print('\f');
            System.out.println("The Image Distance is "+( (fd*od1)/(od1-fd)));
            break;
            case 3:
            double fd1=0; double id1 = 0;
            while(true)
            {
                System.out.print('\f');
                System.out.println("Enter the Focal Length");

                try
                {
                    fd1 =Double.parseDouble(buf.readLine());
                    if(fd1<0)
                    {
                        throw new Exception ("Error");
                    }
                    break;
                }     
                catch(Exception e)
                {}
            }
            while(true)
            {
                System.out.println("Enter the Image Distance");

                try
                {
                    id1 =Double.parseDouble(buf.readLine());
                    if(id1<0)
                    {
                        throw new Exception ("Error");
                    }
                    break;
                }     
                catch(Exception e)
                {}
            }
            System.out.print('\f');
            System.out.println("The Object Distance is "+( (fd1*id1)/(id1-fd1)));
            break;
            default:
            System.out.println("Error");
        }
        while(true)
            {
                System.out.println("Would you like to see the Menu again...(Y/N).. ");
                char kch=buf.readLine().charAt(0);
                if(kch=='Y' || kch=='y')
                    main();
                else if(kch=='N' || kch=='n')
                {feed();Bye() ;return; }
                else
                    continue;
            }
    }

    public void mirror()throws IOException
    {
        int ch=0;
        while(true)
        {
            System.out.print('\f');
            System.out.println("What Do you want to calculate");
            System.out.println("1.Focal Length");
            System.out.println("2.Image Distance");
            System.out.println("3.Object Distance");
            try
            {
                ch =Integer.parseInt(buf.readLine());
                if(ch<0||ch>3)
                {
                    throw new Exception ("Error");
                }
                break;
            }     
            catch(Exception e)
            {System.out.print('\f');}
        }
        switch(ch)
        {
            case 1:
            double id=0; double od = 0;
            System.out.print('\f');
            while(true)
            {
                System.out.println("Enter the Image Distance");

                try
                {
                    id =Double.parseDouble(buf.readLine());
                    if(id<0)
                    {
                        throw new Exception ("Error");
                    }
                    break;
                }     
                catch(Exception e)
                {System.out.print('\f');}
            }
            while(true)
            {
                System.out.println("Enter the Object Distance");

                try
                {
                    od =Double.parseDouble(buf.readLine());
                    if(od<0)
                    {
                        throw new Exception ("Error");
                    }
                    break;
                }     
                catch(Exception e)
                {System.out.print('\f');}
            }
            System.out.print('\f');
            System.out.println("The Focal Length is "+( (id*od)/(od-id)));
            break;
            case 2:
            System.out.print('\f');
            double fd=0; double od1 = 0;
            while(true)
            {
                System.out.println("Enter the Focal Length");

                try
                {
                    fd =Double.parseDouble(buf.readLine());
                    if(fd<0)
                    {
                        throw new Exception ("Error");
                    }
                    break;
                }     
                catch(Exception e)
                {System.out.print('\f');}
            }
            while(true)
            {
                System.out.println("Enter the Object Distance");

                try
                {
                    od1 =Double.parseDouble(buf.readLine());
                    if(od1<0)
                    {
                        throw new Exception ("Error");
                    }
                    break;
                }     
                catch(Exception e)
                {System.out.print('\f');}
            }
            System.out.print('\f');
            System.out.println("The Image Distance is "+( (fd*od1)/(od1+fd)));
            break;
            case 3:
            System.out.print('\f');
            double fd1=0; double id1 = 0;
            while(true)
            {
                System.out.println("Enter the Focal Length");

                try
                {
                    fd1 =Double.parseDouble(buf.readLine());
                    if(fd1<0)
                    {
                        throw new Exception ("Error");
                    }
                    break;
                }     
                catch(Exception e)
                {System.out.print('\f');}
            }
            while(true)
            {
                System.out.println("Enter the Image Distance");

                try
                {
                    id1 =Double.parseDouble(buf.readLine());
                    if(id1<0)
                    {
                        throw new Exception ("Error");
                    }
                    break;
                }     
                catch(Exception e)
                {System.out.print('\f');}
            }
            System.out.print('\f');
            System.out.println("The Object Distance is "+( (fd1*id1)/(fd1-id1)));
            break;
            default:
            System.out.println("Error");
        }
        while(true)
            {
                System.out.println("Would you like to see the Menu again...(Y/N).. ");
                char kch=buf.readLine().charAt(0);
                if(kch=='Y' || kch=='y')
                    main();
                else if(kch=='N' || kch=='n')
                {feed();Bye() ;return; }
                else
                    continue;
            }
    }

    public void info()throws IOException
    {
        System.out.print('\f');
        int ch=0;
        while(true)
        {
            System.out.println("What do you want to know about?");
            System.out.println("1.Black Holes");
            System.out.println("2.Worm Holes");
            System.out.println("3.Dark Matter");
            System.out.println("4.Gravity");
            System.out.println("5.The Best Theory On Multiple Universes");
            System.out.println ("Did Not Find What you are looking for? Don't Worry. We Will Update it. \n6.To Enter what you want to know. we will add it soon");
            try
            {
                ch =Integer.parseInt(buf.readLine());
                if(ch<0||ch>6)
                {
                    throw new Exception ("Error");
                }
                break;
            }     
            catch(Exception e)
            {System.out.print('\f');}
        }
        System.out.print('\f');
        switch(ch)
        {
            case 1: System.out.println("A black hole is a geometrically defined region of spacetime exhibiting such strong gravitational effects that nothing—including particles and electromagnetic radiation such as light—can escape from inside it.[1] The theory of general relativity predicts that a sufficiently compact mass can deform spacetime to form a black hole.[2][3] The boundary of the region from which no escape is possible is called the event horizon. Although crossing the event horizon has enormous effect on the fate of the object crossing it, it appears to have no locally detectable features. In many ways a black hole acts like an ideal black body, as it reflects no light.[4][5] Moreover, quantum field theory in curved spacetime predicts that event horizons emit Hawking radiation, with the same spectrum as a black body of a temperature inversely proportional to its mass. This temperature is on the order of billionths of a kelvin for black holes of stellar mass, making it essentially impossible to observe.\nObjects whose gravitational fields are too strong to allow light to escape were first considered in the 18th century by John Michell and Pierre-Simon Laplace. The first modern solution of general relativity that would characterize a black hole was found by Karl Schwarzschild in 1916, although its interpretation as a region of space from which nothing can escape was first published by David Finkelstein in 1958. Black holes were  considered a mathematical curiosity; it was during the 1960s that theoretical work showed they were a generic prediction of general relativity. The discovery of neutron stars sparked interest in gravitationally collapsed compact objects as a possible astrophysical reality.\nBlack holes of stellar mass are expected to form when very massive stars collapse at the end of their life cycle. After a black hole has formed, it can continue to grow by absorbing mass from its surroundings. By absorbing other stars and merging with other black holes, supermassive black holes of millions of solar masses (M☉) may form. There is general consensus that supermassive black holes exist in the centers of most galaxies.\nDespite its invisible interior, the presence of a black hole can be inferred through its interaction with other matter and with electromagnetic radiation such as visible light. Matter falling onto a black hole can form an accretion disk heated by friction, forming some of the brightest objects in the universe. If there are other stars orbiting a black hole, their orbit can be used to determine its mass and location. Such observations can be used to exclude possible alternatives (such as neutron stars). In this way, astronomers have identified numerous stellar black hole candidates in binary systems, and established that the radio source known as Sagittarius A*, at the core of our own Milky Way galaxy, contains a supermassive black hole of about 4.3 million solar masses.");
                    break;
            case 2:System.out.println("A wormhole or Einstein-Rosen Bridge is a hypothetical topological feature that would fundamentally be a shortcut connecting two separate points in spacetime. A wormhole, in theory, might be able to connect extremely far distances such as a billion light years or more, short distances such as a few feet, different universes, and different points in time. A wormhole is much like a tunnel with two ends, each at separate points in spacetime.\nFor a simplified notion of a wormhole, space can be visualized as a two-dimensional (2D) surface. In this case, a wormhole would appear as a hole in that surface, lead into a 3D tube (the inside surface of a cylinder), then re-emerge at another location on the 2D surface with a hole similar to the entrance. An actual wormhole would be analogous to this, but with the spatial dimensions raised by one. For example, instead of circular holes on a 2D plane, the entry and exit points could be visualized as spheres in 3D space.");
                    break;
            case 3:System.out.println("Dark matter is a hypothetical kind of matter that cannot be seen with telescopes but accounts for most of the matter in the universe. The existence and properties of dark matter are inferred from its gravitational effects on visible matter, on radiation, and on the large-scale structure of the universe. Dark matter has not been detected directly, making it one of the greatest mysteries in modern astrophysics.\nDark matter neither emits nor absorbs light or any other electromagnetic radiation at any significant level. According to the Planck mission team, and based on the standard model of cosmology, the total mass–energy of the known universe contains 4.9% ordinary (baryonic) matter, 26.8% dark matter and 68.3% dark energy.[2][3] Thus, dark matter is estimated to constitute 84.5%[note 1] of the total matter in the universe, while dark energy plus dark matter constitute 95.1% of the total mass–energy content of the universe.[4][5][6]\nAstrophysicists hypothesized the existence of dark matter to account for discrepancies between the mass of large astronomical objects determined from their gravitational effects, and their mass as calculated from the observable matter (stars, gas, and dust) that they can be seen to contain. Their gravitational effects suggest that their masses are much greater than the observable matter survey suggests.\nDark matter was postulated by Jan Oort in 1932, albeit based upon insufficient evidence, to account for the orbital velocities of stars in the Milky Way. In 1933, Fritz Zwicky was the first to use the virial theorem to infer the existence of unseen matter, which he referred to as dunkle Materie 'dark matter'.[7] More robust evidence from galaxy rotation curves was discovered by Horace W. Babcock in 1939, but was not attributed to dark matter. The first hypothesis to postulate dark matter based upon robust evidence was formulated by Vera Rubin and Kent Ford in the 1960s–1970s, using galaxy rotation curves.[8][9] Subsequently, many other observations have indicated the presence of dark matter in the universe, including gravitational lensing of background objects by galaxy clusters such as the Bullet Cluster, the temperature distribution of hot gas in galaxies and clusters of galaxies and, more recently, the pattern of anisotropies in the cosmic microwave background. According to consensus among cosmologists, dark matter is composed primarily of a not yet characterized type of subatomic particle.[10][11] The search for this particle, by a variety of means, is one of the major efforts in particle physics today.[12]\nAlthough the existence of dark matter is generally accepted by the mainstream scientific community, some alternative theories of gravity have been proposed, such as MOND and TeVeS, which try to account for the anomalous observations without requiring additional matter. However, these theories cannot account for the properties of galaxy clusters.[13");
                   break;
            case 4:System.out.println("Gravity or gravitation is a natural phenomenon by which all things with energy are brought towards (or 'gravitate' towards) one another, including stars, planets, galaxies and even light and sub-atomic particles. Gravity is responsible for the complexity in the universe, by creating spheres of hydrogen — where hydrogen fuses under pressure to form stars — and grouping them into galaxies. Without gravity, the universe would be an uncomplicated one, existing without thermal energy and composed only of equally spaced particles[citation needed]. On Earth, gravity gives weight to physical objects and causes the tides. Gravity has an infinite range, although its effects become increasingly weaker on farther objects.\nGravity is most accurately described by the general theory of relativity (proposed by Albert Einstein in 1915) which describes gravity, not as a force, but as a consequence of the curvature of spacetime caused by the uneven distribution of mass/energy; and resulting in time dilation, where time lapses more slowly in strong gravitation. However, for most applications, gravity is well approximated by Newton's law of universal gravitation, which postulates that gravity is a force where two bodies of mass are directly drawn (or 'attracted') to each other according to a mathematical relationship, where the attractive force is proportional to the product of their masses and inversely proportional to the square of the distance between them. This is considered to occur over an infinite range, such that all bodies (with mass) in the universe are drawn to each other no matter how far they are apart.\nGravity is the weakest of the four fundamental interactions of nature. The gravitational attraction is approximately 10−38 times the strength of the strong force (i.e. gravity is 38 orders of magnitude weaker), 10−36 times the strength of the electromagnetic force, and 10−29 times the strength of the weak force. As a consequence, gravity has a negligible influence on the behavior of sub-atomic particles, and plays no role in determining the internal properties of everyday matter (but see quantum gravity). On the other hand, gravity is the dominant interaction at the macroscopic scale, and is the cause of the formation, shape, and trajectory (orbit) of astronomical bodies. It is responsible for various phenomena observed on Earth and throughout the universe; for example, it causes the Earth and the other planets to orbit the Sun, the Moon to orbit the Earth, the formation of tides, and the formation and evolution of galaxies, stars and the Solar System.\nIn pursuit of a theory of everything, the merging of general relativity and quantum mechanics (or quantum field theory) into a more general theory of quantum gravity has become an area of research.");
                   break;
            case 5:System.out.println("The many-worlds interpretation is an interpretation of quantum mechanics that asserts the objective reality of the universal wavefunction and denies the actuality of wavefunction collapse. Many-worlds implies that all possible alternate histories and futures are real, each representing an actual world (or universe). In lay terms, the hypothesis states there is a very large—perhaps infinite[2]—number of universes, and everything that could possibly have happened in our past, but did not, has occurred in the past of some other universe or universes. The theory is also referred to as MWI, the relative state formulation, the Everett interpretation, the theory of the universal wavefunction, many-universes interpretation, or just many-worlds.\nThe original relative state formulation is due to Hugh Everett in 1957.[3][4] Later, this formulation was popularized and renamed many-worlds by Bryce Seligman DeWitt in the 1960s and 1970s.[1][5][6][7] The decoherence approaches to interpreting quantum theory have been further explored and developed,[8][9][10] becoming quite popular. MWI is one of many multiverse hypotheses in physics and philosophy. It is currently considered a mainstream interpretation along with the other decoherence interpretations, collapse theories (including the historical Copenhagen interpretation),[11] and hidden variable theories such as the Bohmian mechanics.\nBefore many-worlds, reality had always been viewed as a single unfolding history. Many-worlds, however, views reality as a many-branched tree, wherein every possible quantum outcome is realised.[12] Many-worlds reconciles the observation of non-deterministic events, such as random radioactive decay, with the fully deterministic equations of quantum physics.\nIn many-worlds, the subjective appearance of wavefunction collapse is explained by the mechanism of quantum decoherence, and this is supposed to resolve all of the correlation paradoxes of quantum theory, such as the EPR paradox[13][14] and Schrödinger's cat,[1] since every possible outcome of every event defines or exists in its own history or world.");
                   break;
            case 6:System.out.println("Enter What you want to know about");
                   pow.println("Update :"+buf.readLine());
                   break;
        }
        while(true)
            {
                System.out.println("Would you like to see the Menu again...(Y/N).. ");
                char kch=buf.readLine().charAt(0);
                if(kch=='Y' || kch=='y')
                    main();
                else if(kch=='N' || kch=='n')
                {feed();Bye() ;return; }
                else
                    continue;
            }
    }
    public void mainmenu()throws IOException
    {
        System.out.print("T");STIME();
        System.out.print("h");STIME();
        System.out.print("i");STIME();
        System.out.print("s");STIME();
        System.out.print(" ");STIME();
        System.out.print("I");STIME();
        System.out.print("s");STIME();
        System.out.print(" ");STIME();
        System.out.print("A");STIME();
        System.out.print(" ");STIME();
        System.out.print("P");STIME();
        System.out.print("r");STIME();
        System.out.print("o");STIME();
        System.out.print("j");STIME();
        System.out.print("e");STIME();
        System.out.print("c");STIME();
        System.out.print("t");STIME();
        System.out.print(" ");STIME();
        System.out.print("O");STIME();
        System.out.print("n");STIME();
        System.out.print(" ");STIME();
        System.out.print("A");STIME();
        System.out.print("s");STIME();
        System.out.print("t");STIME();
        System.out.print("r");STIME();
        System.out.print("o");STIME();
        System.out.print("p");STIME();
        System.out.print("h");STIME();
        System.out.print("y");STIME();
        System.out.print("s");STIME();
        System.out.print("i");STIME();
        System.out.print("c");STIME();
        System.out.print("s");STIME();
        System.out.print(".");STIME();
        System.out.print("");STIME();
        System.out.print("");STIME();
        System.out.print("");STIME();
        System.out.print("");STIME();
        System.out.print("");STIME();
        System.out.print(".");STIME();
        System.out.println();
        System.out.println("                ASTROPHYSICS LTD                ");  
        System.out.println("   Abeen Bhattacharya         Dhruv Mehendiratta   " ) ;
        System.out.println("   Anviksha Gupta             Harsh Gupta  " ) ;
        System.out.println("   Shivani Srivastava         Ananya Sahoo   " ) ;
        time();
        System.out.print('\f');

        mainMenu();
    }
    public void STIME()
    {
        int k = 0 ;
        for (int i = 0 ; i<=10000000;i++)
        {
            if (i%10000000==0)k++;if(k==99)break;
        };
    }
    
    public void time()
    {
        for(double i=0;i<100000000;i++)
        {
            ;
        }
    }
    
    
    public void mainMenu()throws IOException
    {
        int choice;
        mainMenu:
        while(true)
        {
            do
            {
                try
                {
                    System.out.print("W");STIME();
                    System.out.print("e");STIME();
                    System.out.print("l");STIME();
                    System.out.print("c");STIME();
                    System.out.print("o");STIME();
                    System.out.print("m");STIME();
                    System.out.print("e");STIME();
                    System.out.print(" ");STIME();
                    System.out.print("T");STIME();
                    System.out.print("O");STIME();
                    System.out.print(" ");STIME();
                    System.out.print("A");STIME();
                    System.out.print("s");STIME();
                    System.out.print("t");STIME();
                    System.out.print("r");STIME();
                    System.out.print("o");STIME();
                    System.out.print("C");STIME();
                    System.out.print("l");STIME();
                    System.out.print("i");STIME();
                    System.out.print("n");STIME();
                    System.out.print("i");STIME();
                    System.out.print("c");STIME();
                    System.out.print(".");STIME();
                    System.out.print("");STIME();
                    System.out.print("");STIME();
                    System.out.print("");STIME();
                    System.out.print("");STIME();
                    System.out.print(".");

                    System.out.println("\n1.To Enter The Astroclinic");
                    System.out.println("2.To Go Home");
                    choice=Integer.parseInt(buf.readLine());
                }
                catch(NumberFormatException obj)
                {
                    System.out.println("Please enter digits only(1 or 2)");
                    continue;
                }

                break;
            }while(true);

            switch(choice)
            {
                case 1:
                main ();
                break;
                case 2:
                feed();Bye();
                pow.close();
                System.exit(0);
                default:
                System.out.println("Please enter a valid choice...");

            }

            Would();

        }
    }//end of mainMenu()
    
    public void Would()throws IOException
    {

        for(;true;)
        {
            System.out.println("Would you like to continue? ");
            System.out.println("Enter yes or no");
            String s=buf.readLine();

            if(s.toLowerCase().equals("no"))
            {
                System.out.print('\f');
                feed();Bye();
                time();
                pow.close();
                System.exit(0);

            }
            else if(s.toLowerCase().equals("yes"))
            {    
                break;
            }
            else
            {
                System.out.println("Wrong choice \nEnter again");
                continue;
            }
        }

    }
    
    public void Bye()throws IOException
    {
        System.out.print('\f');
        Calendar time = new GregorianCalendar();
        Calendar ca1 = Calendar.getInstance();
        GregorianCalendar date = new GregorianCalendar();   
        day = date.get(Calendar.DAY_OF_MONTH); 
        month = date.get(Calendar.MONTH); 
        year = date.get(Calendar.YEAR);   
        second = date.get(Calendar.SECOND); 
        minute = date.get(Calendar.MINUTE); 
        hour = date.get(Calendar.HOUR);  
        ca1.set(year, month, day);
        java.util.Date d = new java.util.Date(ca1.getTimeInMillis());
        int am_pm = time.get(GregorianCalendar.AM_PM);
        switch (am_pm) {
            case  Calendar.AM:
            System.out.println("Time Of Logging Out is "+hour+" : "+minute+" : "+second + " A.M");
            break;
            default:
            System.out.println("Time Of Logging Out is "+hour+" : "+minute+" : "+second + " P.M");
            break;

        } 
        System.out.println ();
        System.out.println ();
        System.out.println ();
        System.out.println ();
        System.out.println ();
        System.out.println ("Thank You For Your Precious Time");
        System.out.println ();
        System.out.println ("Hope You Give Us Another Chance To Serve You Again");
        System.out.println ();
        System.out.println (" Bye! Stay Educated!");
        pow.close();
        System.exit(0);
    }
     public void Loading()
    {
        System.out.print('\f');
        System.out.print("Loading ");int k = 0;
        for (int n=0 ; true ; n++)
        {
            if (n%99999999==0){System.out.print(" . "); k++;}
            if(k%4==0) break;
        }
        System.out.print('\f');
    }
    public ASTROPHYSICS()throws IOException
    {
        System.out.print('\f');
        System.out.println("What is your Name");
        name = buf.readLine();
        pow.println(name);  
        System.out.print('\f');
        mainmenu();
        
    }
    public void feed()throws IOException
    {
        System.out.print('\f');
        System.out.println("Enter Feedback");
        pow.println("FEEDBACK: "+buf.readLine());
        while(true)
            {
                System.out.println("Would you like to see the Menu again...(Y/N).. ");
                char kch=buf.readLine().charAt(0);
                if(kch=='Y' || kch=='y')
                    main();
                else if(kch=='N' || kch=='n')
                {Bye() ;return; }
                else
                    continue;
            }
    }
    }
