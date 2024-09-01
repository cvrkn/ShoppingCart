
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.xml.namespace.QName;
import java.net.*;
import javax.swing.border.EmptyBorder;
public class Shopping extends Class1
{   
    public static void main(String args[])
    {
        Boolean UserFlag = false;
        Class1 L1 = new Class1();
        
        UserFlag=L1.LogIn();
        //if(UserFlag)
        new Shopping()       
    }
    public Shopping()
    {
        //******************************* */
        F = new JFrame();
        //++JFrame F2 = new JFrame();
        F.setLayout(new BorderLayout()); 
        F.add(panel0,BorderLayout.CENTER);
        F.add(Bill,BorderLayout.SOUTH);
        //F.setVisible(true);
        F.setSize(1300, 800);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //******************************* */

        //F1.add(panel0);
        Page1Total=" ";

        //**************Category***************** */
        panel0.setBorder(new EmptyBorder(30, 40, 200, 30));
        panel0.setBackground(Color.DARK_GRAY);

        P0.setFont(new Font("Arial", Font.BOLD, 25));
        P0.setBackground(Color.DARK_GRAY);

        //P0_Mode.setBorder(new EmptyBorder(20, 30, 20, 30));
        P0_Mode_Panel.add(P0_Mode,BorderLayout.EAST);
        P0_Mode_Panel.setBackground(Color.DARK_GRAY);
        
        //P0_Mode.setBounds(10,10,5,5);
        panel0.add(P0_Mode_Panel,BorderLayout.NORTH);
        panel0.add(P0,BorderLayout.SOUTH);
        ADDPage0();
        //**************END-Category***************** */
        
        Panel1BillList.setLayout(new GridBagLayout());
        Panel1BillList.setBorder(new EmptyBorder(100, 10, 20, 30));

        Panel2BillMemo.setLayout(new GridBagLayout());
        Panel2BillMemo.setBorder(new EmptyBorder(40, 200, 5, 200));

        TITLE();
        Page1();
        ButtonPress();
        
    }
    
//==========================================================================
    void Page1Layout()
    {
        PAGE=1;
        //******************************* */ items and qty show
        Panel11 = new JPanel(new GridBagLayout());
        Panel11.setBorder(new EmptyBorder(5, 200, 5, 150));
        //******************************* */


        //******************************* */
        Panel12 = new JPanel(new GridLayout(1,3,200,300)); //for back, catogory name
        Panel12.setBorder(new EmptyBorder(10, 10, 10, 10));
        //******************************* */


        //*************Page 1** Your Cart****************** */
        Panel1Bill.setLayout(new BorderLayout());  
        Panel1Bill.setBorder(new EmptyBorder(10, 5, 20, 30));
        Panel1Bill.add(Page1Cart,BorderLayout.NORTH);
        //******************************* */

        if(MODE%2==0)
        {
            Panel11.setBackground(Color.LIGHT_GRAY);
            Panel12.setBackground(Color.LIGHT_GRAY);
            Panel1Bill.setBackground(Color.LIGHT_GRAY);
        }
        else
        {
            Panel11.setBackground(Color.DARK_GRAY);
            Panel12.setBackground(Color.DARK_GRAY);
            Panel1Bill.setBackground(Color.DARK_GRAY);
        }
        
        //******************************* */
        for(int x = 0; x< 20;x++)
        {
            ACItemName[x]    = new JLabel("   ");//.setText("   ");
            ACIteamQy[x]     = new JLabel("   ");//.setText("   ");
            ACItemTotPric[x] = new JLabel("  ");//.setText("   ");
        }
        //******************************* */

        //******************************* */
        Panel10 = new JPanel(new BorderLayout());
        Panel10.add(Panel12,BorderLayout.NORTH);
        Panel10.add(Panel11,BorderLayout.CENTER);//, BorderLayout.CENTER);   //Panel
        Panel10.add(Panel1Bill,BorderLayout.EAST);//******* */
        //******************************* */


        //******************************* */
        Panel1Bill.add(Panel1BillList,BorderLayout.CENTER);
        Page1AddCart();
        AddToBill();
        //******************************* */


        Category=new Label("\t\t\t\t"+ItemButtonText[C]); 
        if(MODE%2==0)
        {
            Category.setForeground(Color.BLACK);
            Star.setForeground(Color.BLACK);
        }
        else
        {
            Category.setForeground(Color.WHITE);
            Star.setForeground(Color.WHITE);
        }
        Panel12.setFont(new Font("Arial", Font.BOLD, 35));
        Panel12.add(Back);
        Panel12.add(Category);
        Panel12.add(Star);
        

        F.add(Panel10,BorderLayout.CENTER);


        Back.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {   PAGE=0;
                QTempToQ();
                Panel10.setVisible(false);
                Bill.setVisible(true);
            }  
        }); 
        ADDPage1();
        Bill.setVisible(true);
    }

    void PageBill()
    {
        if(MODE%2==0)
        {

            panel2ThankYou.setBackground(Color.LIGHT_GRAY);
            panel2.setBackground(Color.LIGHT_GRAY);
            P2_W0.setBackground(Color.LIGHT_GRAY);
            P2_W1.setBackground(Color.LIGHT_GRAY);
            P2_W2.setBackground(Color.LIGHT_GRAY);
            P2_E0.setBackground(Color.LIGHT_GRAY);
            P2_E1.setBackground(Color.LIGHT_GRAY);
            P2_E2.setBackground(Color.LIGHT_GRAY);
            P2_E3.setBackground(Color.LIGHT_GRAY);
            P2_E4.setBackground(Color.LIGHT_GRAY);
            panel2_EAST.setBackground(Color.LIGHT_GRAY);
            panel2_WEST.setBackground(Color.LIGHT_GRAY);
            Panel1BillList.setBackground(Color.GRAY);
            Panel2BillMemo.setBackground(Color.GRAY);

            Panel2BillMemo.setForeground(Color.BLACK);
            ThankYou.setForeground(Color.BLACK);
            P2_W0.setForeground(Color.BLUE);
            P2_W1.setForeground(Color.BLUE);
            P2_W2.setForeground(Color.BLUE);
            P2_E0.setForeground(Color.BLUE);
            P2_E1.setForeground(Color.BLUE);
            P2_E2.setForeground(Color.BLUE);
            P2_E3.setForeground(Color.BLUE);
            P2_E4.setForeground(Color.BLUE);
        }
        else
        {
            panel2ThankYou.setBackground(Color.DARK_GRAY);
            panel2.setBackground(Color.DARK_GRAY);
            P2_W0.setBackground(Color.DARK_GRAY);
            P2_W1.setBackground(Color.DARK_GRAY);
            P2_W2.setBackground(Color.DARK_GRAY);
            P2_E0.setBackground(Color.DARK_GRAY);
            P2_E1.setBackground(Color.DARK_GRAY);
            P2_E2.setBackground(Color.DARK_GRAY);
            P2_E3.setBackground(Color.DARK_GRAY);
            P2_E4.setBackground(Color.DARK_GRAY);
            panel2_EAST.setBackground(Color.DARK_GRAY);
            panel2_WEST.setBackground(Color.DARK_GRAY);
            Panel1BillList.setBackground(Color.LIGHT_GRAY);
            Panel2BillMemo.setBackground(Color.LIGHT_GRAY);

            Panel2BillMemo.setForeground(Color.BLACK);
            ThankYou.setForeground(Color.WHITE);
            P2_W0.setForeground(Color.CYAN);
            P2_W1.setForeground(Color.CYAN);
            P2_W2.setForeground(Color.CYAN);
            P2_E0.setForeground(Color.CYAN);
            P2_E1.setForeground(Color.CYAN);
            P2_E2.setForeground(Color.CYAN);
            P2_E3.setForeground(Color.CYAN);
            P2_E4.setForeground(Color.CYAN);
        }
        panel0.setVisible(false);
        panel2ThankYou.add(Back);
        ThankYou.setText(" Thank You");
        panel2ThankYou.add(ThankYou);
        panel2ThankYou.add(Exit);
        Exit.setFont(new Font("Arial", Font.BOLD, 25));
        panel2.add(panel2ThankYou,BorderLayout.NORTH);
        panel2ThankYou.setFont(new Font("Cooper", Font.BOLD, 30));

        panel2_EAST.setBorder(new EmptyBorder(180, 10, 180, 5));
        panel2_WEST.setBorder(new EmptyBorder(200, 5, 200, 10));
        
        panel2_WEST.setFont(new Font("Courier", Font.BOLD , 30));
        panel2_EAST.setFont(new Font("Courier", Font.BOLD , 30));

        P2_W2.setBorder(new EmptyBorder(200, 5, 200, 10));
        P2_E1.setBorder(new EmptyBorder(200, 5, 200, 10));
        
        P2_E2.setBorder(new EmptyBorder(200, 5, 200, 10));
        P2_E3.setBorder(new EmptyBorder(200, 5, 200, 10));
        P2_E4.setBorder(new EmptyBorder(200, 5, 200, 10));
        P2_W2.setFont(new Font("Courier", Font.BOLD , 22));
        P2_E1.setFont(new Font("Courier", Font.BOLD , 22));
        P2_E2.setFont(new Font("Courier", Font.BOLD , 20));
        P2_E3.setFont(new Font("Courier", Font.BOLD , 20));
        P2_E4.setFont(new Font("Courier", Font.BOLD , 20));
        panel2_WEST.add(P2_W0);
        panel2_WEST.add(P2_W1);
        panel2_WEST.add(P2_W2);
        panel2_EAST.add(P2_E0);
        panel2_EAST.add(P2_E1);
        panel2_EAST.add(P2_E2);
        panel2_EAST.add(P2_E3);
        panel2_EAST.add(P2_E4);
        

        panel2ThankYou.setBorder(new EmptyBorder(0, 50, 10, 50));
        
        panel2.setBorder(new EmptyBorder(30, 10, 30, 1));
        F.add(panel2);

        panel2.add(panel2_WEST,BorderLayout.WEST);
        panel2.add(Panel2BillMemo,BorderLayout.CENTER);
        panel2.add(panel2_EAST,BorderLayout.EAST);

        PageBill_Memo();
        
    }

