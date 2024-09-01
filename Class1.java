
class Class1 extends UserName
{
        JFrame F1;
        int FlagA = -1;
        int FlagS = -1;
        int FlagAOver = 0;
        int TRY=0;
        String S="           ";

        

    //void Log()
    //{
        
    //}
        int MODE = 1;
        JButton P0_Mode = new JButton(" LIGHT MODE ");
        JPanel P0_Mode_Panel = new JPanel(new BorderLayout());
 
        Label Title = new Label(" 3 Star Shopping Mart "); 
        Label Star = new Label("\t\t***");
        Label Test0 = new Label(" ");
        Label Test1 = new Label(" ");
        Label Test2 = new Label(" ");


        Label P2_W0 = new Label(" This Project  ");
        Label P2_W1 = new Label("  is Coded in  ");
        JButton P2_W2 = new JButton("   ~~JAVA~~    ");

        Label P2_E0 = new Label("By 3 Star Team ");
        JButton P2_E1 = new JButton(" ~ NITHYA NARAYANAN ");
        JButton P2_E2 = new JButton(" ~ THAMARAI SELVAN    ");
        JButton P2_E3 = new JButton(" ~ KATHIRVEL          ");
        JButton P2_E4 = new JButton(" ~ MADHESH           ");

        Label TitleFront = new Label(" ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        Label TitleBack = new Label("~ ~ ~ ~ ~ ~ ~ ~  "); 

        String ItemButtonText[] = {" Fruits  ","  Vegitables ","  Books ","  Stationary ","  Bevarages ","  Dress ","  Sports ","  Laptop "," HomeApps ","  Mobiles "};
        
        //Fruits
        int PAGE=0;
        int TotalItem=0;
        String Item00[]     = {" Orange      "," Apple       "," Watermelon  "," Pomegranate "," Mango       "," Grapes      "," Pine        "," Gova        "," Litchi      "," Kirni       "};
        double[] R00 = {140,150,200,130,160,90,70,90,320,120};
        double[] Q00 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price0 = {0,0,0,0,0,0,0,0,0,0};

        //Vegitables
        String Item01[]     = {" Tomato      "," Brinjal     "," Ladiesfinger"," Potato      "," Onion       "," Ginger      "," Garlic      "," Drumstick   "," Cucumber    "," Beans       "};
        double[] R01 = {60,80,70,50,100,90,170,80,70,110};
        double[] Q01 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price1 = {0,0,0,0,0,0,0,0,0,0};

        //Books
        String Item02[]     = {" Mahabharata "," Ramayanam   "," BhagavadGita"," Kuran "," Bible "," Thirukural  "," Manimekalai"," Purananuru"," Agananooru"," WingsOfFire"};
        double[] R02 = {780,690,990,950,140,180,200,240,250,260};
        double[] Q02 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price2 = {0,0,0,0,0,0,0,0,0,0};
        double PriceTotal=0;

        //Stationary
        String Item03[]     = {" Pencil      "," Pen         "," Eraser      "," Sharpener   "," Long scale  "," Marker      "," Writing Pad "," Stick File  "," Paper Clips "," Glue        "};
        double[] R03 = {3,5,2,4,14,23,45,10,6,12};
        double[] Q03 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price3 = {0,0,0,0,0,0,0,0,0,0};

        //Bevarages
        String Item04[]     = {" Bovonto"," Maa Juice "," B Natural","Safal Juice"," VIBRO"," TIGO"," ZYPSY "," ZIMZO "," AmulLassi"," AvinLassi"};
        double[] R04 = {80,30,45,50,40,33,35,40,20,20};
        double[] Q04 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price4 = {0,0,0,0,0,0,0,0,0,0};

        //Dress
        String Item05[]     = {" MenShirt "," MenPant "," BoyShirt "," BoyPant"," Saree "," Chudidar "," WhiteShirt"," Vesti"," ColorShirt"," HandNapkin"};
        double[] R05 = {350,400,250,300,900,400,200,240,250,25};
        double[] Q05 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price5 = {0,0,0,0,0,0,0,0,0,0};

        //Sports
        String Item06[]     = {"Bat","Ball","Stump","FootBall","VollyBall","HockeyBat","HockeyBall","TenniesBat","TenniesBall","SportsCap"};
        double[] R06 = {450,40,100,700,650,430,700,600,50,160};
        double[] Q06 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price6 = {0,0,0,0,0,0,0,0,0,0};

        //Laptop
        String Item07[]     = {"HP Pavilion","HP NoteBook"," MS Surface 1"," MS Surface 2 ","DELL Inspiron","MAC Book "," MacBookPro"," Chromebook "," Cromebook2","ChromeBook3"};
        double[] R07 = {80000,60000,100000,120000,45000,150000,200000,240000,150000,160000};
        double[] Q07 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price7 = {0,0,0,0,0,0,0,0,0,0};

        //Electronics
        String Item08[]     = {" SplitAC"," WindowAC  "," TV LED "," TV LCD "," FridgeD "," FridgeS "," Mixie "," Grinder "," Heater ","  FAN "};
        double[] R08 = {26000,16000,30000,20000,20000,15000,3000,5000,4500,2500};
        double[] Q08 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price8 = {0,0,0,0,0,0,0,0,0,0};

        //Mobiles
        String Item09[]     = {" Galaxy M10 "," Galaxy M20 "," Galaxy A10"," Galaxy A20"," Galaxy S10"," Galaxy S20"," Iphone X"," Iphone Xs"," Iphone 11"," Iphone 11 +"};
        double[] R09 = {9999,11999,14999,19999,24999,29999,49999,59999,99999,129999};
        double[] Q09 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price9 = {0,0,0,0,0,0,0,0,0,0};


        double[] QTemp = {0,0,0,0,0,0,0,0,0,0};
       
        String Price[] =  {" 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"};// Price
        String Quant[] =  {"   ","   ","   ","   ","   ","   ","   ","   ","   ","   ",};
        //String Quant[] =  {"   ","   ","   ","   ","   ","   ","   ","   ","   ","   ",};
               
        String ItemTemp[]       = {" 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"};
        String ItemTempP[]      = {" 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"};

        JButton Page1Cart = new JButton(S+S+" Your Cart "+S+S);
        String Page1Total;

        JLabel[] ACItemName    = new JLabel[20];
        JLabel[] ACIteamQy     = new JLabel[20];
        JLabel[] ACItemTotPric = new JLabel[20];

        JLabel[] L_QTY = new JLabel[12]; // Page2 TextField
        JLabel[] L_Item = new JLabel[12];
        JLabel[] L_Price = new JLabel[12];
        JLabel L_ADD,L_SUB;


        ///Cart Page1 Items Up
        JButton Back = new JButton("Main Page");
        JButton Bill = new JButton("      ");
        JButton Exit = new JButton(" EXIT ");

        JButton B00 = new JButton();
        JButton B01 = new JButton();
        JButton B02 = new JButton();
        JButton B03 = new JButton();
        JButton B04 = new JButton();
        JButton B05 = new JButton();
        JButton B06 = new JButton();
        JButton B07 = new JButton();
        JButton B08 = new JButton();
        JButton B09 = new JButton();

        JButton[] ButtonAdd = new JButton[10];
        JButton[] ButtonSub = new JButton[10];
    
        Label Category;
        Label ThankYou = new Label();
        
        JPanel panel0 = new JPanel(new BorderLayout());
        JPanel P0 = new JPanel(new GridLayout(2, 4, 50, 40));        

        JPanel panel2 = new JPanel(new BorderLayout());
        JPanel panel2ThankYou = new JPanel(new GridLayout(1,3,200,200));
        
        JPanel panel2_WEST = new JPanel(new GridLayout(3,1));
        JPanel panel2_EAST = new JPanel(new GridLayout(5,1));

        JPanel Panel11;
        JPanel Panel12;
        JPanel Panel10;

        JPanel Panel1Bill = new JPanel();
        JPanel Panel1BillList = new JPanel();
        JPanel Panel2BillMemo = new JPanel();
        String PayStringAddCart[]={"   ","   ","   ","   ","   ","   ","   ","   ","   ","   ","   ","   ","   "}; 

        JPanel TitleCenter;

        int C,AC=0;

        Label BillTxt;

        
}