//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^^^^^^No Need To GO Beyond^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^


    void Page1AddCart()
    {
        AC=0;
        PriceTotal=0;
        for(int i=0;i<10;i++)
        {
            if(Q00[i]>0)
            {
                ACItemName[AC].setText(Item00[i]);
                ACIteamQy[AC].setText(""+Q00[i]);
                Price0[i]=R00[i]*Q00[i];
                ACItemTotPric[AC].setText(""+(Price0[i]));
                PriceTotal+=Price0[i];
                AC+=1;
            }
            if(Q01[i]>0)
            {
                ACItemName[AC].setText(Item01[i]);
                ACIteamQy[AC].setText(""+Q01[i]);
                Price1[i]=R01[i]*Q01[i];
                ACItemTotPric[AC].setText(""+(Price1[i]));
                PriceTotal+=Price1[i];
                AC+=1;
            }
            if(Q02[i]>0)
            {
                ACItemName[AC].setText(Item02[i]);
                ACIteamQy[AC].setText(""+Q02[i]);
                Price2[i]=R02[i]*Q02[i];
                ACItemTotPric[AC].setText(""+(Price2[i]));
                PriceTotal+=Price2[i];
                AC+=1;
            }
            if(Q03[i]>0)
            {
                ACItemName[AC].setText(Item03[i]);
                ACIteamQy[AC].setText(""+Q03[i]);
                Price3[i]=R03[i]*Q03[i];
                ACItemTotPric[AC].setText(""+(Price3[i]));
                PriceTotal+=Price3[i];
                AC+=1;
            }
            if(Q04[i]>0)
            {
                ACItemName[AC].setText(Item04[i]);
                ACIteamQy[AC].setText(""+Q04[i]);
                Price4[i]=R04[i]*Q04[i];
                ACItemTotPric[AC].setText(""+(Price4[i]));
                PriceTotal+=Price4[i];
                AC+=1;
            }
            if(Q05[i]>0)
            {
                ACItemName[AC].setText(Item05[i]);
                ACIteamQy[AC].setText(""+Q05[i]);
                Price5[i]=R05[i]*Q05[i];
                ACItemTotPric[AC].setText(""+(Price5[i]));
                PriceTotal+=Price5[i];
                AC+=1;
            }
            if(Q06[i]>0)
            {
                ACItemName[AC].setText(Item06[i]);
                ACIteamQy[AC].setText(""+Q06[i]);
                Price6[i]=R06[i]*Q06[i];
                ACItemTotPric[AC].setText(""+(Price6[i]));
                PriceTotal+=Price6[i];
                AC+=1;
            }
            if(Q07[i]>0)
            {
                ACItemName[AC].setText(Item07[i]);
                ACIteamQy[AC].setText(""+Q07[i]);
                Price7[i]=R07[i]*Q07[i];
                ACItemTotPric[AC].setText(""+(Price7[i]));
                PriceTotal+=Price7[i];
                AC+=1;
            }
            if(Q08[i]>0)
            {
                ACItemName[AC].setText(Item08[i]);
                ACIteamQy[AC].setText(""+Q08[i]);
                Price8[i]=R08[i]*Q08[i];
                ACItemTotPric[AC].setText(""+(Price8[i]));
                PriceTotal+=Price8[i];
                AC+=1;
            }
            if(Q09[i]>0)
            {
                ACItemName[AC].setText(Item09[i]);
                ACIteamQy[AC].setText(""+Q09[i]);
                Price9[i]=R09[i]*Q09[i];
                ACItemTotPric[AC].setText(""+(Price9[i]));
                PriceTotal+=Price9[i];
                AC+=1;
            }
            TotalItem=AC;//For getting Total Quatity every time
            if(TotalItem==15 )
            {
                for(int j=0;j<10;j++)
                {   
                    if(QTemp[j]==0)
                    {
                    ButtonAdd[j].setText(" + ");
                    if(MODE%2==0)
                    ButtonAdd[j].setForeground(Color.RED);
                    else
                    ButtonAdd[j].setForeground(Color.RED);
                    FlagAOver = 1;
                    }
                }
            }
            else
            {
                for(int j=0;j<10;j++)
                {
                    ButtonAdd[j].setText(" + ");
                    if(MODE%2==0)
                    ButtonAdd[j].setForeground(Color.BLUE);
                    else
                    ButtonAdd[j].setForeground(Color.GREEN);
                    FlagAOver = 0;
                }
            }
            //Page1Total.setText("Tot I: "+AC+"| Total Amount : "+ PriceTotal);
        }
    }
//============================================================================
    void AddToBill()
    {
        GridBagConstraints P1Bill = new GridBagConstraints();
        P1Bill.insets = new Insets(2, 2, 2, 2);

        for(int I=0;I<20;I++)
        {
            if(MODE%2==0)
            {
                ACItemName[I].setForeground(Color.BLACK);
                ACIteamQy[I].setForeground(Color.BLACK);
                ACItemTotPric[I].setForeground(Color.BLACK);
            }
            else
            {
                ACItemName[I].setForeground(Color.BLACK);
                ACIteamQy[I].setForeground(Color.BLACK);
                ACItemTotPric[I].setForeground(Color.BLACK);
            }

            P1Bill.gridy = I;

            P1Bill.gridx = 0; 
            P1Bill.ipadx = 20;
            P1Bill.ipady = 3;

            Panel1BillList.add(ACItemName[I],P1Bill);
            P1Bill.gridx = 1; 
            P1Bill.ipadx = 10;
            Panel1BillList.add(ACIteamQy[I],P1Bill);
            P1Bill.gridx = 2;
            P1Bill.ipadx = 10; 
            Panel1BillList.add(ACItemTotPric[I],P1Bill);


        }
        if( TotalItem==0)
                Page1Total=" ";
        else
        Page1Total=(S+S+S+S+S+"        Proceed  to  Bill      "+S+S+S+"    Total Amount : "+ PriceTotal);
        Bill.setText(Page1Total);
        if(MODE%2==0)
        {
            Panel1BillList.setBackground(Color.GRAY);
            Panel2BillMemo.setBackground(Color.GRAY);
        }
        else
        {
            Panel1BillList.setBackground(Color.LIGHT_GRAY);
            Panel2BillMemo.setBackground(Color.LIGHT_GRAY);
        }
    }
//============================================================================
    void Page1RemoveCart()
    {
        for(int I=0;I<20;I++)
        {
            Panel1BillList.remove(ACItemName[I]);
            Panel1BillList.remove(ACIteamQy[I]);
            Panel1BillList.remove(ACItemTotPric[I]);

            Panel2BillMemo.remove(ACItemName[I]);
            Panel2BillMemo.remove(ACIteamQy[I]);
            Panel2BillMemo.remove(ACItemTotPric[I]);
        }
    }
//============================================================================
    void Page1CartInz()
    {
        for(int x = 0; x< 20;x++)
        {
            ACItemName[x].setText("   ");
            ACIteamQy[x].setText("   ");
            ACItemTotPric[x].setText("   ");
        }
    }
//============================================================================
    void TITLE()
    {
        Title.setFont(new Font("Courier", Font.BOLD, 30));
        TitleFront.setFont(new Font("Courier", Font.BOLD, 40));
        TitleBack.setFont(new Font("Courier", Font.BOLD, 40));
        
        TitleCenter = new JPanel(new GridLayout(1,3,30,30));
        TitleCenter.setBorder(new EmptyBorder(20, 20, 2, 20));
        
        TitleCenter.setBackground(Color.DARK_GRAY);
        TitleFront.setBackground(Color.DARK_GRAY);
        Title.setBackground(Color.DARK_GRAY);
        TitleBack.setBackground(Color.DARK_GRAY);
        TitleFront.setForeground(Color.BLUE);
        Title.setForeground(Color.YELLOW);
        TitleBack.setForeground(Color.BLUE);

        TitleCenter.add(TitleFront);
        TitleCenter.add(Title);
        TitleCenter.add(TitleBack);
        F.add(TitleCenter,BorderLayout.NORTH);
    }
    void ADDPage0()
    {
        P0.add(B00);
        P0.add(B01);
        P0.add(B02);
        P0.add(B03);
        P0.add(B04);
        P0.add(B05);
        P0.add(B06);
        P0.add(B07);
        P0.add(B08);
        P0.add(B09);
    }
    void ADDPage1()
    {
        //Initializing The Front Q value to Back Q value
        Quant[0]="   "+QTemp[0];
        Quant[1]="   "+QTemp[1];
        Quant[2]="   "+QTemp[2];
        Quant[3]="   "+QTemp[3];
        Quant[4]="   "+QTemp[4];
        Quant[5]="   "+QTemp[5];
        Quant[6]="   "+QTemp[6];
        Quant[7]="   "+QTemp[7];
        Quant[8]="   "+QTemp[8];
        Quant[9]="   "+QTemp[9];

        L_Item[10] = new JLabel(" Item Name ");
        
        L_Price[10]=new JLabel("  ");
        
        L_ADD = new JLabel("Add Qty ");
        L_SUB = new JLabel("Reduce Qty");
        L_ADD.setFont((new Font("Arial", Font.BOLD, 20)));
        L_SUB.setFont((new Font("Arial", Font.BOLD, 20)));


        L_QTY[10] = new JLabel("Qty");
        L_Item[10].setFont((new Font("Arial", Font.BOLD, 20)));
        L_Price[10].setFont((new Font("Arial", Font.BOLD, 20)));
        L_QTY[10].setFont((new Font("Arial", Font.BOLD,20)));

        if(MODE%2==0)
        {
            L_ADD.setForeground(Color.BLACK);
            L_SUB.setForeground(Color.BLACK);
            L_Item[10].setForeground(Color.BLACK);
            L_Price[10].setForeground(Color.BLACK);
            L_QTY[10].setForeground(Color.BLACK);
        }
        else
        {
            L_ADD.setForeground(Color.WHITE);
            L_SUB.setForeground(Color.WHITE);
            L_Item[10].setForeground(Color.WHITE);
            L_Price[10].setForeground(Color.WHITE);
            L_QTY[10].setForeground(Color.WHITE);
        }

        for(int I=0;I<10;I++)
        {
            L_Item[I] = new JLabel(ItemTemp[I]);
            L_Price[I]=new JLabel(ItemTempP[I]);
            L_QTY[I] = new JLabel(Quant[I]);
            L_Item[I].setFont((new Font("Arial", Font.ITALIC, 18)));
            L_Price[I].setFont((new Font("Arial", Font.ITALIC, 18)));
            L_QTY[I].setFont((new Font("Arial", Font.ITALIC, 18)));
            
            if(MODE%2==0)
            {
                L_Item[I].setForeground(Color.BLACK);
                L_Price[I].setForeground(Color.BLACK);
                L_QTY[I].setForeground(Color.BLACK);
            }
            else
            {
                L_Item[I].setForeground(Color.WHITE);
                L_Price[I].setForeground(Color.WHITE);
                L_QTY[I].setForeground(Color.WHITE);
            }

        }
        GridBagConstraints P1Con = new GridBagConstraints();


        if(C>1)
        L_Price[10].setText("Rate/Unit");
        if(C<2)
        L_Price[10].setText("Rate/Kg");
        P1Con.insets = new Insets(2, 2, 2, 2);

        P1Con.gridy = 0;

        P1Con.gridx = 0; 
        P1Con.ipadx = 30;
        P1Con.ipady = 10;

        Panel11.add(L_Item[10], P1Con);  
        P1Con.gridx = 1; 
        Panel11.add(L_Price[10], P1Con);
        P1Con.gridx = 2; 
        Panel11.add(L_ADD, P1Con);
        P1Con.gridx = 3; 
        Panel11.add(L_QTY[10], P1Con); 
        P1Con.gridx = 4;
        Panel11.add(L_SUB, P1Con);
            
        for( int Y =0;Y<10;Y++)
        {
            P1Con.gridy = Y+1;

            P1Con.gridx = 0; 
            P1Con.ipadx = 30;
            P1Con.ipady = 8;

            Panel11.add(L_Item[Y], P1Con);  
            P1Con.gridx = 1; 
            Panel11.add(L_Price[Y], P1Con);
            P1Con.gridx = 2; 
            P1Con.ipadx = 20;
            Panel11.add(ButtonAdd[Y], P1Con); 
            P1Con.gridx = 3; 
            Panel11.add(L_QTY[Y], P1Con); 
            P1Con.gridx = 4; 
            Panel11.add(ButtonSub[Y], P1Con);
            if(QTemp[Y]==0)
            {
                ButtonSub[Y].setText(" - ");
                if(MODE%2==0)
                    ButtonSub[Y].setForeground(Color.RED);//setVisible(false);
                else
                    ButtonSub[Y].setForeground(Color.RED);//setVisible(false);
            }
            if(QTemp[Y]!=0)
            {
                ButtonSub[Y].setText(" - ");
                if(MODE%2==0)
                    ButtonSub[Y].setForeground(Color.BLUE);//setVisible(false);
                else
                    ButtonSub[Y].setForeground(Color.GREEN);//setVisible(false);
            }
        }

    
  
    }

//============================================================================
    void Page1()
    {
        B00.setText(ItemButtonText[0]);
        B01.setText(ItemButtonText[1]);
        B02.setText(ItemButtonText[2]);
        B03.setText(ItemButtonText[3]);
        B04.setText(ItemButtonText[4]);
        B05.setText(ItemButtonText[5]);
        B06.setText(ItemButtonText[6]);
        B07.setText(ItemButtonText[7]);
        B08.setText(ItemButtonText[8]);
        B09.setText(ItemButtonText[9]);

///////////////////////////////////////////////////////////////////////////////
        Back.setFont(new Font("Arial", Font.BOLD, 25));
        Bill.setFont(new Font("Arial", Font.BOLD, 25));
        
///////////////////////////////////////////////////////////////////////////////

        B00.setFont(new Font("Arial", Font.BOLD, 25));
        B01.setFont(new Font("Arial", Font.BOLD, 25));
        B02.setFont(new Font("Arial", Font.BOLD, 25));
        B03.setFont(new Font("Arial", Font.BOLD, 25));
        B04.setFont(new Font("Arial", Font.BOLD, 25));
        B05.setFont(new Font("Arial", Font.BOLD, 25));
        B06.setFont(new Font("Arial", Font.BOLD, 25));
        B07.setFont(new Font("Arial", Font.BOLD, 25));
        B08.setFont(new Font("Arial", Font.BOLD, 25));
        B09.setFont(new Font("Arial", Font.BOLD, 25));
        
    }
    void TryWEB()
    {
        if (TRY==1)
        try 
        {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("http://www.github.com/NithyaNarayananV");
            desktop.browse(oURL);
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        if (TRY==2)
        try 
        {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("http://www.github.com/Thamaraimks");
            desktop.browse(oURL);
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        if (TRY==3)
        try 
        {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("http://www.github.com/KathirvelP207");
            desktop.browse(oURL);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        /*if (TRY==4)
        try 
        {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("http://www.github.com/NithyaNarayananV");
            desktop.browse(oURL);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }*/
        if (TRY==5)
        try 
        {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://github.com/NithyaNarayananV/ShoppingCart/blob/master/Shopping.java");
            desktop.browse(oURL);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    //**************Action Listener***************** */
    //**************Action Listener***************** */
    //**************Action Listener***************** */
    //**************Action Listener***************** */
    void ButtonPress()
    {
        P2_E1.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                TRY=1;
                TryWEB();
            }
        });
        P2_E2.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                TRY=2;
                TryWEB();
            }
        });
        P2_E3.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                TRY=3;
                TryWEB();
            }
        });
        P2_E4.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                TRY=4;
                TryWEB();
            }
        });
        P2_W2.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                TRY=5;
                TryWEB();
            }
        });
        Back.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel2.setVisible(false);
                Page1();
                F.add(panel0);
                panel0.setVisible(true);
                Page1RemoveCart();
                if( TotalItem>0)
                    Bill.setVisible(true);
                if( TotalItem==0)
                    Page1Total=" ";
            }  
        });
        Bill.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                if( TotalItem!=0)
                {
                Panel10.setVisible(false);
                panel2.setVisible(true);
                PageBill();
                Page1Total=" ";
                Bill.setVisible(false);
                }
            }
        }); 
        Exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

//==============================================================================================
        B00.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item00;
                QTemp = Q00;
                C=0;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R00[i];
                }
                ItemTempP= Price;
                if( TotalItem==0)
                Page1Total=" ";
                Page1Layout();
                Page1AddCart();                
            }  
        }); 
        B01.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item01;
                QTemp = Q01;
                C=1;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R01[i];
                }
                ItemTempP= Price;
                Page1Layout();
                Page1AddCart();
                if( TotalItem==0)
                Page1Total=" ";
            }  
        });
        B02.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item02;
                QTemp = Q02;
                C=2;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R02[i];
                }
                ItemTempP= Price;
                Page1Layout();
                Page1AddCart();
                if( TotalItem==0)
                Page1Total=" ";
                
                
            }
        });
        B03.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item03;
                QTemp = Q03;
                C=3;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R03[i];
                }
                ItemTempP= Price;
                Page1Layout();
                Page1AddCart();
                if( TotalItem==0)
                Page1Total=" ";
            }  
        }); 
        B04.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item04;
                QTemp = Q04;
                C=4;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R04[i];
                }
                ItemTempP= Price;
                Page1Layout();
                Page1AddCart();
                if( TotalItem==0)
                Page1Total=" ";
            }  
        }); 
        B05.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item05;
                QTemp = Q05;
                C=5;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R05[i];
                }
                ItemTempP= Price;
                Page1Layout();
                Page1AddCart();
                if( TotalItem==0)
                Page1Total=" ";
            }  
        }); 
        B06.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item06;
                QTemp = Q06;
                C=6;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R06[i];
                }
                ItemTempP= Price;
                Page1Layout();
                Page1AddCart();
                if( TotalItem==0)
                Page1Total=" ";
            }  
        });
        B07.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item07;
                QTemp = Q07;
                C=7;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R07[i];
                }
                ItemTempP= Price;
                Page1Layout();
                Page1AddCart();
                if( TotalItem==0)
                Page1Total=" ";
            }  
        });        
        B08.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item08;
                QTemp = Q08;
                C=8;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R08[i];
                }
                ItemTempP= Price;
                Page1Layout();
                Page1AddCart();
                if( TotalItem==0)
                Page1Total=" ";
            }  
        });
        B09.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item09;
                QTemp = Q09;
                C=9;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R09[i];
                }
                ItemTempP= Price;
                Page1Layout();
                Page1AddCart();
                if( TotalItem==0)
                Page1Total=" ";
            }  
        });
//===============================================================================

    for( int I=0;I<10;I++)
    {
        ButtonAdd[I] = new JButton(" + ");
        ButtonAdd[I].setFont(new Font("Arial", Font.BOLD, 20));
        ButtonSub[I] = new JButton(" - ");
        ButtonSub[I].setFont(new Font("Arial", Font.BOLD, 20));
        ButtonAdd[I].setBackground(Color.DARK_GRAY);
        ButtonSub[I].setBackground(Color.DARK_GRAY);
        if(MODE%2==0)
        {
        ButtonAdd[I].setForeground(Color.RED);
        ButtonSub[I].setForeground(Color.RED);
        }
        else
        {
        ButtonAdd[I].setForeground(Color.RED);
        ButtonSub[I].setForeground(Color.RED);
        }
    }
        ButtonAdd[0].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                FlagA = 0;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[0].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                FlagS = 0;
                Action_MethodSUB(FlagS);
            }
        });        
        ButtonAdd[1].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {   FlagA = 1;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[1].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 1;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[2].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagA = 2;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[2].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 2;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[3].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagA = 3;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[3].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 3;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[4].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                FlagA = 4;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[4].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                FlagS = 4;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[5].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagA = 5;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[5].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 5;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[6].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagA = 6;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[6].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 6;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[7].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                FlagA = 7;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[7].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 7;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[8].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagA = 8;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[8].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 8;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[9].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagA = 9;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[9].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 9;
                Action_MethodSUB(FlagS);
            }         
        });


        P0_Mode.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                MODE+=1;
                if(MODE %2 ==0)
                    P0_Mode.setText(" Night Mode");
                else
                    P0_Mode.setText(" Light Mode");
                ModeCanager();
            }
        });
    }

    void QTempToQ()
    {
        switch(C)
        {
            case 0: Q00 = QTemp; break;
            case 1: Q01 = QTemp; break;
            case 2: Q02 = QTemp; break;
            case 3: Q03 = QTemp; break;
            case 4: Q04 = QTemp; break;
            case 5: Q05 = QTemp; break;
            case 6: Q06 = QTemp; break;
            case 7: Q07 = QTemp; break;
            case 8: Q08 = QTemp; break;
            case 9: Q09 = QTemp; break;
        }
    }
    int Action_MethodADD(int FlagA)
    {
        if(FlagAOver==0 || QTemp[FlagA]!=0)
        {
            QTemp[FlagA]++;
            ButtonAdd[FlagA].setText(" + ");
            ButtonSub[FlagA].setText(" - ");
            if(MODE%2==0)
            {
                ButtonAdd[FlagA].setForeground(Color.BLUE);
                ButtonSub[FlagA].setForeground(Color.BLUE);
            }
            else
            {
                ButtonAdd[FlagA].setForeground(Color.GREEN);
                ButtonSub[FlagA].setForeground(Color.GREEN);
            }
            Quant[FlagA] = "   "+QTemp[FlagA];
            QTempToQ();
            Page1AddCart();////////////
            AddToBill();
            L_QTY[FlagA].setText(Quant[FlagA]);
        }
        if( TotalItem>0)
        Bill.setVisible(true);
        return 0;
    }
    int Action_MethodSUB(int FlagS)
    {
        if(QTemp[FlagS]>0)
        QTemp[FlagS]--;
        Quant[FlagS] = "   "+QTemp[FlagS];
        L_QTY[FlagS].setText(Quant[FlagS]);
        QTempToQ();
        Page1CartInz();
        Page1RemoveCart();
        
        Page1AddCart();
        AddToBill();
        if(QTemp[FlagS]==0)
        {
            ButtonSub[FlagS].setText(" - ");
            ButtonSub[FlagS].setForeground(Color.RED);
        }
        if(TotalItem==0)
        Page1Total=" ";
        return 0;
    }

    void PageBill_Memo()
    {
        GridBagConstraints P2Bill = new GridBagConstraints();
        P2Bill.insets = new Insets(2, 2, 2, 2);
        ACItemName[15].setFont(new Font("Courier", Font.BOLD , 20));
        ACIteamQy[15].setFont(new Font("Courier", Font.BOLD , 20));
        ACItemTotPric[15].setFont(new Font("Courier", Font.BOLD ,20));
        if(MODE%2==0)
        {
            ACItemName[15].setForeground(Color.BLACK);
            ACIteamQy[15].setForeground(Color.BLACK);
            ACItemTotPric[15].setForeground(Color.BLACK);
        }
        else
        {
            ACItemName[15].setForeground(Color.BLACK);
            ACIteamQy[15].setForeground(Color.BLACK);
            ACItemTotPric[15].setForeground(Color.BLACK);
        }

        P2Bill.gridy = 0;

        P2Bill.gridx = 0; 
        P2Bill.ipadx = 20;
        P2Bill.ipady = 5;
        Panel2BillMemo.add(ACItemName[15],P2Bill);
        P2Bill.gridx = 1; 
        P2Bill.ipadx = 10;
        Panel2BillMemo.add(ACIteamQy[15],P2Bill);
        P2Bill.gridx = 2;
        P2Bill.ipadx = 10; 
        Panel2BillMemo.add(ACItemTotPric[15],P2Bill);

        ACItemName[15].setText(" ITEMS ");//.setText("   ");
        ACIteamQy[15].setText("QTY");//.setText("   ");
        ACItemTotPric[15].setText("PRICE");
        int I;
        for( I=0;I<15;I++)
        {
            ACItemName[I].setFont(new Font("Arial", Font.ITALIC, 13));
            ACIteamQy[I].setFont(new Font("Arial", Font.ITALIC, 13));
            ACItemTotPric[I].setFont(new Font("Arial", Font.ITALIC, 13));
            if(MODE%2==0)
            {
                ACItemName[I].setForeground(Color.BLACK);
                ACIteamQy[I].setForeground(Color.BLACK);
                ACItemTotPric[I].setForeground(Color.BLACK);
            }
            else
            {
                ACItemName[I].setForeground(Color.BLACK);
                ACIteamQy[I].setForeground(Color.BLACK);
                ACItemTotPric[I].setForeground(Color.BLACK);
            }

            P2Bill.gridy = I+1;

            P2Bill.gridx = 0; 
            P2Bill.ipadx = 15;
            P2Bill.ipady = 5;

            Panel2BillMemo.add(ACItemName[I],P2Bill);
            P2Bill.gridx = 1; 
            P2Bill.ipadx = 5;
            Panel2BillMemo.add(ACIteamQy[I],P2Bill);
            P2Bill.gridx = 2;
            P2Bill.ipadx = 10; 
            Panel2BillMemo.add(ACItemTotPric[I],P2Bill);
        }

        Test0.setFont(new Font("Arial", Font.BOLD, 25));
        Test1.setFont(new Font("Arial", Font.BOLD, 25));
        Test2.setFont(new Font("Arial", Font.BOLD, 25));
        P2Bill.gridy = I+2;
        P2Bill.gridx = 0; 
        P2Bill.ipadx = 50;
        P2Bill.ipady = 50;
        Test0.setText("  ");
        Panel2BillMemo.add(Test0,P2Bill);
        P2Bill.gridx = 1; 
        Test1.setText("  Total  Amount : ");
        Panel2BillMemo.add(Test1,P2Bill);
        P2Bill.ipadx = 25;
        P2Bill.gridx = 2; 
        Test2.setText(" "+PriceTotal);
        Panel2BillMemo.add(Test2,P2Bill);
    }
    void ModeCanager()
    {
        if(MODE%2==0)
        {
            
            TitleCenter.setBackground(Color.LIGHT_GRAY);
            TitleFront.setBackground(Color.LIGHT_GRAY);
            Title.setBackground(Color.LIGHT_GRAY);
            TitleBack.setBackground(Color.LIGHT_GRAY);
            TitleFront.setForeground(Color.BLACK);
            Title.setForeground(Color.RED);
            TitleBack.setForeground(Color.BLACK);

            panel0.setBackground(Color.LIGHT_GRAY);
            P0.setBackground(Color.LIGHT_GRAY);
            P0_Mode_Panel.setBackground(Color.LIGHT_GRAY);
            for(int I=0;I<10;I++)
            {
                ButtonAdd[I].setBackground(Color.LIGHT_GRAY);
                ButtonSub[I].setBackground(Color.LIGHT_GRAY);
            }
        }
        else
        {
            TitleCenter.setBackground(Color.DARK_GRAY);
            TitleFront.setBackground(Color.DARK_GRAY);
            Title.setBackground(Color.DARK_GRAY);
            TitleBack.setBackground(Color.DARK_GRAY);
            TitleFront.setForeground(Color.BLUE);
            Title.setForeground(Color.YELLOW);
            TitleBack.setForeground(Color.BLUE);

            panel0.setBackground(Color.DARK_GRAY);
            P0.setBackground(Color.DARK_GRAY);
            P0_Mode_Panel.setBackground(Color.DARK_GRAY);
            for(int I=0;I<10;I++)
            {
                ButtonAdd[I].setBackground(Color.DARK_GRAY);
                ButtonSub[I].setBackground(Color.DARK_GRAY);
            }
        }
    }
}
