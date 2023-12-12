package pacinotte1;
//EASTER EGG
import java.awt.*;
import static java.lang.Math.random;
import java.util.Random;
import javax.swing.*;


public class Tombolainterfaccia extends javax.swing.JFrame {
    int arraynum[]= new int [61];
    int k;
    int v[] = new int[91];
    int p[]=new int[5];
    String s1;
    int giocatori;
    
    JLabel []labels1 = new JLabel[91];
    JPanel []panels1 = new JPanel[91];
    JLabel []labels2 = new JLabel[61];
    
    
    double ran;
    double arrayran[]= new double[61];
    String arraystrin[] = new String [61];
    // full screen
   Random random = new Random();
   GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
   GraphicsDevice gd = ge.getDefaultScreenDevice();
   
   
    public Tombolainterfaccia() {
        initComponents();
       
        fullscreenoff.setVisible(false);
        // INIZIALIZZAZIONE ARRAY tabellone
        
        labels1[1]=E01;
        labels1[2]=E02;
        labels1[3]=E03;
        labels1[4]=E04;
        labels1[5]=E05;
        labels1[6]=E06;
        labels1[7]=E07;
        labels1[8]=E08;
        labels1[9]=E09;
        labels1[10]=E10;
        labels1[11]=E11;
        labels1[12]=E12;
        labels1[13]=E13;
        labels1[14]=E14;
        labels1[15]=E15;
        labels1[16]=E16;
        labels1[17]=E17;
        labels1[18]=E18;
        labels1[19]=E19;
        labels1[20]=E20;
        labels1[21]=E21;
        labels1[22]=E22;
        labels1[23]=E23;
        labels1[24]=E24;
        labels1[25]=E25;
        labels1[26]=E26;
        labels1[27]=E27;
        labels1[28]=E28;
        labels1[29]=E29;
        labels1[30]=E30;
        labels1[31]=E31;
        labels1[32]=E32;
        labels1[33]=E33;
        labels1[34]=E34;
        labels1[35]=E35;
        labels1[36]=E36;
        labels1[37]=E37;
        labels1[38]=E38;
        labels1[39]=E39;
        labels1[40]=E40;
        labels1[41]=E41;
        labels1[42]=E42;
        labels1[43]=E43;
        labels1[44]=E44;
        labels1[45]=E45;
        labels1[46]=E46;
        labels1[47]=E47;
        labels1[48]=E48;
        labels1[49]=E49;
        labels1[50]=E50;
        labels1[51]=E51;
        labels1[52]=E52;
        labels1[53]=E53;
        labels1[54]=E54;
        labels1[55]=E55;
        labels1[56]=E56;
        labels1[57]=E57;
        labels1[58]=E58;
        labels1[59]=E59;
        labels1[60]=E60;
        labels1[61]=E61;
        labels1[62]=E62;
        labels1[63]=E63;
        labels1[64]=E64;
        labels1[65]=E65;
        labels1[66]=E66;
        labels1[67]=E67;
        labels1[68]=E68;
        labels1[69]=E69;
        labels1[70]=E70;
        labels1[71]=E71;
        labels1[72]=E72;
        labels1[73]=E73;
        labels1[74]=E74;
        labels1[75]=E75;
        labels1[76]=E76;
        labels1[77]=E77;
        labels1[78]=E78;
        labels1[79]=E79;
        labels1[80]=E80;
        labels1[81]=E81;
        labels1[82]=E82;
        labels1[83]=E83;
        labels1[84]=E84;
        labels1[85]=E85;
        labels1[86]=E86;
        labels1[87]=E87;
        labels1[88]=E88;
        labels1[89]=E89;
        labels1[90]=E90;
        
        //FINE INIZIALIZZAZIONE ARRAY
        labels2[1] = Num1;
        labels2[2] = Num2;
        labels2[3] = Num3;
        labels2[4] = Num4;
        labels2[5] = Num5;
        labels2[6] = Num6;
        labels2[7] = Num7;
        labels2[8] = Num8;
        labels2[9] = Num9;
        labels2[10] = Num10;
        labels2[11] = Num11;
        labels2[12] = Num12;
        labels2[13] = Num13;
        labels2[14] = Num14;
        labels2[15] = Num15;
        labels2[16] = Num16;
        labels2[17] = Num17;
        labels2[18] = Num18;
        labels2[19] = Num19;
        labels2[20] = Num20;
        labels2[21] = Num21;
        labels2[22] = Num22;
        labels2[23] = Num23;
        labels2[24] = Num24;
        labels2[25] = Num25;
        labels2[26] = Num26;
        labels2[27] = Num27;
        labels2[28] = Num28;
        labels2[29] = Num29;
        labels2[30] = Num30;
        labels2[31] = Num31;
        labels2[32] = Num32;
        labels2[33] = Num33;
        labels2[34] = Num34;
        labels2[35] = Num35;
        labels2[36] = Num36;
        labels2[37] = Num37;
        labels2[38] = Num38;
        labels2[39] = Num39;
        labels2[40] = Num40;
        labels2[41] = Num41;
        labels2[42] = Num42;
        labels2[43] = Num43;
        labels2[44] = Num44;
        labels2[45] = Num45;
        labels2[46] = Num46;
        labels2[47] = Num47;
        labels2[48] = Num48;
        labels2[49] = Num49;
        labels2[50] = Num50;
        labels2[51] = Num51;
        labels2[52] = Num52;
        labels2[53] = Num53;
        labels2[54] = Num54;
        labels2[55] = Num55;
        labels2[56] = Num56;
        labels2[57] = Num57;
        labels2[58] = Num58;
        labels2[59] = Num59;
        labels2[60] = Num60;
        //INIZIALIZZAZIONE ARRAY CARTELLE
        
        
        for(int i=0;i<=4;i++)
        {
            p[i]=0;
        }
        //strech image
        /*Icon i= jLabel2.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
        jLabel2.setIcon(new ImageIcon(image)); */
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Schermata1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        aiuto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fullscreenon = new javax.swing.JLabel();
        fullscreenoff = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Schermata2 = new javax.swing.JPanel();
        Tabella = new RoundedPanel(20,new Color(204,0,0));
        P01 = new RoundedPanel(100,new Color(248,148,60));
        E01 = new javax.swing.JLabel();
        P02 = new RoundedPanel(100,new Color(248,148,60));
        E02 = new javax.swing.JLabel();
        P04 = new RoundedPanel(100,new Color(248,148,60));
        E04 = new javax.swing.JLabel();
        P05 = new RoundedPanel(100,new Color(248,148,60));
        E05 = new javax.swing.JLabel();
        P03 = new RoundedPanel(100,new Color(248,148,60));
        E03 = new javax.swing.JLabel();
        P10 = new RoundedPanel(100,new Color(248,148,60));
        E10 = new javax.swing.JLabel();
        P06 = new RoundedPanel(100,new Color(248,148,60));
        E06 = new javax.swing.JLabel();
        P07 = new RoundedPanel(100,new Color(248,148,60));
        E07 = new javax.swing.JLabel();
        P08 = new RoundedPanel(100,new Color(248,148,60));
        E08 = new javax.swing.JLabel();
        P09 = new RoundedPanel(100,new Color(248,148,60));
        E09 = new javax.swing.JLabel();
        P11 = new RoundedPanel(100,new Color(248,148,60));
        E11 = new javax.swing.JLabel();
        P12 = new RoundedPanel(100,new Color(248,148,60));
        E12 = new javax.swing.JLabel();
        P13 = new RoundedPanel(100,new Color(248,148,60));
        E13 = new javax.swing.JLabel();
        P14 = new RoundedPanel(100,new Color(248,148,60));
        E14 = new javax.swing.JLabel();
        P15 = new RoundedPanel(100,new Color(248,148,60));
        E15 = new javax.swing.JLabel();
        P16 = new RoundedPanel(100,new Color(248,148,60));
        E16 = new javax.swing.JLabel();
        P17 = new RoundedPanel(100,new Color(248,148,60));
        E17 = new javax.swing.JLabel();
        P18 = new RoundedPanel(100,new Color(248,148,60));
        E18 = new javax.swing.JLabel();
        P19 = new RoundedPanel(100,new Color(248,148,60));
        E19 = new javax.swing.JLabel();
        P20 = new RoundedPanel(100,new Color(248,148,60));
        E20 = new javax.swing.JLabel();
        P25 = new RoundedPanel(100,new Color(248,148,60));
        E25 = new javax.swing.JLabel();
        P21 = new RoundedPanel(100,new Color(248,148,60));
        E21 = new javax.swing.JLabel();
        P22 = new RoundedPanel(100,new Color(248,148,60));
        E22 = new javax.swing.JLabel();
        P23 = new RoundedPanel(100,new Color(248,148,60));
        E23 = new javax.swing.JLabel();
        P24 = new RoundedPanel(100,new Color(248,148,60));
        E24 = new javax.swing.JLabel();
        P26 = new RoundedPanel(100,new Color(248,148,60));
        E26 = new javax.swing.JLabel();
        P27 = new RoundedPanel(100,new Color(248,148,60));
        E27 = new javax.swing.JLabel();
        P28 = new RoundedPanel(100,new Color(248,148,60));
        E28 = new javax.swing.JLabel();
        P29 = new RoundedPanel(100,new Color(248,148,60));
        E29 = new javax.swing.JLabel();
        P30 = new RoundedPanel(100,new Color(248,148,60));
        E30 = new javax.swing.JLabel();
        P50 = new RoundedPanel(100,new Color(248,148,60));
        E50 = new javax.swing.JLabel();
        P55 = new RoundedPanel(100,new Color(248,148,60));
        E55 = new javax.swing.JLabel();
        P31 = new RoundedPanel(100,new Color(248,148,60));
        E31 = new javax.swing.JLabel();
        P32 = new RoundedPanel(100,new Color(248,148,60));
        E32 = new javax.swing.JLabel();
        P51 = new RoundedPanel(100,new Color(248,148,60));
        E51 = new javax.swing.JLabel();
        P52 = new RoundedPanel(100,new Color(248,148,60));
        E52 = new javax.swing.JLabel();
        P53 = new RoundedPanel(100,new Color(248,148,60));
        E53 = new javax.swing.JLabel();
        P54 = new RoundedPanel(100,new Color(248,148,60));
        E54 = new javax.swing.JLabel();
        P56 = new RoundedPanel(100,new Color(248,148,60));
        E56 = new javax.swing.JLabel();
        P57 = new RoundedPanel(100,new Color(248,148,60));
        E57 = new javax.swing.JLabel();
        P34 = new RoundedPanel(100,new Color(248,148,60));
        E34 = new javax.swing.JLabel();
        P58 = new RoundedPanel(100,new Color(248,148,60));
        E58 = new javax.swing.JLabel();
        P35 = new RoundedPanel(100,new Color(248,148,60));
        E35 = new javax.swing.JLabel();
        P59 = new RoundedPanel(100,new Color(248,148,60));
        E59 = new javax.swing.JLabel();
        P33 = new RoundedPanel(100,new Color(248,148,60));
        E33 = new javax.swing.JLabel();
        P60 = new RoundedPanel(100,new Color(248,148,60));
        E60 = new javax.swing.JLabel();
        P40 = new RoundedPanel(100,new Color(248,148,60));
        E40 = new javax.swing.JLabel();
        P41 = new RoundedPanel(100,new Color(248,148,60));
        E41 = new javax.swing.JLabel();
        P36 = new RoundedPanel(100,new Color(248,148,60));
        E36 = new javax.swing.JLabel();
        P42 = new RoundedPanel(100,new Color(248,148,60));
        E42 = new javax.swing.JLabel();
        P43 = new RoundedPanel(100,new Color(248,148,60));
        E43 = new javax.swing.JLabel();
        P44 = new RoundedPanel(100,new Color(248,148,60));
        E44 = new javax.swing.JLabel();
        P45 = new RoundedPanel(100,new Color(248,148,60));
        E45 = new javax.swing.JLabel();
        P37 = new RoundedPanel(100,new Color(248,148,60));
        E37 = new javax.swing.JLabel();
        P46 = new RoundedPanel(100,new Color(248,148,60));
        E46 = new javax.swing.JLabel();
        P38 = new RoundedPanel(100,new Color(248,148,60));
        E38 = new javax.swing.JLabel();
        P47 = new RoundedPanel(100,new Color(248,148,60));
        E47 = new javax.swing.JLabel();
        P39 = new RoundedPanel(100,new Color(248,148,60));
        E39 = new javax.swing.JLabel();
        P48 = new RoundedPanel(100,new Color(248,148,60));
        E48 = new javax.swing.JLabel();
        P49 = new RoundedPanel(100,new Color(248,148,60));
        E49 = new javax.swing.JLabel();
        P61 = new RoundedPanel(100,new Color(248,148,60));
        E61 = new javax.swing.JLabel();
        P62 = new RoundedPanel(100,new Color(248,148,60));
        E62 = new javax.swing.JLabel();
        P63 = new RoundedPanel(100,new Color(248,148,60));
        E63 = new javax.swing.JLabel();
        P64 = new RoundedPanel(100,new Color(248,148,60));
        E64 = new javax.swing.JLabel();
        P65 = new RoundedPanel(100,new Color(248,148,60));
        E65 = new javax.swing.JLabel();
        P75 = new RoundedPanel(100,new Color(248,148,60));
        E75 = new javax.swing.JLabel();
        P74 = new RoundedPanel(100,new Color(248,148,60));
        E74 = new javax.swing.JLabel();
        P73 = new RoundedPanel(100,new Color(248,148,60));
        E73 = new javax.swing.JLabel();
        P72 = new RoundedPanel(100,new Color(248,148,60));
        E72 = new javax.swing.JLabel();
        P71 = new RoundedPanel(100,new Color(248,148,60));
        E71 = new javax.swing.JLabel();
        P81 = new RoundedPanel(100,new Color(248,148,60));
        E81 = new javax.swing.JLabel();
        P82 = new RoundedPanel(100,new Color(248,148,60));
        E82 = new javax.swing.JLabel();
        P83 = new RoundedPanel(100,new Color(248,148,60));
        E83 = new javax.swing.JLabel();
        P84 = new RoundedPanel(100,new Color(248,148,60));
        E84 = new javax.swing.JLabel();
        P85 = new RoundedPanel(100,new Color(248,148,60));
        E85 = new javax.swing.JLabel();
        P86 = new RoundedPanel(100,new Color(248,148,60));
        E86 = new javax.swing.JLabel();
        P76 = new RoundedPanel(100,new Color(248,148,60));
        E76 = new javax.swing.JLabel();
        P66 = new RoundedPanel(100,new Color(248,148,60));
        E66 = new javax.swing.JLabel();
        P67 = new RoundedPanel(100,new Color(248,148,60));
        E67 = new javax.swing.JLabel();
        P77 = new RoundedPanel(100,new Color(248,148,60));
        E77 = new javax.swing.JLabel();
        P87 = new RoundedPanel(100,new Color(248,148,60));
        E87 = new javax.swing.JLabel();
        P89 = new RoundedPanel(100,new Color(248,148,60));
        E89 = new javax.swing.JLabel();
        P88 = new RoundedPanel(100,new Color(248,148,60));
        E88 = new javax.swing.JLabel();
        P78 = new RoundedPanel(100,new Color(248,148,60));
        E78 = new javax.swing.JLabel();
        P68 = new RoundedPanel(100,new Color(248,148,60));
        E68 = new javax.swing.JLabel();
        P69 = new RoundedPanel(100,new Color(248,148,60));
        E69 = new javax.swing.JLabel();
        P79 = new RoundedPanel(100,new Color(248,148,60));
        E79 = new javax.swing.JLabel();
        P80 = new RoundedPanel(100,new Color(248,148,60));
        E80 = new javax.swing.JLabel();
        P70 = new RoundedPanel(100,new Color(248,148,60));
        E70 = new javax.swing.JLabel();
        P90 = new RoundedPanel(100,new Color(248,148,60));
        E90 = new javax.swing.JLabel();
        Gioc1 = new javax.swing.JPanel();
        jPanel105 = new javax.swing.JPanel();
        jPanel111 = new javax.swing.JPanel();
        jPanel112 = new javax.swing.JPanel();
        Num6 = new javax.swing.JLabel();
        jPanel113 = new javax.swing.JPanel();
        Num1 = new javax.swing.JLabel();
        jPanel114 = new javax.swing.JPanel();
        jPanel115 = new javax.swing.JPanel();
        Num11 = new javax.swing.JLabel();
        jPanel120 = new javax.swing.JPanel();
        jPanel121 = new javax.swing.JPanel();
        jPanel122 = new javax.swing.JPanel();
        Num7 = new javax.swing.JLabel();
        jPanel123 = new javax.swing.JPanel();
        Num8 = new javax.swing.JLabel();
        jPanel124 = new javax.swing.JPanel();
        Num3 = new javax.swing.JLabel();
        jPanel125 = new javax.swing.JPanel();
        Num2 = new javax.swing.JLabel();
        jPanel126 = new javax.swing.JPanel();
        Num13 = new javax.swing.JLabel();
        jPanel127 = new javax.swing.JPanel();
        Num12 = new javax.swing.JLabel();
        jPanel128 = new javax.swing.JPanel();
        Num9 = new javax.swing.JLabel();
        jPanel129 = new javax.swing.JPanel();
        jPanel130 = new javax.swing.JPanel();
        Num4 = new javax.swing.JLabel();
        jPanel131 = new javax.swing.JPanel();
        jPanel132 = new javax.swing.JPanel();
        jPanel133 = new javax.swing.JPanel();
        Num14 = new javax.swing.JLabel();
        jPanel134 = new javax.swing.JPanel();
        jPanel135 = new javax.swing.JPanel();
        Num10 = new javax.swing.JLabel();
        jPanel136 = new javax.swing.JPanel();
        jPanel137 = new javax.swing.JPanel();
        Num5 = new javax.swing.JLabel();
        jPanel138 = new javax.swing.JPanel();
        jPanel139 = new javax.swing.JPanel();
        jPanel140 = new javax.swing.JPanel();
        Num15 = new javax.swing.JLabel();
        Gioc2 = new javax.swing.JPanel();
        jPanel141 = new javax.swing.JPanel();
        jPanel142 = new javax.swing.JPanel();
        Num21 = new javax.swing.JLabel();
        jPanel143 = new javax.swing.JPanel();
        jPanel144 = new javax.swing.JPanel();
        Num16 = new javax.swing.JLabel();
        jPanel145 = new javax.swing.JPanel();
        jPanel146 = new javax.swing.JPanel();
        Num26 = new javax.swing.JLabel();
        jPanel147 = new javax.swing.JPanel();
        jPanel148 = new javax.swing.JPanel();
        jPanel149 = new javax.swing.JPanel();
        Num17 = new javax.swing.JLabel();
        jPanel150 = new javax.swing.JPanel();
        Num18 = new javax.swing.JLabel();
        jPanel151 = new javax.swing.JPanel();
        jPanel152 = new javax.swing.JPanel();
        Num27 = new javax.swing.JLabel();
        jPanel153 = new javax.swing.JPanel();
        jPanel154 = new javax.swing.JPanel();
        Num22 = new javax.swing.JLabel();
        jPanel155 = new javax.swing.JPanel();
        Num19 = new javax.swing.JLabel();
        jPanel156 = new javax.swing.JPanel();
        jPanel157 = new javax.swing.JPanel();
        Num23 = new javax.swing.JLabel();
        jPanel158 = new javax.swing.JPanel();
        Num28 = new javax.swing.JLabel();
        jPanel159 = new javax.swing.JPanel();
        jPanel160 = new javax.swing.JPanel();
        Num24 = new javax.swing.JLabel();
        jPanel161 = new javax.swing.JPanel();
        Num20 = new javax.swing.JLabel();
        jPanel162 = new javax.swing.JPanel();
        jPanel163 = new javax.swing.JPanel();
        Num25 = new javax.swing.JLabel();
        jPanel164 = new javax.swing.JPanel();
        Num29 = new javax.swing.JLabel();
        jPanel165 = new javax.swing.JPanel();
        Num30 = new javax.swing.JLabel();
        jPanel166 = new javax.swing.JPanel();
        jPanel167 = new javax.swing.JPanel();
        Gioc3 = new javax.swing.JPanel();
        jPanel168 = new javax.swing.JPanel();
        jPanel169 = new javax.swing.JPanel();
        jPanel170 = new javax.swing.JPanel();
        Num31 = new javax.swing.JLabel();
        jPanel171 = new javax.swing.JPanel();
        Num32 = new javax.swing.JLabel();
        jPanel172 = new javax.swing.JPanel();
        jPanel173 = new javax.swing.JPanel();
        Num41 = new javax.swing.JLabel();
        jPanel174 = new javax.swing.JPanel();
        Num42 = new javax.swing.JLabel();
        jPanel175 = new javax.swing.JPanel();
        Num36 = new javax.swing.JLabel();
        jPanel176 = new javax.swing.JPanel();
        jPanel177 = new javax.swing.JPanel();
        Num33 = new javax.swing.JLabel();
        jPanel178 = new javax.swing.JPanel();
        Num37 = new javax.swing.JLabel();
        jPanel179 = new javax.swing.JPanel();
        jPanel180 = new javax.swing.JPanel();
        jPanel181 = new javax.swing.JPanel();
        Num38 = new javax.swing.JLabel();
        jPanel182 = new javax.swing.JPanel();
        jPanel183 = new javax.swing.JPanel();
        Num34 = new javax.swing.JLabel();
        jPanel184 = new javax.swing.JPanel();
        jPanel185 = new javax.swing.JPanel();
        Num43 = new javax.swing.JLabel();
        jPanel186 = new javax.swing.JPanel();
        jPanel187 = new javax.swing.JPanel();
        jPanel188 = new javax.swing.JPanel();
        Num35 = new javax.swing.JLabel();
        jPanel189 = new javax.swing.JPanel();
        jPanel190 = new javax.swing.JPanel();
        Num39 = new javax.swing.JLabel();
        jPanel191 = new javax.swing.JPanel();
        Num44 = new javax.swing.JLabel();
        jPanel192 = new javax.swing.JPanel();
        Num45 = new javax.swing.JLabel();
        jPanel193 = new javax.swing.JPanel();
        Num40 = new javax.swing.JLabel();
        jPanel194 = new javax.swing.JPanel();
        Gioc4 = new javax.swing.JPanel();
        jPanel195 = new javax.swing.JPanel();
        jPanel196 = new javax.swing.JPanel();
        jPanel197 = new javax.swing.JPanel();
        Num46 = new javax.swing.JLabel();
        jPanel198 = new javax.swing.JPanel();
        Num47 = new javax.swing.JLabel();
        jPanel199 = new javax.swing.JPanel();
        Num51 = new javax.swing.JLabel();
        jPanel200 = new javax.swing.JPanel();
        jPanel201 = new javax.swing.JPanel();
        Num56 = new javax.swing.JLabel();
        jPanel202 = new javax.swing.JPanel();
        Num52 = new javax.swing.JLabel();
        jPanel203 = new javax.swing.JPanel();
        jPanel204 = new javax.swing.JPanel();
        Num48 = new javax.swing.JLabel();
        jPanel205 = new javax.swing.JPanel();
        jPanel206 = new javax.swing.JPanel();
        Num57 = new javax.swing.JLabel();
        jPanel207 = new javax.swing.JPanel();
        Num58 = new javax.swing.JLabel();
        jPanel208 = new javax.swing.JPanel();
        Num53 = new javax.swing.JLabel();
        jPanel209 = new javax.swing.JPanel();
        jPanel210 = new javax.swing.JPanel();
        jPanel211 = new javax.swing.JPanel();
        Num54 = new javax.swing.JLabel();
        jPanel212 = new javax.swing.JPanel();
        Num59 = new javax.swing.JLabel();
        jPanel213 = new javax.swing.JPanel();
        jPanel214 = new javax.swing.JPanel();
        jPanel215 = new javax.swing.JPanel();
        Num49 = new javax.swing.JLabel();
        jPanel216 = new javax.swing.JPanel();
        Num50 = new javax.swing.JLabel();
        jPanel217 = new javax.swing.JPanel();
        Num55 = new javax.swing.JLabel();
        jPanel218 = new javax.swing.JPanel();
        jPanel219 = new javax.swing.JPanel();
        Num60 = new javax.swing.JLabel();
        jPanel220 = new javax.swing.JPanel();
        jPanel221 = new javax.swing.JPanel();
        GiocLabel4 = new javax.swing.JLabel();
        GiocLabel1 = new javax.swing.JLabel();
        GiocLabel2 = new javax.swing.JLabel();
        GiocLabel3 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jPanel223 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        premi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        Schermata1.setBackground(new java.awt.Color(204, 204, 255));
        Schermata1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Schermata1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        Schermata1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("High Tower Text", 1, 115)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacinotte1/ombola-T.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 649, 186));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacinotte1/T-ombola.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 190, 200));

        Schermata1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 900, 220));

        aiuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacinotte1/domanda.png"))); // NOI18N
        aiuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aiutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aiutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aiutoMouseExited(evt);
            }
        });
        Schermata1.add(aiuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 60));

        jPanel2.setBackground(new java.awt.Color(112, 75, 42,175));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullscreenon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fullscreenon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacinotte1/fullscreen1.png"))); // NOI18N
        fullscreenon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullscreenonMouseClicked(evt);
            }
        });
        jPanel2.add(fullscreenon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1880, 10, 30, 40));

        fullscreenoff.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fullscreenoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacinotte1/fullscreen2.png"))); // NOI18N
        fullscreenoff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullscreenoffMouseClicked(evt);
            }
        });
        jPanel2.add(fullscreenoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(1880, 10, 30, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacinotte1/user.png"))); // NOI18N
        jLabel2.setText("1-4");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 40));

        Schermata1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 150));

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacinotte1/gioca.png"))); // NOI18N
        jLabel96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel96MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel96MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel96MouseExited(evt);
            }
        });
        Schermata1.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 770, -1, -1));

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacinotte1/esci.png"))); // NOI18N
        jLabel97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel97MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel97MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel97MouseExited(evt);
            }
        });
        Schermata1.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 770, 380, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacinotte1/sfondo1.png"))); // NOI18N
        Schermata1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1100));

        getContentPane().add(Schermata1, "card3");

        Schermata2.setBackground(new java.awt.Color(102, 0, 0));
        Schermata2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabella.setBackground(new java.awt.Color(102, 0, 0));

        P01.setBackground(new java.awt.Color(204, 0, 0));
        P01.setPreferredSize(new java.awt.Dimension(62, 62));

        E01.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E01.setText("1");

        javax.swing.GroupLayout P01Layout = new javax.swing.GroupLayout(P01);
        P01.setLayout(P01Layout);
        P01Layout.setHorizontalGroup(
            P01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(E01, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        P01Layout.setVerticalGroup(
            P01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(E01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P02.setBackground(new java.awt.Color(204, 0, 0));
        P02.setPreferredSize(new java.awt.Dimension(62, 62));

        E02.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E02.setText("2");

        javax.swing.GroupLayout P02Layout = new javax.swing.GroupLayout(P02);
        P02.setLayout(P02Layout);
        P02Layout.setHorizontalGroup(
            P02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P02Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E02)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P02Layout.setVerticalGroup(
            P02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P02Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E02)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P04.setBackground(new java.awt.Color(204, 0, 0));
        P04.setPreferredSize(new java.awt.Dimension(62, 62));

        E04.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E04.setText("4");

        javax.swing.GroupLayout P04Layout = new javax.swing.GroupLayout(P04);
        P04.setLayout(P04Layout);
        P04Layout.setHorizontalGroup(
            P04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P04Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E04)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P04Layout.setVerticalGroup(
            P04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P04Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E04)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P05.setBackground(new java.awt.Color(204, 0, 0));
        P05.setPreferredSize(new java.awt.Dimension(62, 62));

        E05.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E05.setText("5");

        javax.swing.GroupLayout P05Layout = new javax.swing.GroupLayout(P05);
        P05.setLayout(P05Layout);
        P05Layout.setHorizontalGroup(
            P05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P05Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E05)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P05Layout.setVerticalGroup(
            P05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P05Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E05)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P03.setBackground(new java.awt.Color(204, 0, 0));
        P03.setPreferredSize(new java.awt.Dimension(62, 62));

        E03.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E03.setText("3");

        javax.swing.GroupLayout P03Layout = new javax.swing.GroupLayout(P03);
        P03.setLayout(P03Layout);
        P03Layout.setHorizontalGroup(
            P03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P03Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E03)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P03Layout.setVerticalGroup(
            P03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P03Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E03)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P10.setBackground(new java.awt.Color(204, 0, 0));
        P10.setPreferredSize(new java.awt.Dimension(62, 62));

        E10.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E10.setText("10");

        javax.swing.GroupLayout P10Layout = new javax.swing.GroupLayout(P10);
        P10.setLayout(P10Layout);
        P10Layout.setHorizontalGroup(
            P10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(E10, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        P10Layout.setVerticalGroup(
            P10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(E10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        P06.setBackground(new java.awt.Color(204, 0, 0));
        P06.setPreferredSize(new java.awt.Dimension(62, 62));

        E06.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E06.setText("6");

        javax.swing.GroupLayout P06Layout = new javax.swing.GroupLayout(P06);
        P06.setLayout(P06Layout);
        P06Layout.setHorizontalGroup(
            P06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P06Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E06)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P06Layout.setVerticalGroup(
            P06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P06Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E06)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P07.setBackground(new java.awt.Color(204, 0, 0));
        P07.setPreferredSize(new java.awt.Dimension(62, 62));

        E07.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E07.setText("7");

        javax.swing.GroupLayout P07Layout = new javax.swing.GroupLayout(P07);
        P07.setLayout(P07Layout);
        P07Layout.setHorizontalGroup(
            P07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P07Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E07)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P07Layout.setVerticalGroup(
            P07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P07Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E07)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P08.setBackground(new java.awt.Color(204, 0, 0));
        P08.setPreferredSize(new java.awt.Dimension(62, 62));

        E08.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E08.setText("8");

        javax.swing.GroupLayout P08Layout = new javax.swing.GroupLayout(P08);
        P08.setLayout(P08Layout);
        P08Layout.setHorizontalGroup(
            P08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P08Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E08)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P08Layout.setVerticalGroup(
            P08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P08Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E08)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P09.setBackground(new java.awt.Color(204, 0, 0));
        P09.setPreferredSize(new java.awt.Dimension(62, 62));

        E09.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E09.setText("9");

        javax.swing.GroupLayout P09Layout = new javax.swing.GroupLayout(P09);
        P09.setLayout(P09Layout);
        P09Layout.setHorizontalGroup(
            P09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
            .addGroup(P09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P09Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E09)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P09Layout.setVerticalGroup(
            P09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P09Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E09)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P11.setBackground(new java.awt.Color(204, 0, 0));
        P11.setPreferredSize(new java.awt.Dimension(62, 62));

        E11.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E11.setText("11");

        javax.swing.GroupLayout P11Layout = new javax.swing.GroupLayout(P11);
        P11.setLayout(P11Layout);
        P11Layout.setHorizontalGroup(
            P11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(E11, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        P11Layout.setVerticalGroup(
            P11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(E11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P12.setBackground(new java.awt.Color(204, 0, 0));
        P12.setPreferredSize(new java.awt.Dimension(62, 62));

        E12.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E12.setText("12");

        javax.swing.GroupLayout P12Layout = new javax.swing.GroupLayout(P12);
        P12.setLayout(P12Layout);
        P12Layout.setHorizontalGroup(
            P12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(E12, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        P12Layout.setVerticalGroup(
            P12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(E12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P13.setBackground(new java.awt.Color(204, 0, 0));
        P13.setPreferredSize(new java.awt.Dimension(62, 62));

        E13.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E13.setText("13");

        javax.swing.GroupLayout P13Layout = new javax.swing.GroupLayout(P13);
        P13.setLayout(P13Layout);
        P13Layout.setHorizontalGroup(
            P13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(E13, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        P13Layout.setVerticalGroup(
            P13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(E13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P14.setBackground(new java.awt.Color(204, 0, 0));
        P14.setPreferredSize(new java.awt.Dimension(62, 62));

        E14.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E14.setText("14");

        javax.swing.GroupLayout P14Layout = new javax.swing.GroupLayout(P14);
        P14.setLayout(P14Layout);
        P14Layout.setHorizontalGroup(
            P14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(E14, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
        P14Layout.setVerticalGroup(
            P14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(E14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P15.setBackground(new java.awt.Color(204, 0, 0));
        P15.setPreferredSize(new java.awt.Dimension(62, 62));

        E15.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E15.setText("15");

        javax.swing.GroupLayout P15Layout = new javax.swing.GroupLayout(P15);
        P15.setLayout(P15Layout);
        P15Layout.setHorizontalGroup(
            P15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P15Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E15)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P15Layout.setVerticalGroup(
            P15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P15Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E15)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P16.setBackground(new java.awt.Color(204, 0, 0));
        P16.setPreferredSize(new java.awt.Dimension(62, 62));

        E16.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E16.setText("16");

        javax.swing.GroupLayout P16Layout = new javax.swing.GroupLayout(P16);
        P16.setLayout(P16Layout);
        P16Layout.setHorizontalGroup(
            P16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P16Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E16)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P16Layout.setVerticalGroup(
            P16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P16Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E16)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P17.setBackground(new java.awt.Color(204, 0, 0));
        P17.setPreferredSize(new java.awt.Dimension(62, 62));

        E17.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E17.setText("17");

        javax.swing.GroupLayout P17Layout = new javax.swing.GroupLayout(P17);
        P17.setLayout(P17Layout);
        P17Layout.setHorizontalGroup(
            P17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P17Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E17)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P17Layout.setVerticalGroup(
            P17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P17Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E17)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P18.setBackground(new java.awt.Color(204, 0, 0));
        P18.setPreferredSize(new java.awt.Dimension(62, 62));

        E18.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E18.setText("18");

        javax.swing.GroupLayout P18Layout = new javax.swing.GroupLayout(P18);
        P18.setLayout(P18Layout);
        P18Layout.setHorizontalGroup(
            P18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P18Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E18)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P18Layout.setVerticalGroup(
            P18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P18Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E18)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P19.setBackground(new java.awt.Color(204, 0, 0));
        P19.setPreferredSize(new java.awt.Dimension(62, 62));

        E19.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E19.setText("19");

        javax.swing.GroupLayout P19Layout = new javax.swing.GroupLayout(P19);
        P19.setLayout(P19Layout);
        P19Layout.setHorizontalGroup(
            P19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P19Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E19)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P19Layout.setVerticalGroup(
            P19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P19Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E19)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P20.setBackground(new java.awt.Color(204, 0, 0));
        P20.setPreferredSize(new java.awt.Dimension(62, 62));

        E20.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E20.setText("20");

        javax.swing.GroupLayout P20Layout = new javax.swing.GroupLayout(P20);
        P20.setLayout(P20Layout);
        P20Layout.setHorizontalGroup(
            P20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P20Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E20)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P20Layout.setVerticalGroup(
            P20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P20Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E20)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P25.setBackground(new java.awt.Color(204, 0, 0));
        P25.setPreferredSize(new java.awt.Dimension(62, 62));

        E25.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E25.setText("25");

        javax.swing.GroupLayout P25Layout = new javax.swing.GroupLayout(P25);
        P25.setLayout(P25Layout);
        P25Layout.setHorizontalGroup(
            P25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P25Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E25)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P25Layout.setVerticalGroup(
            P25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P25Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E25)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P21.setBackground(new java.awt.Color(204, 0, 0));
        P21.setPreferredSize(new java.awt.Dimension(62, 62));

        E21.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E21.setText("21");

        javax.swing.GroupLayout P21Layout = new javax.swing.GroupLayout(P21);
        P21.setLayout(P21Layout);
        P21Layout.setHorizontalGroup(
            P21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P21Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E21)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P21Layout.setVerticalGroup(
            P21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P21Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E21)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P22.setBackground(new java.awt.Color(204, 0, 0));
        P22.setPreferredSize(new java.awt.Dimension(62, 62));

        E22.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E22.setText("22");

        javax.swing.GroupLayout P22Layout = new javax.swing.GroupLayout(P22);
        P22.setLayout(P22Layout);
        P22Layout.setHorizontalGroup(
            P22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P22Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E22)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P22Layout.setVerticalGroup(
            P22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P22Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E22)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P23.setBackground(new java.awt.Color(204, 0, 0));
        P23.setPreferredSize(new java.awt.Dimension(62, 62));

        E23.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E23.setText("23");

        javax.swing.GroupLayout P23Layout = new javax.swing.GroupLayout(P23);
        P23.setLayout(P23Layout);
        P23Layout.setHorizontalGroup(
            P23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P23Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E23)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P23Layout.setVerticalGroup(
            P23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P23Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E23)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P24.setBackground(new java.awt.Color(204, 0, 0));
        P24.setPreferredSize(new java.awt.Dimension(62, 62));

        E24.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E24.setText("24");

        javax.swing.GroupLayout P24Layout = new javax.swing.GroupLayout(P24);
        P24.setLayout(P24Layout);
        P24Layout.setHorizontalGroup(
            P24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P24Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E24)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P24Layout.setVerticalGroup(
            P24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P24Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E24)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P26.setBackground(new java.awt.Color(204, 0, 0));
        P26.setPreferredSize(new java.awt.Dimension(62, 62));

        E26.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E26.setText("26");

        javax.swing.GroupLayout P26Layout = new javax.swing.GroupLayout(P26);
        P26.setLayout(P26Layout);
        P26Layout.setHorizontalGroup(
            P26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P26Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E26)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P26Layout.setVerticalGroup(
            P26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P26Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E26)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P27.setBackground(new java.awt.Color(204, 0, 0));
        P27.setPreferredSize(new java.awt.Dimension(62, 62));

        E27.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E27.setText("27");

        javax.swing.GroupLayout P27Layout = new javax.swing.GroupLayout(P27);
        P27.setLayout(P27Layout);
        P27Layout.setHorizontalGroup(
            P27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P27Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E27)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P27Layout.setVerticalGroup(
            P27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P27Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E27)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P28.setBackground(new java.awt.Color(204, 0, 0));
        P28.setPreferredSize(new java.awt.Dimension(62, 62));

        E28.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E28.setText("28");

        javax.swing.GroupLayout P28Layout = new javax.swing.GroupLayout(P28);
        P28.setLayout(P28Layout);
        P28Layout.setHorizontalGroup(
            P28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P28Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E28)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P28Layout.setVerticalGroup(
            P28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P28Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E28)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P29.setBackground(new java.awt.Color(204, 0, 0));
        P29.setPreferredSize(new java.awt.Dimension(62, 62));

        E29.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E29.setText("29");

        javax.swing.GroupLayout P29Layout = new javax.swing.GroupLayout(P29);
        P29.setLayout(P29Layout);
        P29Layout.setHorizontalGroup(
            P29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P29Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P29Layout.setVerticalGroup(
            P29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P29Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P30.setBackground(new java.awt.Color(204, 0, 0));
        P30.setPreferredSize(new java.awt.Dimension(62, 62));

        E30.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E30.setText("30");

        javax.swing.GroupLayout P30Layout = new javax.swing.GroupLayout(P30);
        P30.setLayout(P30Layout);
        P30Layout.setHorizontalGroup(
            P30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P30Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E30)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P30Layout.setVerticalGroup(
            P30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P30Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E30)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P50.setBackground(new java.awt.Color(204, 0, 0));
        P50.setPreferredSize(new java.awt.Dimension(62, 62));

        E50.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E50.setText("50");

        javax.swing.GroupLayout P50Layout = new javax.swing.GroupLayout(P50);
        P50.setLayout(P50Layout);
        P50Layout.setHorizontalGroup(
            P50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P50Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E50)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P50Layout.setVerticalGroup(
            P50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P50Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E50)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P55.setBackground(new java.awt.Color(204, 0, 0));
        P55.setPreferredSize(new java.awt.Dimension(62, 62));

        E55.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E55.setText("55");

        javax.swing.GroupLayout P55Layout = new javax.swing.GroupLayout(P55);
        P55.setLayout(P55Layout);
        P55Layout.setHorizontalGroup(
            P55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P55Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E55)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P55Layout.setVerticalGroup(
            P55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P55Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E55)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P31.setBackground(new java.awt.Color(204, 0, 0));
        P31.setPreferredSize(new java.awt.Dimension(62, 62));

        E31.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E31.setText("31");

        javax.swing.GroupLayout P31Layout = new javax.swing.GroupLayout(P31);
        P31.setLayout(P31Layout);
        P31Layout.setHorizontalGroup(
            P31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P31Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E31)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P31Layout.setVerticalGroup(
            P31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P31Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E31)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P32.setBackground(new java.awt.Color(204, 0, 0));
        P32.setPreferredSize(new java.awt.Dimension(62, 62));

        E32.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E32.setText("32");

        javax.swing.GroupLayout P32Layout = new javax.swing.GroupLayout(P32);
        P32.setLayout(P32Layout);
        P32Layout.setHorizontalGroup(
            P32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P32Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E32)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P32Layout.setVerticalGroup(
            P32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P32Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E32)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P51.setBackground(new java.awt.Color(204, 0, 0));
        P51.setPreferredSize(new java.awt.Dimension(62, 62));

        E51.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E51.setText("51");

        javax.swing.GroupLayout P51Layout = new javax.swing.GroupLayout(P51);
        P51.setLayout(P51Layout);
        P51Layout.setHorizontalGroup(
            P51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P51Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E51)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P51Layout.setVerticalGroup(
            P51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P51Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E51)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P52.setBackground(new java.awt.Color(204, 0, 0));
        P52.setPreferredSize(new java.awt.Dimension(62, 62));

        E52.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E52.setText("52");

        javax.swing.GroupLayout P52Layout = new javax.swing.GroupLayout(P52);
        P52.setLayout(P52Layout);
        P52Layout.setHorizontalGroup(
            P52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P52Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E52)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P52Layout.setVerticalGroup(
            P52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P52Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E52)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P53.setBackground(new java.awt.Color(204, 0, 0));
        P53.setPreferredSize(new java.awt.Dimension(62, 62));

        E53.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E53.setText("53");

        javax.swing.GroupLayout P53Layout = new javax.swing.GroupLayout(P53);
        P53.setLayout(P53Layout);
        P53Layout.setHorizontalGroup(
            P53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P53Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E53)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P53Layout.setVerticalGroup(
            P53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P53Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E53)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P54.setBackground(new java.awt.Color(204, 0, 0));
        P54.setPreferredSize(new java.awt.Dimension(62, 62));

        E54.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E54.setText("54");

        javax.swing.GroupLayout P54Layout = new javax.swing.GroupLayout(P54);
        P54.setLayout(P54Layout);
        P54Layout.setHorizontalGroup(
            P54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P54Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E54)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P54Layout.setVerticalGroup(
            P54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P54Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E54)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P56.setBackground(new java.awt.Color(204, 0, 0));
        P56.setPreferredSize(new java.awt.Dimension(62, 62));

        E56.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E56.setText("56");

        javax.swing.GroupLayout P56Layout = new javax.swing.GroupLayout(P56);
        P56.setLayout(P56Layout);
        P56Layout.setHorizontalGroup(
            P56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P56Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E56)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P56Layout.setVerticalGroup(
            P56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P56Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E56)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P57.setBackground(new java.awt.Color(204, 0, 0));
        P57.setPreferredSize(new java.awt.Dimension(62, 62));

        E57.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E57.setText("57");

        javax.swing.GroupLayout P57Layout = new javax.swing.GroupLayout(P57);
        P57.setLayout(P57Layout);
        P57Layout.setHorizontalGroup(
            P57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P57Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E57)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P57Layout.setVerticalGroup(
            P57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P57Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E57)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P34.setBackground(new java.awt.Color(204, 0, 0));
        P34.setPreferredSize(new java.awt.Dimension(62, 62));

        E34.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E34.setText("34");

        javax.swing.GroupLayout P34Layout = new javax.swing.GroupLayout(P34);
        P34.setLayout(P34Layout);
        P34Layout.setHorizontalGroup(
            P34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P34Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E34)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P34Layout.setVerticalGroup(
            P34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P34Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E34)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P58.setBackground(new java.awt.Color(204, 0, 0));
        P58.setPreferredSize(new java.awt.Dimension(62, 62));

        E58.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E58.setText("58");

        javax.swing.GroupLayout P58Layout = new javax.swing.GroupLayout(P58);
        P58.setLayout(P58Layout);
        P58Layout.setHorizontalGroup(
            P58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P58Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E58)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P58Layout.setVerticalGroup(
            P58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P58Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E58)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P35.setBackground(new java.awt.Color(204, 0, 0));
        P35.setPreferredSize(new java.awt.Dimension(62, 62));

        E35.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E35.setText("35");

        javax.swing.GroupLayout P35Layout = new javax.swing.GroupLayout(P35);
        P35.setLayout(P35Layout);
        P35Layout.setHorizontalGroup(
            P35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P35Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E35)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P35Layout.setVerticalGroup(
            P35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P35Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E35)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P59.setBackground(new java.awt.Color(204, 0, 0));
        P59.setPreferredSize(new java.awt.Dimension(62, 62));

        E59.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E59.setText("59");

        javax.swing.GroupLayout P59Layout = new javax.swing.GroupLayout(P59);
        P59.setLayout(P59Layout);
        P59Layout.setHorizontalGroup(
            P59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P59Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E59)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P59Layout.setVerticalGroup(
            P59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P59Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E59)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P33.setBackground(new java.awt.Color(204, 0, 0));
        P33.setPreferredSize(new java.awt.Dimension(62, 62));

        E33.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E33.setText("33");

        javax.swing.GroupLayout P33Layout = new javax.swing.GroupLayout(P33);
        P33.setLayout(P33Layout);
        P33Layout.setHorizontalGroup(
            P33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P33Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E33)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P33Layout.setVerticalGroup(
            P33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P33Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E33)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P60.setBackground(new java.awt.Color(204, 0, 0));
        P60.setPreferredSize(new java.awt.Dimension(62, 62));

        E60.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E60.setText("60");

        javax.swing.GroupLayout P60Layout = new javax.swing.GroupLayout(P60);
        P60.setLayout(P60Layout);
        P60Layout.setHorizontalGroup(
            P60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P60Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E60)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P60Layout.setVerticalGroup(
            P60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P60Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E60)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P40.setBackground(new java.awt.Color(204, 0, 0));
        P40.setPreferredSize(new java.awt.Dimension(62, 62));

        E40.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E40.setText("40");

        javax.swing.GroupLayout P40Layout = new javax.swing.GroupLayout(P40);
        P40.setLayout(P40Layout);
        P40Layout.setHorizontalGroup(
            P40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P40Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E40)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P40Layout.setVerticalGroup(
            P40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P40Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E40)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P41.setBackground(new java.awt.Color(204, 0, 0));
        P41.setPreferredSize(new java.awt.Dimension(62, 62));

        E41.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E41.setText("41");

        javax.swing.GroupLayout P41Layout = new javax.swing.GroupLayout(P41);
        P41.setLayout(P41Layout);
        P41Layout.setHorizontalGroup(
            P41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P41Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E41)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P41Layout.setVerticalGroup(
            P41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P41Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E41)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P36.setBackground(new java.awt.Color(204, 0, 0));
        P36.setPreferredSize(new java.awt.Dimension(62, 62));

        E36.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E36.setText("36");

        javax.swing.GroupLayout P36Layout = new javax.swing.GroupLayout(P36);
        P36.setLayout(P36Layout);
        P36Layout.setHorizontalGroup(
            P36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P36Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E36)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P36Layout.setVerticalGroup(
            P36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P36Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E36)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P42.setBackground(new java.awt.Color(204, 0, 0));
        P42.setPreferredSize(new java.awt.Dimension(62, 62));

        E42.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E42.setText("42");

        javax.swing.GroupLayout P42Layout = new javax.swing.GroupLayout(P42);
        P42.setLayout(P42Layout);
        P42Layout.setHorizontalGroup(
            P42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P42Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E42)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P42Layout.setVerticalGroup(
            P42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P42Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E42)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P43.setBackground(new java.awt.Color(204, 0, 0));
        P43.setPreferredSize(new java.awt.Dimension(62, 62));

        E43.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E43.setText("43");

        javax.swing.GroupLayout P43Layout = new javax.swing.GroupLayout(P43);
        P43.setLayout(P43Layout);
        P43Layout.setHorizontalGroup(
            P43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P43Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(E43)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        P43Layout.setVerticalGroup(
            P43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P43Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(E43)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        P44.setBackground(new java.awt.Color(204, 0, 0));
        P44.setPreferredSize(new java.awt.Dimension(62, 62));

        E44.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E44.setText("44");

        javax.swing.GroupLayout P44Layout = new javax.swing.GroupLayout(P44);
        P44.setLayout(P44Layout);
        P44Layout.setHorizontalGroup(
            P44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P44Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E44)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P44Layout.setVerticalGroup(
            P44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P44Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E44)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P45.setBackground(new java.awt.Color(204, 0, 0));
        P45.setPreferredSize(new java.awt.Dimension(62, 62));

        E45.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E45.setText("45");

        javax.swing.GroupLayout P45Layout = new javax.swing.GroupLayout(P45);
        P45.setLayout(P45Layout);
        P45Layout.setHorizontalGroup(
            P45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P45Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E45)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P45Layout.setVerticalGroup(
            P45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P45Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E45)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P37.setBackground(new java.awt.Color(204, 0, 0));
        P37.setPreferredSize(new java.awt.Dimension(62, 62));

        E37.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E37.setText("37");

        javax.swing.GroupLayout P37Layout = new javax.swing.GroupLayout(P37);
        P37.setLayout(P37Layout);
        P37Layout.setHorizontalGroup(
            P37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P37Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E37)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P37Layout.setVerticalGroup(
            P37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P37Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E37)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P46.setBackground(new java.awt.Color(204, 0, 0));
        P46.setPreferredSize(new java.awt.Dimension(62, 62));

        E46.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E46.setText("46");

        javax.swing.GroupLayout P46Layout = new javax.swing.GroupLayout(P46);
        P46.setLayout(P46Layout);
        P46Layout.setHorizontalGroup(
            P46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P46Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E46)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P46Layout.setVerticalGroup(
            P46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P46Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E46)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P38.setBackground(new java.awt.Color(204, 0, 0));
        P38.setPreferredSize(new java.awt.Dimension(62, 62));

        E38.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E38.setText("38");

        javax.swing.GroupLayout P38Layout = new javax.swing.GroupLayout(P38);
        P38.setLayout(P38Layout);
        P38Layout.setHorizontalGroup(
            P38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P38Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E38)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P38Layout.setVerticalGroup(
            P38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P38Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E38)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P47.setBackground(new java.awt.Color(204, 0, 0));
        P47.setPreferredSize(new java.awt.Dimension(62, 62));

        E47.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E47.setText("47");

        javax.swing.GroupLayout P47Layout = new javax.swing.GroupLayout(P47);
        P47.setLayout(P47Layout);
        P47Layout.setHorizontalGroup(
            P47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P47Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E47)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P47Layout.setVerticalGroup(
            P47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P47Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E47)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P39.setBackground(new java.awt.Color(204, 0, 0));
        P39.setPreferredSize(new java.awt.Dimension(62, 62));

        E39.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E39.setText("39");

        javax.swing.GroupLayout P39Layout = new javax.swing.GroupLayout(P39);
        P39.setLayout(P39Layout);
        P39Layout.setHorizontalGroup(
            P39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
            .addGroup(P39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P39Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E39)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P39Layout.setVerticalGroup(
            P39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P39Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E39)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P48.setBackground(new java.awt.Color(204, 0, 0));
        P48.setPreferredSize(new java.awt.Dimension(62, 62));

        E48.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E48.setText("48");

        javax.swing.GroupLayout P48Layout = new javax.swing.GroupLayout(P48);
        P48.setLayout(P48Layout);
        P48Layout.setHorizontalGroup(
            P48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P48Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E48)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P48Layout.setVerticalGroup(
            P48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P48Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E48)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P49.setBackground(new java.awt.Color(204, 0, 0));
        P49.setPreferredSize(new java.awt.Dimension(62, 62));

        E49.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E49.setText("49");

        javax.swing.GroupLayout P49Layout = new javax.swing.GroupLayout(P49);
        P49.setLayout(P49Layout);
        P49Layout.setHorizontalGroup(
            P49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P49Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E49)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P49Layout.setVerticalGroup(
            P49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P49Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E49)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P61.setBackground(new java.awt.Color(204, 0, 0));
        P61.setPreferredSize(new java.awt.Dimension(62, 62));

        E61.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E61.setText("61");

        javax.swing.GroupLayout P61Layout = new javax.swing.GroupLayout(P61);
        P61.setLayout(P61Layout);
        P61Layout.setHorizontalGroup(
            P61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P61Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E61)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P61Layout.setVerticalGroup(
            P61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P61Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E61)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P62.setBackground(new java.awt.Color(204, 0, 0));
        P62.setPreferredSize(new java.awt.Dimension(62, 62));

        E62.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E62.setText("62");

        javax.swing.GroupLayout P62Layout = new javax.swing.GroupLayout(P62);
        P62.setLayout(P62Layout);
        P62Layout.setHorizontalGroup(
            P62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P62Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E62)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P62Layout.setVerticalGroup(
            P62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P62Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E62)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P63.setBackground(new java.awt.Color(204, 0, 0));
        P63.setPreferredSize(new java.awt.Dimension(62, 62));

        E63.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E63.setText("63");

        javax.swing.GroupLayout P63Layout = new javax.swing.GroupLayout(P63);
        P63.setLayout(P63Layout);
        P63Layout.setHorizontalGroup(
            P63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P63Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E63)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P63Layout.setVerticalGroup(
            P63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P63Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E63)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P64.setBackground(new java.awt.Color(204, 0, 0));
        P64.setPreferredSize(new java.awt.Dimension(62, 62));

        E64.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E64.setText("64");

        javax.swing.GroupLayout P64Layout = new javax.swing.GroupLayout(P64);
        P64.setLayout(P64Layout);
        P64Layout.setHorizontalGroup(
            P64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P64Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E64)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P64Layout.setVerticalGroup(
            P64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P64Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E64)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P65.setBackground(new java.awt.Color(204, 0, 0));
        P65.setPreferredSize(new java.awt.Dimension(62, 62));

        E65.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E65.setText("65");

        javax.swing.GroupLayout P65Layout = new javax.swing.GroupLayout(P65);
        P65.setLayout(P65Layout);
        P65Layout.setHorizontalGroup(
            P65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P65Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E65)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P65Layout.setVerticalGroup(
            P65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P65Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E65)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P75.setBackground(new java.awt.Color(204, 0, 0));
        P75.setPreferredSize(new java.awt.Dimension(62, 62));

        E75.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E75.setText("75");

        javax.swing.GroupLayout P75Layout = new javax.swing.GroupLayout(P75);
        P75.setLayout(P75Layout);
        P75Layout.setHorizontalGroup(
            P75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P75Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E75)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P75Layout.setVerticalGroup(
            P75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P75Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E75)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P74.setBackground(new java.awt.Color(204, 0, 0));
        P74.setPreferredSize(new java.awt.Dimension(62, 62));

        E74.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E74.setText("74");

        javax.swing.GroupLayout P74Layout = new javax.swing.GroupLayout(P74);
        P74.setLayout(P74Layout);
        P74Layout.setHorizontalGroup(
            P74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P74Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E74)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P74Layout.setVerticalGroup(
            P74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P74Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E74)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P73.setBackground(new java.awt.Color(204, 0, 0));
        P73.setPreferredSize(new java.awt.Dimension(62, 62));

        E73.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E73.setText("73");

        javax.swing.GroupLayout P73Layout = new javax.swing.GroupLayout(P73);
        P73.setLayout(P73Layout);
        P73Layout.setHorizontalGroup(
            P73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P73Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E73)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P73Layout.setVerticalGroup(
            P73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P73Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E73)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P72.setBackground(new java.awt.Color(204, 0, 0));
        P72.setPreferredSize(new java.awt.Dimension(62, 62));

        E72.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E72.setText("72");

        javax.swing.GroupLayout P72Layout = new javax.swing.GroupLayout(P72);
        P72.setLayout(P72Layout);
        P72Layout.setHorizontalGroup(
            P72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P72Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E72)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P72Layout.setVerticalGroup(
            P72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P72Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E72)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P71.setBackground(new java.awt.Color(204, 0, 0));
        P71.setPreferredSize(new java.awt.Dimension(62, 62));

        E71.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E71.setText("71");

        javax.swing.GroupLayout P71Layout = new javax.swing.GroupLayout(P71);
        P71.setLayout(P71Layout);
        P71Layout.setHorizontalGroup(
            P71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P71Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E71)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P71Layout.setVerticalGroup(
            P71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P71Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E71)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P81.setBackground(new java.awt.Color(204, 0, 0));
        P81.setPreferredSize(new java.awt.Dimension(62, 62));

        E81.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E81.setText("81");

        javax.swing.GroupLayout P81Layout = new javax.swing.GroupLayout(P81);
        P81.setLayout(P81Layout);
        P81Layout.setHorizontalGroup(
            P81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P81Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E81)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P81Layout.setVerticalGroup(
            P81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P81Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E81)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P82.setBackground(new java.awt.Color(204, 0, 0));
        P82.setPreferredSize(new java.awt.Dimension(62, 62));

        E82.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E82.setText("82");

        javax.swing.GroupLayout P82Layout = new javax.swing.GroupLayout(P82);
        P82.setLayout(P82Layout);
        P82Layout.setHorizontalGroup(
            P82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P82Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E82)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P82Layout.setVerticalGroup(
            P82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P82Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E82)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P83.setBackground(new java.awt.Color(204, 0, 0));
        P83.setPreferredSize(new java.awt.Dimension(62, 62));

        E83.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E83.setText("83");

        javax.swing.GroupLayout P83Layout = new javax.swing.GroupLayout(P83);
        P83.setLayout(P83Layout);
        P83Layout.setHorizontalGroup(
            P83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P83Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E83)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P83Layout.setVerticalGroup(
            P83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P83Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E83)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P84.setBackground(new java.awt.Color(204, 0, 0));
        P84.setPreferredSize(new java.awt.Dimension(62, 62));

        E84.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E84.setText("84");

        javax.swing.GroupLayout P84Layout = new javax.swing.GroupLayout(P84);
        P84.setLayout(P84Layout);
        P84Layout.setHorizontalGroup(
            P84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P84Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E84)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P84Layout.setVerticalGroup(
            P84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P84Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E84)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P85.setBackground(new java.awt.Color(204, 0, 0));
        P85.setPreferredSize(new java.awt.Dimension(62, 62));

        E85.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E85.setText("85");

        javax.swing.GroupLayout P85Layout = new javax.swing.GroupLayout(P85);
        P85.setLayout(P85Layout);
        P85Layout.setHorizontalGroup(
            P85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P85Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E85)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P85Layout.setVerticalGroup(
            P85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P85Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E85)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P86.setBackground(new java.awt.Color(204, 0, 0));
        P86.setPreferredSize(new java.awt.Dimension(62, 62));

        E86.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E86.setText("86");

        javax.swing.GroupLayout P86Layout = new javax.swing.GroupLayout(P86);
        P86.setLayout(P86Layout);
        P86Layout.setHorizontalGroup(
            P86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P86Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E86)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P86Layout.setVerticalGroup(
            P86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P86Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E86)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P76.setBackground(new java.awt.Color(204, 0, 0));
        P76.setPreferredSize(new java.awt.Dimension(62, 62));

        E76.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E76.setText("76");

        javax.swing.GroupLayout P76Layout = new javax.swing.GroupLayout(P76);
        P76.setLayout(P76Layout);
        P76Layout.setHorizontalGroup(
            P76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P76Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E76)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P76Layout.setVerticalGroup(
            P76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P76Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E76)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P66.setBackground(new java.awt.Color(204, 0, 0));
        P66.setPreferredSize(new java.awt.Dimension(62, 62));

        E66.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E66.setText("66");

        javax.swing.GroupLayout P66Layout = new javax.swing.GroupLayout(P66);
        P66.setLayout(P66Layout);
        P66Layout.setHorizontalGroup(
            P66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P66Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E66)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P66Layout.setVerticalGroup(
            P66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P66Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E66)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P67.setBackground(new java.awt.Color(204, 0, 0));
        P67.setPreferredSize(new java.awt.Dimension(62, 62));

        E67.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E67.setText("67");

        javax.swing.GroupLayout P67Layout = new javax.swing.GroupLayout(P67);
        P67.setLayout(P67Layout);
        P67Layout.setHorizontalGroup(
            P67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P67Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E67)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P67Layout.setVerticalGroup(
            P67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P67Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E67)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P77.setBackground(new java.awt.Color(204, 0, 0));
        P77.setPreferredSize(new java.awt.Dimension(62, 62));

        E77.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E77.setText("77");

        javax.swing.GroupLayout P77Layout = new javax.swing.GroupLayout(P77);
        P77.setLayout(P77Layout);
        P77Layout.setHorizontalGroup(
            P77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P77Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E77)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P77Layout.setVerticalGroup(
            P77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P77Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E77)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P87.setBackground(new java.awt.Color(204, 0, 0));
        P87.setPreferredSize(new java.awt.Dimension(62, 62));

        E87.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E87.setText("87");

        javax.swing.GroupLayout P87Layout = new javax.swing.GroupLayout(P87);
        P87.setLayout(P87Layout);
        P87Layout.setHorizontalGroup(
            P87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P87Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E87)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P87Layout.setVerticalGroup(
            P87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P87Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E87)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P89.setBackground(new java.awt.Color(204, 0, 0));
        P89.setPreferredSize(new java.awt.Dimension(62, 62));

        E89.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E89.setText("89");

        javax.swing.GroupLayout P89Layout = new javax.swing.GroupLayout(P89);
        P89.setLayout(P89Layout);
        P89Layout.setHorizontalGroup(
            P89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P89Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E89)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P89Layout.setVerticalGroup(
            P89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P89Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E89)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P88.setBackground(new java.awt.Color(204, 0, 0));
        P88.setPreferredSize(new java.awt.Dimension(62, 62));

        E88.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E88.setText("88");

        javax.swing.GroupLayout P88Layout = new javax.swing.GroupLayout(P88);
        P88.setLayout(P88Layout);
        P88Layout.setHorizontalGroup(
            P88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P88Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E88)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P88Layout.setVerticalGroup(
            P88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P88Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E88)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P78.setBackground(new java.awt.Color(204, 0, 0));
        P78.setPreferredSize(new java.awt.Dimension(62, 62));

        E78.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E78.setText("78");

        javax.swing.GroupLayout P78Layout = new javax.swing.GroupLayout(P78);
        P78.setLayout(P78Layout);
        P78Layout.setHorizontalGroup(
            P78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P78Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E78)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P78Layout.setVerticalGroup(
            P78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P78Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E78)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P68.setBackground(new java.awt.Color(204, 0, 0));
        P68.setPreferredSize(new java.awt.Dimension(62, 62));

        E68.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E68.setText("68");

        javax.swing.GroupLayout P68Layout = new javax.swing.GroupLayout(P68);
        P68.setLayout(P68Layout);
        P68Layout.setHorizontalGroup(
            P68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P68Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E68)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P68Layout.setVerticalGroup(
            P68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P68Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E68)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P69.setBackground(new java.awt.Color(204, 0, 0));
        P69.setPreferredSize(new java.awt.Dimension(62, 62));

        E69.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E69.setText("69");

        javax.swing.GroupLayout P69Layout = new javax.swing.GroupLayout(P69);
        P69.setLayout(P69Layout);
        P69Layout.setHorizontalGroup(
            P69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
            .addGroup(P69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P69Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E69)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P69Layout.setVerticalGroup(
            P69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P69Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E69)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P79.setBackground(new java.awt.Color(204, 0, 0));
        P79.setPreferredSize(new java.awt.Dimension(62, 62));

        E79.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E79.setText("79");

        javax.swing.GroupLayout P79Layout = new javax.swing.GroupLayout(P79);
        P79.setLayout(P79Layout);
        P79Layout.setHorizontalGroup(
            P79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P79Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E79)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P79Layout.setVerticalGroup(
            P79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(P79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P79Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E79)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P80.setBackground(new java.awt.Color(204, 0, 0));
        P80.setPreferredSize(new java.awt.Dimension(62, 62));

        E80.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E80.setText("80");

        javax.swing.GroupLayout P80Layout = new javax.swing.GroupLayout(P80);
        P80.setLayout(P80Layout);
        P80Layout.setHorizontalGroup(
            P80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P80Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E80)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P80Layout.setVerticalGroup(
            P80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P80Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E80)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P70.setBackground(new java.awt.Color(204, 0, 0));
        P70.setPreferredSize(new java.awt.Dimension(62, 62));

        E70.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E70.setText("70");

        javax.swing.GroupLayout P70Layout = new javax.swing.GroupLayout(P70);
        P70.setLayout(P70Layout);
        P70Layout.setHorizontalGroup(
            P70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P70Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E70)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P70Layout.setVerticalGroup(
            P70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P70Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E70)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        P90.setBackground(new java.awt.Color(204, 0, 0));
        P90.setPreferredSize(new java.awt.Dimension(62, 62));

        E90.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        E90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E90.setText("90");

        javax.swing.GroupLayout P90Layout = new javax.swing.GroupLayout(P90);
        P90.setLayout(P90Layout);
        P90Layout.setHorizontalGroup(
            P90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P90Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E90)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        P90Layout.setVerticalGroup(
            P90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(P90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(P90Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(E90)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout TabellaLayout = new javax.swing.GroupLayout(Tabella);
        Tabella.setLayout(TabellaLayout);
        TabellaLayout.setHorizontalGroup(
            TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabellaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabellaLayout.createSequentialGroup()
                        .addComponent(P11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabellaLayout.createSequentialGroup()
                        .addComponent(P01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabellaLayout.createSequentialGroup()
                        .addComponent(P21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabellaLayout.createSequentialGroup()
                        .addComponent(P41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabellaLayout.createSequentialGroup()
                        .addComponent(P31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabellaLayout.createSequentialGroup()
                        .addComponent(P51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabellaLayout.createSequentialGroup()
                        .addComponent(P71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabellaLayout.createSequentialGroup()
                        .addComponent(P61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TabellaLayout.createSequentialGroup()
                        .addComponent(P81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TabellaLayout.createSequentialGroup()
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P06, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P08, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P29, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(P19, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(P09, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TabellaLayout.createSequentialGroup()
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P59, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(P49, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(P39, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TabellaLayout.createSequentialGroup()
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(P78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P89, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(P79, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(P69, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TabellaLayout.setVerticalGroup(
            TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabellaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(P06, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P08, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P09, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(P16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(P26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(P36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(P46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(P56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(P66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P69, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P70, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(P76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P79, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P80, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TabellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(P86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P89, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Schermata2.add(Tabella, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 784));

        Gioc1.setBackground(new java.awt.Color(204, 204, 204));
        Gioc1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel105.setBackground(new java.awt.Color(255, 255, 255));
        jPanel105.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel105.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel105Layout = new javax.swing.GroupLayout(jPanel105);
        jPanel105.setLayout(jPanel105Layout);
        jPanel105Layout.setHorizontalGroup(
            jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel105Layout.setVerticalGroup(
            jPanel105Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel111.setBackground(new java.awt.Color(255, 255, 255));
        jPanel111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel111.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel111Layout = new javax.swing.GroupLayout(jPanel111);
        jPanel111.setLayout(jPanel111Layout);
        jPanel111Layout.setHorizontalGroup(
            jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel111Layout.setVerticalGroup(
            jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel112.setBackground(new java.awt.Color(255, 255, 255));
        jPanel112.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel112.setPreferredSize(new java.awt.Dimension(50, 50));

        Num6.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num6.setText("6");

        javax.swing.GroupLayout jPanel112Layout = new javax.swing.GroupLayout(jPanel112);
        jPanel112.setLayout(jPanel112Layout);
        jPanel112Layout.setHorizontalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel112Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel112Layout.setVerticalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel112Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel113.setBackground(new java.awt.Color(255, 255, 255));
        jPanel113.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel113.setPreferredSize(new java.awt.Dimension(50, 50));

        Num1.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num1.setText("1");

        javax.swing.GroupLayout jPanel113Layout = new javax.swing.GroupLayout(jPanel113);
        jPanel113.setLayout(jPanel113Layout);
        jPanel113Layout.setHorizontalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel113Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel113Layout.setVerticalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel113Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel114.setBackground(new java.awt.Color(255, 255, 255));
        jPanel114.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel114.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel114Layout = new javax.swing.GroupLayout(jPanel114);
        jPanel114.setLayout(jPanel114Layout);
        jPanel114Layout.setHorizontalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel114Layout.setVerticalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel115.setBackground(new java.awt.Color(255, 255, 255));
        jPanel115.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel115.setPreferredSize(new java.awt.Dimension(50, 50));

        Num11.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num11.setText("11");

        javax.swing.GroupLayout jPanel115Layout = new javax.swing.GroupLayout(jPanel115);
        jPanel115.setLayout(jPanel115Layout);
        jPanel115Layout.setHorizontalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel115Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel115Layout.setVerticalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel115Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel120.setBackground(new java.awt.Color(255, 255, 255));
        jPanel120.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel120.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel120Layout = new javax.swing.GroupLayout(jPanel120);
        jPanel120.setLayout(jPanel120Layout);
        jPanel120Layout.setHorizontalGroup(
            jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel120Layout.setVerticalGroup(
            jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel121.setBackground(new java.awt.Color(255, 255, 255));
        jPanel121.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel121.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel121Layout = new javax.swing.GroupLayout(jPanel121);
        jPanel121.setLayout(jPanel121Layout);
        jPanel121Layout.setHorizontalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel121Layout.setVerticalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel122.setBackground(new java.awt.Color(255, 255, 255));
        jPanel122.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel122.setPreferredSize(new java.awt.Dimension(50, 50));

        Num7.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num7.setText("7");

        javax.swing.GroupLayout jPanel122Layout = new javax.swing.GroupLayout(jPanel122);
        jPanel122.setLayout(jPanel122Layout);
        jPanel122Layout.setHorizontalGroup(
            jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel122Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel122Layout.setVerticalGroup(
            jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel122Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel123.setBackground(new java.awt.Color(255, 255, 255));
        jPanel123.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel123.setPreferredSize(new java.awt.Dimension(50, 50));

        Num8.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num8.setText("8");

        javax.swing.GroupLayout jPanel123Layout = new javax.swing.GroupLayout(jPanel123);
        jPanel123.setLayout(jPanel123Layout);
        jPanel123Layout.setHorizontalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel123Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel123Layout.setVerticalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel123Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel124.setBackground(new java.awt.Color(255, 255, 255));
        jPanel124.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel124.setPreferredSize(new java.awt.Dimension(50, 50));

        Num3.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num3.setText("3");

        javax.swing.GroupLayout jPanel124Layout = new javax.swing.GroupLayout(jPanel124);
        jPanel124.setLayout(jPanel124Layout);
        jPanel124Layout.setHorizontalGroup(
            jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel124Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel124Layout.setVerticalGroup(
            jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel124Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel125.setBackground(new java.awt.Color(255, 255, 255));
        jPanel125.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel125.setPreferredSize(new java.awt.Dimension(50, 50));

        Num2.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num2.setText("2");

        javax.swing.GroupLayout jPanel125Layout = new javax.swing.GroupLayout(jPanel125);
        jPanel125.setLayout(jPanel125Layout);
        jPanel125Layout.setHorizontalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel125Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel125Layout.setVerticalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel125Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel126.setBackground(new java.awt.Color(255, 255, 255));
        jPanel126.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel126.setPreferredSize(new java.awt.Dimension(50, 50));

        Num13.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num13.setText("13");

        javax.swing.GroupLayout jPanel126Layout = new javax.swing.GroupLayout(jPanel126);
        jPanel126.setLayout(jPanel126Layout);
        jPanel126Layout.setHorizontalGroup(
            jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel126Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num13)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel126Layout.setVerticalGroup(
            jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel126Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num13)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel127.setBackground(new java.awt.Color(255, 255, 255));
        jPanel127.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel127.setPreferredSize(new java.awt.Dimension(50, 50));

        Num12.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num12.setText("12");

        javax.swing.GroupLayout jPanel127Layout = new javax.swing.GroupLayout(jPanel127);
        jPanel127.setLayout(jPanel127Layout);
        jPanel127Layout.setHorizontalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel127Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num12)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel127Layout.setVerticalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel127Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num12)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel128.setBackground(new java.awt.Color(255, 255, 255));
        jPanel128.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel128.setPreferredSize(new java.awt.Dimension(50, 50));

        Num9.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num9.setText("9");

        javax.swing.GroupLayout jPanel128Layout = new javax.swing.GroupLayout(jPanel128);
        jPanel128.setLayout(jPanel128Layout);
        jPanel128Layout.setHorizontalGroup(
            jPanel128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel128Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num9)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel128Layout.setVerticalGroup(
            jPanel128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel128Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num9)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel129.setBackground(new java.awt.Color(255, 255, 255));
        jPanel129.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel129.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel129Layout = new javax.swing.GroupLayout(jPanel129);
        jPanel129.setLayout(jPanel129Layout);
        jPanel129Layout.setHorizontalGroup(
            jPanel129Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel129Layout.setVerticalGroup(
            jPanel129Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel130.setBackground(new java.awt.Color(255, 255, 255));
        jPanel130.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel130.setPreferredSize(new java.awt.Dimension(50, 50));

        Num4.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num4.setText("4");

        javax.swing.GroupLayout jPanel130Layout = new javax.swing.GroupLayout(jPanel130);
        jPanel130.setLayout(jPanel130Layout);
        jPanel130Layout.setHorizontalGroup(
            jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel130Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel130Layout.setVerticalGroup(
            jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel130Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel131.setBackground(new java.awt.Color(255, 255, 255));
        jPanel131.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel131.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel131Layout = new javax.swing.GroupLayout(jPanel131);
        jPanel131.setLayout(jPanel131Layout);
        jPanel131Layout.setHorizontalGroup(
            jPanel131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel131Layout.setVerticalGroup(
            jPanel131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel132.setBackground(new java.awt.Color(255, 255, 255));
        jPanel132.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel132.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel132Layout = new javax.swing.GroupLayout(jPanel132);
        jPanel132.setLayout(jPanel132Layout);
        jPanel132Layout.setHorizontalGroup(
            jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel132Layout.setVerticalGroup(
            jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel133.setBackground(new java.awt.Color(255, 255, 255));
        jPanel133.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel133.setPreferredSize(new java.awt.Dimension(50, 50));

        Num14.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num14.setText("14");

        javax.swing.GroupLayout jPanel133Layout = new javax.swing.GroupLayout(jPanel133);
        jPanel133.setLayout(jPanel133Layout);
        jPanel133Layout.setHorizontalGroup(
            jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel133Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num14)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel133Layout.setVerticalGroup(
            jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel133Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num14)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel134.setBackground(new java.awt.Color(255, 255, 255));
        jPanel134.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel134.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel134Layout = new javax.swing.GroupLayout(jPanel134);
        jPanel134.setLayout(jPanel134Layout);
        jPanel134Layout.setHorizontalGroup(
            jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel134Layout.setVerticalGroup(
            jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel135.setBackground(new java.awt.Color(255, 255, 255));
        jPanel135.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel135.setPreferredSize(new java.awt.Dimension(50, 50));

        Num10.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num10.setText("10");

        javax.swing.GroupLayout jPanel135Layout = new javax.swing.GroupLayout(jPanel135);
        jPanel135.setLayout(jPanel135Layout);
        jPanel135Layout.setHorizontalGroup(
            jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel135Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num10)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel135Layout.setVerticalGroup(
            jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel135Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num10)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel136.setBackground(new java.awt.Color(255, 255, 255));
        jPanel136.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel136.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel136Layout = new javax.swing.GroupLayout(jPanel136);
        jPanel136.setLayout(jPanel136Layout);
        jPanel136Layout.setHorizontalGroup(
            jPanel136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel136Layout.setVerticalGroup(
            jPanel136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel137.setBackground(new java.awt.Color(255, 255, 255));
        jPanel137.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel137.setPreferredSize(new java.awt.Dimension(50, 50));

        Num5.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num5.setText("5");

        javax.swing.GroupLayout jPanel137Layout = new javax.swing.GroupLayout(jPanel137);
        jPanel137.setLayout(jPanel137Layout);
        jPanel137Layout.setHorizontalGroup(
            jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel137Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel137Layout.setVerticalGroup(
            jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel137Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel138.setBackground(new java.awt.Color(255, 255, 255));
        jPanel138.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel138.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel138Layout = new javax.swing.GroupLayout(jPanel138);
        jPanel138.setLayout(jPanel138Layout);
        jPanel138Layout.setHorizontalGroup(
            jPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel138Layout.setVerticalGroup(
            jPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel139.setBackground(new java.awt.Color(255, 255, 255));
        jPanel139.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel139.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel139Layout = new javax.swing.GroupLayout(jPanel139);
        jPanel139.setLayout(jPanel139Layout);
        jPanel139Layout.setHorizontalGroup(
            jPanel139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel139Layout.setVerticalGroup(
            jPanel139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel140.setBackground(new java.awt.Color(255, 255, 255));
        jPanel140.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel140.setPreferredSize(new java.awt.Dimension(50, 50));

        Num15.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num15.setText("15");

        javax.swing.GroupLayout jPanel140Layout = new javax.swing.GroupLayout(jPanel140);
        jPanel140.setLayout(jPanel140Layout);
        jPanel140Layout.setHorizontalGroup(
            jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel140Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num15)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel140Layout.setVerticalGroup(
            jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel140Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num15)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout Gioc1Layout = new javax.swing.GroupLayout(Gioc1);
        Gioc1.setLayout(Gioc1Layout);
        Gioc1Layout.setHorizontalGroup(
            Gioc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Gioc1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Gioc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel127, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel131, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel129, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel133, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel132, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel136, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel135, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel140, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Gioc1Layout.setVerticalGroup(
            Gioc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Gioc1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Gioc1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Gioc1Layout.createSequentialGroup()
                        .addComponent(jPanel138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel140, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc1Layout.createSequentialGroup()
                        .addComponent(jPanel113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel114, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel115, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc1Layout.createSequentialGroup()
                        .addComponent(jPanel111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc1Layout.createSequentialGroup()
                        .addComponent(jPanel124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel123, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel120, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc1Layout.createSequentialGroup()
                        .addComponent(jPanel125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc1Layout.createSequentialGroup()
                        .addComponent(jPanel130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel129, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel126, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc1Layout.createSequentialGroup()
                        .addComponent(jPanel131, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel127, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc1Layout.createSequentialGroup()
                        .addComponent(jPanel136, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel135, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel132, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc1Layout.createSequentialGroup()
                        .addComponent(jPanel137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel133, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Schermata2.add(Gioc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));

        Gioc2.setBackground(new java.awt.Color(204, 204, 204));
        Gioc2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel141.setBackground(new java.awt.Color(255, 255, 255));
        jPanel141.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel141.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel141Layout = new javax.swing.GroupLayout(jPanel141);
        jPanel141.setLayout(jPanel141Layout);
        jPanel141Layout.setHorizontalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel141Layout.setVerticalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel142.setBackground(new java.awt.Color(255, 255, 255));
        jPanel142.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel142.setPreferredSize(new java.awt.Dimension(50, 50));

        Num21.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num21.setText("20");

        javax.swing.GroupLayout jPanel142Layout = new javax.swing.GroupLayout(jPanel142);
        jPanel142.setLayout(jPanel142Layout);
        jPanel142Layout.setHorizontalGroup(
            jPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel142Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num21)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel142Layout.setVerticalGroup(
            jPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel142Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num21)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel143.setBackground(new java.awt.Color(255, 255, 255));
        jPanel143.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel143.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel143Layout = new javax.swing.GroupLayout(jPanel143);
        jPanel143.setLayout(jPanel143Layout);
        jPanel143Layout.setHorizontalGroup(
            jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel143Layout.setVerticalGroup(
            jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel144.setBackground(new java.awt.Color(255, 255, 255));
        jPanel144.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel144.setPreferredSize(new java.awt.Dimension(50, 50));

        Num16.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num16.setText("15");

        javax.swing.GroupLayout jPanel144Layout = new javax.swing.GroupLayout(jPanel144);
        jPanel144.setLayout(jPanel144Layout);
        jPanel144Layout.setHorizontalGroup(
            jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel144Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num16)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel144Layout.setVerticalGroup(
            jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel144Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num16)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel145.setBackground(new java.awt.Color(255, 255, 255));
        jPanel145.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel145.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel145Layout = new javax.swing.GroupLayout(jPanel145);
        jPanel145.setLayout(jPanel145Layout);
        jPanel145Layout.setHorizontalGroup(
            jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel145Layout.setVerticalGroup(
            jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel146.setBackground(new java.awt.Color(255, 255, 255));
        jPanel146.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel146.setPreferredSize(new java.awt.Dimension(50, 50));

        Num26.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num26.setText("25");

        javax.swing.GroupLayout jPanel146Layout = new javax.swing.GroupLayout(jPanel146);
        jPanel146.setLayout(jPanel146Layout);
        jPanel146Layout.setHorizontalGroup(
            jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel146Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num26)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel146Layout.setVerticalGroup(
            jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel146Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num26)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel147.setBackground(new java.awt.Color(255, 255, 255));
        jPanel147.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel147.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel147Layout = new javax.swing.GroupLayout(jPanel147);
        jPanel147.setLayout(jPanel147Layout);
        jPanel147Layout.setHorizontalGroup(
            jPanel147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel147Layout.setVerticalGroup(
            jPanel147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel148.setBackground(new java.awt.Color(255, 255, 255));
        jPanel148.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel148.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel148Layout = new javax.swing.GroupLayout(jPanel148);
        jPanel148.setLayout(jPanel148Layout);
        jPanel148Layout.setHorizontalGroup(
            jPanel148Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel148Layout.setVerticalGroup(
            jPanel148Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel149.setBackground(new java.awt.Color(255, 255, 255));
        jPanel149.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel149.setPreferredSize(new java.awt.Dimension(50, 50));

        Num17.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num17.setText("16");

        javax.swing.GroupLayout jPanel149Layout = new javax.swing.GroupLayout(jPanel149);
        jPanel149.setLayout(jPanel149Layout);
        jPanel149Layout.setHorizontalGroup(
            jPanel149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel149Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num17)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel149Layout.setVerticalGroup(
            jPanel149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel149Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num17)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel150.setBackground(new java.awt.Color(255, 255, 255));
        jPanel150.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel150.setPreferredSize(new java.awt.Dimension(50, 50));

        Num18.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num18.setText("17");

        javax.swing.GroupLayout jPanel150Layout = new javax.swing.GroupLayout(jPanel150);
        jPanel150.setLayout(jPanel150Layout);
        jPanel150Layout.setHorizontalGroup(
            jPanel150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel150Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num18)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel150Layout.setVerticalGroup(
            jPanel150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel150Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num18)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel151.setBackground(new java.awt.Color(255, 255, 255));
        jPanel151.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel151.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel151Layout = new javax.swing.GroupLayout(jPanel151);
        jPanel151.setLayout(jPanel151Layout);
        jPanel151Layout.setHorizontalGroup(
            jPanel151Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel151Layout.setVerticalGroup(
            jPanel151Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel152.setBackground(new java.awt.Color(255, 255, 255));
        jPanel152.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel152.setPreferredSize(new java.awt.Dimension(50, 50));

        Num27.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num27.setText("26");

        javax.swing.GroupLayout jPanel152Layout = new javax.swing.GroupLayout(jPanel152);
        jPanel152.setLayout(jPanel152Layout);
        jPanel152Layout.setHorizontalGroup(
            jPanel152Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel152Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel152Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num27)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel152Layout.setVerticalGroup(
            jPanel152Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel152Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel152Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num27)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel153.setBackground(new java.awt.Color(255, 255, 255));
        jPanel153.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel153.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel153Layout = new javax.swing.GroupLayout(jPanel153);
        jPanel153.setLayout(jPanel153Layout);
        jPanel153Layout.setHorizontalGroup(
            jPanel153Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel153Layout.setVerticalGroup(
            jPanel153Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel154.setBackground(new java.awt.Color(255, 255, 255));
        jPanel154.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel154.setPreferredSize(new java.awt.Dimension(50, 50));

        Num22.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num22.setText("21");

        javax.swing.GroupLayout jPanel154Layout = new javax.swing.GroupLayout(jPanel154);
        jPanel154.setLayout(jPanel154Layout);
        jPanel154Layout.setHorizontalGroup(
            jPanel154Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel154Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel154Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num22)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel154Layout.setVerticalGroup(
            jPanel154Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel154Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel154Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num22)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel155.setBackground(new java.awt.Color(255, 255, 255));
        jPanel155.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel155.setPreferredSize(new java.awt.Dimension(50, 50));

        Num19.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num19.setText("18");

        javax.swing.GroupLayout jPanel155Layout = new javax.swing.GroupLayout(jPanel155);
        jPanel155.setLayout(jPanel155Layout);
        jPanel155Layout.setHorizontalGroup(
            jPanel155Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel155Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel155Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num19)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel155Layout.setVerticalGroup(
            jPanel155Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel155Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel155Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num19)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel156.setBackground(new java.awt.Color(255, 255, 255));
        jPanel156.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel156.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel156Layout = new javax.swing.GroupLayout(jPanel156);
        jPanel156.setLayout(jPanel156Layout);
        jPanel156Layout.setHorizontalGroup(
            jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel156Layout.setVerticalGroup(
            jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel157.setBackground(new java.awt.Color(255, 255, 255));
        jPanel157.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel157.setPreferredSize(new java.awt.Dimension(50, 50));

        Num23.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num23.setText("22");

        javax.swing.GroupLayout jPanel157Layout = new javax.swing.GroupLayout(jPanel157);
        jPanel157.setLayout(jPanel157Layout);
        jPanel157Layout.setHorizontalGroup(
            jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel157Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num23)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel157Layout.setVerticalGroup(
            jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel157Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num23)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel158.setBackground(new java.awt.Color(255, 255, 255));
        jPanel158.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel158.setPreferredSize(new java.awt.Dimension(50, 50));

        Num28.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num28.setText("27");

        javax.swing.GroupLayout jPanel158Layout = new javax.swing.GroupLayout(jPanel158);
        jPanel158.setLayout(jPanel158Layout);
        jPanel158Layout.setHorizontalGroup(
            jPanel158Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel158Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel158Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num28)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel158Layout.setVerticalGroup(
            jPanel158Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel158Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel158Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num28)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel159.setBackground(new java.awt.Color(255, 255, 255));
        jPanel159.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel159.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel159Layout = new javax.swing.GroupLayout(jPanel159);
        jPanel159.setLayout(jPanel159Layout);
        jPanel159Layout.setHorizontalGroup(
            jPanel159Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel159Layout.setVerticalGroup(
            jPanel159Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel160.setBackground(new java.awt.Color(255, 255, 255));
        jPanel160.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel160.setPreferredSize(new java.awt.Dimension(50, 50));

        Num24.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num24.setText("23");

        javax.swing.GroupLayout jPanel160Layout = new javax.swing.GroupLayout(jPanel160);
        jPanel160.setLayout(jPanel160Layout);
        jPanel160Layout.setHorizontalGroup(
            jPanel160Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel160Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel160Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num24)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel160Layout.setVerticalGroup(
            jPanel160Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel160Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel160Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num24)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel161.setBackground(new java.awt.Color(255, 255, 255));
        jPanel161.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel161.setPreferredSize(new java.awt.Dimension(50, 50));

        Num20.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num20.setText("19");

        javax.swing.GroupLayout jPanel161Layout = new javax.swing.GroupLayout(jPanel161);
        jPanel161.setLayout(jPanel161Layout);
        jPanel161Layout.setHorizontalGroup(
            jPanel161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel161Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num20)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel161Layout.setVerticalGroup(
            jPanel161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel161Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num20)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel162.setBackground(new java.awt.Color(255, 255, 255));
        jPanel162.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel162.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel162Layout = new javax.swing.GroupLayout(jPanel162);
        jPanel162.setLayout(jPanel162Layout);
        jPanel162Layout.setHorizontalGroup(
            jPanel162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel162Layout.setVerticalGroup(
            jPanel162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel163.setBackground(new java.awt.Color(255, 255, 255));
        jPanel163.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel163.setPreferredSize(new java.awt.Dimension(50, 50));

        Num25.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num25.setText("24");

        javax.swing.GroupLayout jPanel163Layout = new javax.swing.GroupLayout(jPanel163);
        jPanel163.setLayout(jPanel163Layout);
        jPanel163Layout.setHorizontalGroup(
            jPanel163Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel163Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel163Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num25)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel163Layout.setVerticalGroup(
            jPanel163Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel163Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel163Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num25)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel164.setBackground(new java.awt.Color(255, 255, 255));
        jPanel164.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel164.setPreferredSize(new java.awt.Dimension(50, 50));

        Num29.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num29.setText("28");

        javax.swing.GroupLayout jPanel164Layout = new javax.swing.GroupLayout(jPanel164);
        jPanel164.setLayout(jPanel164Layout);
        jPanel164Layout.setHorizontalGroup(
            jPanel164Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel164Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel164Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel164Layout.setVerticalGroup(
            jPanel164Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel164Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel164Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel165.setBackground(new java.awt.Color(255, 255, 255));
        jPanel165.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel165.setPreferredSize(new java.awt.Dimension(50, 50));

        Num30.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num30.setText("29");

        javax.swing.GroupLayout jPanel165Layout = new javax.swing.GroupLayout(jPanel165);
        jPanel165.setLayout(jPanel165Layout);
        jPanel165Layout.setHorizontalGroup(
            jPanel165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel165Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num30)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel165Layout.setVerticalGroup(
            jPanel165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel165Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num30)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel166.setBackground(new java.awt.Color(255, 255, 255));
        jPanel166.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel166.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel166Layout = new javax.swing.GroupLayout(jPanel166);
        jPanel166.setLayout(jPanel166Layout);
        jPanel166Layout.setHorizontalGroup(
            jPanel166Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel166Layout.setVerticalGroup(
            jPanel166Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel167.setBackground(new java.awt.Color(255, 255, 255));
        jPanel167.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel167.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel167Layout = new javax.swing.GroupLayout(jPanel167);
        jPanel167.setLayout(jPanel167Layout);
        jPanel167Layout.setHorizontalGroup(
            jPanel167Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel167Layout.setVerticalGroup(
            jPanel167Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Gioc2Layout = new javax.swing.GroupLayout(Gioc2);
        Gioc2.setLayout(Gioc2Layout);
        Gioc2Layout.setHorizontalGroup(
            Gioc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Gioc2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Gioc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel141, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel143, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel146, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel144, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel145, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel147, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel149, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel148, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel152, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel153, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel155, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel154, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel158, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel156, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel157, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel159, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel161, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel160, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel164, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel162, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel163, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel165, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel167, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel166, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Gioc2Layout.setVerticalGroup(
            Gioc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Gioc2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Gioc2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Gioc2Layout.createSequentialGroup()
                        .addComponent(jPanel167, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel166, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel165, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc2Layout.createSequentialGroup()
                        .addComponent(jPanel144, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel145, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel146, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc2Layout.createSequentialGroup()
                        .addComponent(jPanel143, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel141, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc2Layout.createSequentialGroup()
                        .addComponent(jPanel150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel151, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel152, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc2Layout.createSequentialGroup()
                        .addComponent(jPanel149, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel148, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel147, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc2Layout.createSequentialGroup()
                        .addComponent(jPanel156, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel157, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel158, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc2Layout.createSequentialGroup()
                        .addComponent(jPanel155, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel154, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel153, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc2Layout.createSequentialGroup()
                        .addComponent(jPanel162, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel163, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel164, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc2Layout.createSequentialGroup()
                        .addComponent(jPanel161, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel160, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel159, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Schermata2.add(Gioc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, -1, -1));

        Gioc3.setBackground(new java.awt.Color(204, 204, 204));
        Gioc3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel168.setBackground(new java.awt.Color(255, 255, 255));
        jPanel168.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel168.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel168Layout = new javax.swing.GroupLayout(jPanel168);
        jPanel168.setLayout(jPanel168Layout);
        jPanel168Layout.setHorizontalGroup(
            jPanel168Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel168Layout.setVerticalGroup(
            jPanel168Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel169.setBackground(new java.awt.Color(255, 255, 255));
        jPanel169.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel169.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel169Layout = new javax.swing.GroupLayout(jPanel169);
        jPanel169.setLayout(jPanel169Layout);
        jPanel169Layout.setHorizontalGroup(
            jPanel169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel169Layout.setVerticalGroup(
            jPanel169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel170.setBackground(new java.awt.Color(255, 255, 255));
        jPanel170.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel170.setPreferredSize(new java.awt.Dimension(50, 50));

        Num31.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num31.setText("30");

        javax.swing.GroupLayout jPanel170Layout = new javax.swing.GroupLayout(jPanel170);
        jPanel170.setLayout(jPanel170Layout);
        jPanel170Layout.setHorizontalGroup(
            jPanel170Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel170Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel170Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num31)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel170Layout.setVerticalGroup(
            jPanel170Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel170Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel170Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num31)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel171.setBackground(new java.awt.Color(255, 255, 255));
        jPanel171.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel171.setPreferredSize(new java.awt.Dimension(50, 50));

        Num32.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num32.setText("31");

        javax.swing.GroupLayout jPanel171Layout = new javax.swing.GroupLayout(jPanel171);
        jPanel171.setLayout(jPanel171Layout);
        jPanel171Layout.setHorizontalGroup(
            jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel171Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num32)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel171Layout.setVerticalGroup(
            jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel171Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num32)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel172.setBackground(new java.awt.Color(255, 255, 255));
        jPanel172.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel172.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel172Layout = new javax.swing.GroupLayout(jPanel172);
        jPanel172.setLayout(jPanel172Layout);
        jPanel172Layout.setHorizontalGroup(
            jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel172Layout.setVerticalGroup(
            jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel173.setBackground(new java.awt.Color(255, 255, 255));
        jPanel173.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel173.setPreferredSize(new java.awt.Dimension(50, 50));

        Num41.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num41.setText("40");

        javax.swing.GroupLayout jPanel173Layout = new javax.swing.GroupLayout(jPanel173);
        jPanel173.setLayout(jPanel173Layout);
        jPanel173Layout.setHorizontalGroup(
            jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel173Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num41)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel173Layout.setVerticalGroup(
            jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel173Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num41)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel174.setBackground(new java.awt.Color(255, 255, 255));
        jPanel174.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel174.setPreferredSize(new java.awt.Dimension(50, 50));

        Num42.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num42.setText("41");

        javax.swing.GroupLayout jPanel174Layout = new javax.swing.GroupLayout(jPanel174);
        jPanel174.setLayout(jPanel174Layout);
        jPanel174Layout.setHorizontalGroup(
            jPanel174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel174Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num42)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel174Layout.setVerticalGroup(
            jPanel174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel174Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num42)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel175.setBackground(new java.awt.Color(255, 255, 255));
        jPanel175.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel175.setPreferredSize(new java.awt.Dimension(50, 50));

        Num36.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num36.setText("35");

        javax.swing.GroupLayout jPanel175Layout = new javax.swing.GroupLayout(jPanel175);
        jPanel175.setLayout(jPanel175Layout);
        jPanel175Layout.setHorizontalGroup(
            jPanel175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel175Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num36)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel175Layout.setVerticalGroup(
            jPanel175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel175Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num36)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel176.setBackground(new java.awt.Color(255, 255, 255));
        jPanel176.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel176.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel176Layout = new javax.swing.GroupLayout(jPanel176);
        jPanel176.setLayout(jPanel176Layout);
        jPanel176Layout.setHorizontalGroup(
            jPanel176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel176Layout.setVerticalGroup(
            jPanel176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel177.setBackground(new java.awt.Color(255, 255, 255));
        jPanel177.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel177.setPreferredSize(new java.awt.Dimension(50, 50));

        Num33.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num33.setText("32");

        javax.swing.GroupLayout jPanel177Layout = new javax.swing.GroupLayout(jPanel177);
        jPanel177.setLayout(jPanel177Layout);
        jPanel177Layout.setHorizontalGroup(
            jPanel177Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel177Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel177Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num33)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel177Layout.setVerticalGroup(
            jPanel177Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel177Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel177Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num33)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel178.setBackground(new java.awt.Color(255, 255, 255));
        jPanel178.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel178.setPreferredSize(new java.awt.Dimension(50, 50));

        Num37.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num37.setText("36");

        javax.swing.GroupLayout jPanel178Layout = new javax.swing.GroupLayout(jPanel178);
        jPanel178.setLayout(jPanel178Layout);
        jPanel178Layout.setHorizontalGroup(
            jPanel178Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel178Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel178Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num37)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel178Layout.setVerticalGroup(
            jPanel178Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel178Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel178Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num37)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel179.setBackground(new java.awt.Color(255, 255, 255));
        jPanel179.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel179.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel179Layout = new javax.swing.GroupLayout(jPanel179);
        jPanel179.setLayout(jPanel179Layout);
        jPanel179Layout.setHorizontalGroup(
            jPanel179Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel179Layout.setVerticalGroup(
            jPanel179Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel180.setBackground(new java.awt.Color(255, 255, 255));
        jPanel180.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel180.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel180Layout = new javax.swing.GroupLayout(jPanel180);
        jPanel180.setLayout(jPanel180Layout);
        jPanel180Layout.setHorizontalGroup(
            jPanel180Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel180Layout.setVerticalGroup(
            jPanel180Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel181.setBackground(new java.awt.Color(255, 255, 255));
        jPanel181.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel181.setPreferredSize(new java.awt.Dimension(50, 50));

        Num38.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num38.setText("37");

        javax.swing.GroupLayout jPanel181Layout = new javax.swing.GroupLayout(jPanel181);
        jPanel181.setLayout(jPanel181Layout);
        jPanel181Layout.setHorizontalGroup(
            jPanel181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel181Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num38)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel181Layout.setVerticalGroup(
            jPanel181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel181Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num38)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel182.setBackground(new java.awt.Color(255, 255, 255));
        jPanel182.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel182.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel182Layout = new javax.swing.GroupLayout(jPanel182);
        jPanel182.setLayout(jPanel182Layout);
        jPanel182Layout.setHorizontalGroup(
            jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel182Layout.setVerticalGroup(
            jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel183.setBackground(new java.awt.Color(255, 255, 255));
        jPanel183.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel183.setPreferredSize(new java.awt.Dimension(50, 50));

        Num34.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num34.setText("33");

        javax.swing.GroupLayout jPanel183Layout = new javax.swing.GroupLayout(jPanel183);
        jPanel183.setLayout(jPanel183Layout);
        jPanel183Layout.setHorizontalGroup(
            jPanel183Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel183Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel183Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num34)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel183Layout.setVerticalGroup(
            jPanel183Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel183Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel183Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num34)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel184.setBackground(new java.awt.Color(255, 255, 255));
        jPanel184.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel184.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel184Layout = new javax.swing.GroupLayout(jPanel184);
        jPanel184.setLayout(jPanel184Layout);
        jPanel184Layout.setHorizontalGroup(
            jPanel184Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel184Layout.setVerticalGroup(
            jPanel184Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel185.setBackground(new java.awt.Color(255, 255, 255));
        jPanel185.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel185.setPreferredSize(new java.awt.Dimension(50, 50));

        Num43.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num43.setText("42");

        javax.swing.GroupLayout jPanel185Layout = new javax.swing.GroupLayout(jPanel185);
        jPanel185.setLayout(jPanel185Layout);
        jPanel185Layout.setHorizontalGroup(
            jPanel185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel185Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num43)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel185Layout.setVerticalGroup(
            jPanel185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel185Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num43)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel186.setBackground(new java.awt.Color(255, 255, 255));
        jPanel186.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel186.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel186Layout = new javax.swing.GroupLayout(jPanel186);
        jPanel186.setLayout(jPanel186Layout);
        jPanel186Layout.setHorizontalGroup(
            jPanel186Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel186Layout.setVerticalGroup(
            jPanel186Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel187.setBackground(new java.awt.Color(255, 255, 255));
        jPanel187.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel187.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel187Layout = new javax.swing.GroupLayout(jPanel187);
        jPanel187.setLayout(jPanel187Layout);
        jPanel187Layout.setHorizontalGroup(
            jPanel187Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel187Layout.setVerticalGroup(
            jPanel187Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel188.setBackground(new java.awt.Color(255, 255, 255));
        jPanel188.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel188.setPreferredSize(new java.awt.Dimension(50, 50));

        Num35.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num35.setText("34");

        javax.swing.GroupLayout jPanel188Layout = new javax.swing.GroupLayout(jPanel188);
        jPanel188.setLayout(jPanel188Layout);
        jPanel188Layout.setHorizontalGroup(
            jPanel188Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel188Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel188Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num35)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel188Layout.setVerticalGroup(
            jPanel188Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel188Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel188Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num35)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel189.setBackground(new java.awt.Color(255, 255, 255));
        jPanel189.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel189.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel189Layout = new javax.swing.GroupLayout(jPanel189);
        jPanel189.setLayout(jPanel189Layout);
        jPanel189Layout.setHorizontalGroup(
            jPanel189Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel189Layout.setVerticalGroup(
            jPanel189Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel190.setBackground(new java.awt.Color(255, 255, 255));
        jPanel190.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel190.setPreferredSize(new java.awt.Dimension(50, 50));

        Num39.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num39.setText("38");

        javax.swing.GroupLayout jPanel190Layout = new javax.swing.GroupLayout(jPanel190);
        jPanel190.setLayout(jPanel190Layout);
        jPanel190Layout.setHorizontalGroup(
            jPanel190Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel190Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel190Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num39)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel190Layout.setVerticalGroup(
            jPanel190Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel190Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel190Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num39)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel191.setBackground(new java.awt.Color(255, 255, 255));
        jPanel191.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel191.setPreferredSize(new java.awt.Dimension(50, 50));

        Num44.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num44.setText("43");

        javax.swing.GroupLayout jPanel191Layout = new javax.swing.GroupLayout(jPanel191);
        jPanel191.setLayout(jPanel191Layout);
        jPanel191Layout.setHorizontalGroup(
            jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel191Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num44)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel191Layout.setVerticalGroup(
            jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel191Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num44)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel192.setBackground(new java.awt.Color(255, 255, 255));
        jPanel192.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel192.setPreferredSize(new java.awt.Dimension(50, 50));

        Num45.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num45.setText("44");

        javax.swing.GroupLayout jPanel192Layout = new javax.swing.GroupLayout(jPanel192);
        jPanel192.setLayout(jPanel192Layout);
        jPanel192Layout.setHorizontalGroup(
            jPanel192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel192Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num45)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel192Layout.setVerticalGroup(
            jPanel192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel192Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num45)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel193.setBackground(new java.awt.Color(255, 255, 255));
        jPanel193.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel193.setPreferredSize(new java.awt.Dimension(50, 50));

        Num40.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num40.setText("39");

        javax.swing.GroupLayout jPanel193Layout = new javax.swing.GroupLayout(jPanel193);
        jPanel193.setLayout(jPanel193Layout);
        jPanel193Layout.setHorizontalGroup(
            jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel193Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num40)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel193Layout.setVerticalGroup(
            jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel193Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num40)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel194.setBackground(new java.awt.Color(255, 255, 255));
        jPanel194.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel194.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel194Layout = new javax.swing.GroupLayout(jPanel194);
        jPanel194.setLayout(jPanel194Layout);
        jPanel194Layout.setHorizontalGroup(
            jPanel194Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel194Layout.setVerticalGroup(
            jPanel194Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Gioc3Layout = new javax.swing.GroupLayout(Gioc3);
        Gioc3.setLayout(Gioc3Layout);
        Gioc3Layout.setHorizontalGroup(
            Gioc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Gioc3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Gioc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel168, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel170, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel169, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel173, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel171, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel172, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel174, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel176, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel179, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel177, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel178, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel180, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel182, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel181, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel185, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel183, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel184, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel186, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel188, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel187, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel191, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel189, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel190, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel192, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel194, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel193, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Gioc3Layout.setVerticalGroup(
            Gioc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Gioc3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Gioc3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Gioc3Layout.createSequentialGroup()
                        .addComponent(jPanel194, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel193, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel192, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc3Layout.createSequentialGroup()
                        .addComponent(jPanel171, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel172, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel173, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc3Layout.createSequentialGroup()
                        .addComponent(jPanel170, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel169, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel168, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc3Layout.createSequentialGroup()
                        .addComponent(jPanel177, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel178, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel179, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc3Layout.createSequentialGroup()
                        .addComponent(jPanel176, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel174, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc3Layout.createSequentialGroup()
                        .addComponent(jPanel183, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel184, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel185, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc3Layout.createSequentialGroup()
                        .addComponent(jPanel182, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel181, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel180, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc3Layout.createSequentialGroup()
                        .addComponent(jPanel189, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel190, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel191, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc3Layout.createSequentialGroup()
                        .addComponent(jPanel188, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel187, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel186, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Schermata2.add(Gioc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 410, -1, -1));

        Gioc4.setBackground(new java.awt.Color(204, 204, 204));
        Gioc4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel195.setBackground(new java.awt.Color(255, 255, 255));
        jPanel195.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel195.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel195Layout = new javax.swing.GroupLayout(jPanel195);
        jPanel195.setLayout(jPanel195Layout);
        jPanel195Layout.setHorizontalGroup(
            jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel195Layout.setVerticalGroup(
            jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel196.setBackground(new java.awt.Color(255, 255, 255));
        jPanel196.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel196.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel196Layout = new javax.swing.GroupLayout(jPanel196);
        jPanel196.setLayout(jPanel196Layout);
        jPanel196Layout.setHorizontalGroup(
            jPanel196Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel196Layout.setVerticalGroup(
            jPanel196Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel197.setBackground(new java.awt.Color(255, 255, 255));
        jPanel197.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel197.setPreferredSize(new java.awt.Dimension(50, 50));

        Num46.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num46.setText("45");

        javax.swing.GroupLayout jPanel197Layout = new javax.swing.GroupLayout(jPanel197);
        jPanel197.setLayout(jPanel197Layout);
        jPanel197Layout.setHorizontalGroup(
            jPanel197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel197Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num46)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel197Layout.setVerticalGroup(
            jPanel197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel197Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num46)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel198.setBackground(new java.awt.Color(255, 255, 255));
        jPanel198.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel198.setPreferredSize(new java.awt.Dimension(50, 50));

        Num47.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num47.setText("46");

        javax.swing.GroupLayout jPanel198Layout = new javax.swing.GroupLayout(jPanel198);
        jPanel198.setLayout(jPanel198Layout);
        jPanel198Layout.setHorizontalGroup(
            jPanel198Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel198Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel198Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num47)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel198Layout.setVerticalGroup(
            jPanel198Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel198Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel198Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num47)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel199.setBackground(new java.awt.Color(255, 255, 255));
        jPanel199.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel199.setPreferredSize(new java.awt.Dimension(50, 50));

        Num51.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num51.setText("50");

        javax.swing.GroupLayout jPanel199Layout = new javax.swing.GroupLayout(jPanel199);
        jPanel199.setLayout(jPanel199Layout);
        jPanel199Layout.setHorizontalGroup(
            jPanel199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel199Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num51)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel199Layout.setVerticalGroup(
            jPanel199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel199Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num51)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel200.setBackground(new java.awt.Color(255, 255, 255));
        jPanel200.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel200.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel200Layout = new javax.swing.GroupLayout(jPanel200);
        jPanel200.setLayout(jPanel200Layout);
        jPanel200Layout.setHorizontalGroup(
            jPanel200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel200Layout.setVerticalGroup(
            jPanel200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel201.setBackground(new java.awt.Color(255, 255, 255));
        jPanel201.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel201.setPreferredSize(new java.awt.Dimension(50, 50));

        Num56.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num56.setText("55");

        javax.swing.GroupLayout jPanel201Layout = new javax.swing.GroupLayout(jPanel201);
        jPanel201.setLayout(jPanel201Layout);
        jPanel201Layout.setHorizontalGroup(
            jPanel201Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel201Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel201Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num56)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel201Layout.setVerticalGroup(
            jPanel201Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel201Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel201Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num56)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel202.setBackground(new java.awt.Color(255, 255, 255));
        jPanel202.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel202.setPreferredSize(new java.awt.Dimension(50, 50));

        Num52.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num52.setText("51");

        javax.swing.GroupLayout jPanel202Layout = new javax.swing.GroupLayout(jPanel202);
        jPanel202.setLayout(jPanel202Layout);
        jPanel202Layout.setHorizontalGroup(
            jPanel202Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel202Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel202Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num52)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel202Layout.setVerticalGroup(
            jPanel202Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel202Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel202Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num52)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel203.setBackground(new java.awt.Color(255, 255, 255));
        jPanel203.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel203.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel203Layout = new javax.swing.GroupLayout(jPanel203);
        jPanel203.setLayout(jPanel203Layout);
        jPanel203Layout.setHorizontalGroup(
            jPanel203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel203Layout.setVerticalGroup(
            jPanel203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel204.setBackground(new java.awt.Color(255, 255, 255));
        jPanel204.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel204.setPreferredSize(new java.awt.Dimension(50, 50));

        Num48.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num48.setText("47");

        javax.swing.GroupLayout jPanel204Layout = new javax.swing.GroupLayout(jPanel204);
        jPanel204.setLayout(jPanel204Layout);
        jPanel204Layout.setHorizontalGroup(
            jPanel204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel204Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num48)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel204Layout.setVerticalGroup(
            jPanel204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel204Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num48)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel205.setBackground(new java.awt.Color(255, 255, 255));
        jPanel205.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel205.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel205Layout = new javax.swing.GroupLayout(jPanel205);
        jPanel205.setLayout(jPanel205Layout);
        jPanel205Layout.setHorizontalGroup(
            jPanel205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel205Layout.setVerticalGroup(
            jPanel205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel206.setBackground(new java.awt.Color(255, 255, 255));
        jPanel206.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel206.setPreferredSize(new java.awt.Dimension(50, 50));

        Num57.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num57.setText("56");

        javax.swing.GroupLayout jPanel206Layout = new javax.swing.GroupLayout(jPanel206);
        jPanel206.setLayout(jPanel206Layout);
        jPanel206Layout.setHorizontalGroup(
            jPanel206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel206Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num57)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel206Layout.setVerticalGroup(
            jPanel206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel206Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num57)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel207.setBackground(new java.awt.Color(255, 255, 255));
        jPanel207.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel207.setPreferredSize(new java.awt.Dimension(50, 50));

        Num58.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num58.setText("57");

        javax.swing.GroupLayout jPanel207Layout = new javax.swing.GroupLayout(jPanel207);
        jPanel207.setLayout(jPanel207Layout);
        jPanel207Layout.setHorizontalGroup(
            jPanel207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel207Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num58)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel207Layout.setVerticalGroup(
            jPanel207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel207Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num58)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel208.setBackground(new java.awt.Color(255, 255, 255));
        jPanel208.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel208.setPreferredSize(new java.awt.Dimension(50, 50));

        Num53.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num53.setText("52");

        javax.swing.GroupLayout jPanel208Layout = new javax.swing.GroupLayout(jPanel208);
        jPanel208.setLayout(jPanel208Layout);
        jPanel208Layout.setHorizontalGroup(
            jPanel208Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel208Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel208Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num53)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel208Layout.setVerticalGroup(
            jPanel208Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel208Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel208Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num53)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel209.setBackground(new java.awt.Color(255, 255, 255));
        jPanel209.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel209.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel209Layout = new javax.swing.GroupLayout(jPanel209);
        jPanel209.setLayout(jPanel209Layout);
        jPanel209Layout.setHorizontalGroup(
            jPanel209Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel209Layout.setVerticalGroup(
            jPanel209Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel210.setBackground(new java.awt.Color(255, 255, 255));
        jPanel210.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel210.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel210Layout = new javax.swing.GroupLayout(jPanel210);
        jPanel210.setLayout(jPanel210Layout);
        jPanel210Layout.setHorizontalGroup(
            jPanel210Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel210Layout.setVerticalGroup(
            jPanel210Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel211.setBackground(new java.awt.Color(255, 255, 255));
        jPanel211.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel211.setPreferredSize(new java.awt.Dimension(50, 50));

        Num54.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num54.setText("53");

        javax.swing.GroupLayout jPanel211Layout = new javax.swing.GroupLayout(jPanel211);
        jPanel211.setLayout(jPanel211Layout);
        jPanel211Layout.setHorizontalGroup(
            jPanel211Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel211Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel211Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num54)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel211Layout.setVerticalGroup(
            jPanel211Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel211Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel211Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num54)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel212.setBackground(new java.awt.Color(255, 255, 255));
        jPanel212.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel212.setPreferredSize(new java.awt.Dimension(50, 50));

        Num59.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num59.setText("58");

        javax.swing.GroupLayout jPanel212Layout = new javax.swing.GroupLayout(jPanel212);
        jPanel212.setLayout(jPanel212Layout);
        jPanel212Layout.setHorizontalGroup(
            jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel212Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num59)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel212Layout.setVerticalGroup(
            jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel212Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num59)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel213.setBackground(new java.awt.Color(255, 255, 255));
        jPanel213.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel213.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel213Layout = new javax.swing.GroupLayout(jPanel213);
        jPanel213.setLayout(jPanel213Layout);
        jPanel213Layout.setHorizontalGroup(
            jPanel213Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel213Layout.setVerticalGroup(
            jPanel213Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel214.setBackground(new java.awt.Color(255, 255, 255));
        jPanel214.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel214.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel214Layout = new javax.swing.GroupLayout(jPanel214);
        jPanel214.setLayout(jPanel214Layout);
        jPanel214Layout.setHorizontalGroup(
            jPanel214Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel214Layout.setVerticalGroup(
            jPanel214Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel215.setBackground(new java.awt.Color(255, 255, 255));
        jPanel215.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel215.setPreferredSize(new java.awt.Dimension(50, 50));

        Num49.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num49.setText("48");

        javax.swing.GroupLayout jPanel215Layout = new javax.swing.GroupLayout(jPanel215);
        jPanel215.setLayout(jPanel215Layout);
        jPanel215Layout.setHorizontalGroup(
            jPanel215Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel215Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel215Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num49)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel215Layout.setVerticalGroup(
            jPanel215Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel215Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel215Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num49)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel216.setBackground(new java.awt.Color(255, 255, 255));
        jPanel216.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel216.setPreferredSize(new java.awt.Dimension(50, 50));

        Num50.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num50.setText("49");

        javax.swing.GroupLayout jPanel216Layout = new javax.swing.GroupLayout(jPanel216);
        jPanel216.setLayout(jPanel216Layout);
        jPanel216Layout.setHorizontalGroup(
            jPanel216Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel216Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel216Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num50)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel216Layout.setVerticalGroup(
            jPanel216Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel216Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel216Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num50)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel217.setBackground(new java.awt.Color(255, 255, 255));
        jPanel217.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel217.setPreferredSize(new java.awt.Dimension(50, 50));

        Num55.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num55.setText("54");

        javax.swing.GroupLayout jPanel217Layout = new javax.swing.GroupLayout(jPanel217);
        jPanel217.setLayout(jPanel217Layout);
        jPanel217Layout.setHorizontalGroup(
            jPanel217Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel217Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel217Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num55)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel217Layout.setVerticalGroup(
            jPanel217Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel217Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel217Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num55)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel218.setBackground(new java.awt.Color(255, 255, 255));
        jPanel218.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel218.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel218Layout = new javax.swing.GroupLayout(jPanel218);
        jPanel218.setLayout(jPanel218Layout);
        jPanel218Layout.setHorizontalGroup(
            jPanel218Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel218Layout.setVerticalGroup(
            jPanel218Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel219.setBackground(new java.awt.Color(255, 255, 255));
        jPanel219.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel219.setPreferredSize(new java.awt.Dimension(50, 50));

        Num60.setFont(new java.awt.Font("French Script MT", 0, 50)); // NOI18N
        Num60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num60.setText("59");

        javax.swing.GroupLayout jPanel219Layout = new javax.swing.GroupLayout(jPanel219);
        jPanel219.setLayout(jPanel219Layout);
        jPanel219Layout.setHorizontalGroup(
            jPanel219Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
            .addGroup(jPanel219Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel219Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num60)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel219Layout.setVerticalGroup(
            jPanel219Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel219Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel219Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Num60)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel220.setBackground(new java.awt.Color(255, 255, 255));
        jPanel220.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel220.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel220Layout = new javax.swing.GroupLayout(jPanel220);
        jPanel220.setLayout(jPanel220Layout);
        jPanel220Layout.setHorizontalGroup(
            jPanel220Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel220Layout.setVerticalGroup(
            jPanel220Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel221.setBackground(new java.awt.Color(255, 255, 255));
        jPanel221.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel221.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel221Layout = new javax.swing.GroupLayout(jPanel221);
        jPanel221.setLayout(jPanel221Layout);
        jPanel221Layout.setHorizontalGroup(
            jPanel221Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel221Layout.setVerticalGroup(
            jPanel221Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Gioc4Layout = new javax.swing.GroupLayout(Gioc4);
        Gioc4.setLayout(Gioc4Layout);
        Gioc4Layout.setHorizontalGroup(
            Gioc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Gioc4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Gioc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel195, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel197, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel196, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel198, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel199, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel201, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel203, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel202, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel206, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel204, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel205, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel209, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel208, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel210, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel211, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel213, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel215, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel214, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel218, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel216, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel217, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gioc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel219, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel221, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel220, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Gioc4Layout.setVerticalGroup(
            Gioc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Gioc4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Gioc4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Gioc4Layout.createSequentialGroup()
                        .addComponent(jPanel221, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel220, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel219, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc4Layout.createSequentialGroup()
                        .addComponent(jPanel198, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel199, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel200, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc4Layout.createSequentialGroup()
                        .addComponent(jPanel197, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel196, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel195, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc4Layout.createSequentialGroup()
                        .addComponent(jPanel204, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel205, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel206, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc4Layout.createSequentialGroup()
                        .addComponent(jPanel203, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel202, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel201, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc4Layout.createSequentialGroup()
                        .addComponent(jPanel210, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel211, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel212, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc4Layout.createSequentialGroup()
                        .addComponent(jPanel209, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel208, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc4Layout.createSequentialGroup()
                        .addComponent(jPanel216, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel217, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel218, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gioc4Layout.createSequentialGroup()
                        .addComponent(jPanel215, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel214, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel213, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Schermata2.add(Gioc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 610, -1, -1));

        GiocLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        GiocLabel4.setForeground(new java.awt.Color(255, 255, 255));
        GiocLabel4.setText("Giocatore 4");
        Schermata2.add(GiocLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 690, -1, -1));

        GiocLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        GiocLabel1.setForeground(new java.awt.Color(255, 255, 255));
        GiocLabel1.setText("Giocatore 1");
        Schermata2.add(GiocLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 90, -1, -1));

        GiocLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        GiocLabel2.setForeground(new java.awt.Color(255, 255, 255));
        GiocLabel2.setText("Giocatore 2");
        Schermata2.add(GiocLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 290, -1, -1));

        GiocLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        GiocLabel3.setForeground(new java.awt.Color(255, 255, 255));
        GiocLabel3.setText("Giocatore 3");
        Schermata2.add(GiocLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 490, -1, -1));

        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacinotte1/Classic_Gold_Pictures_Transparent_PNG_Frame.png"))); // NOI18N
        Schermata2.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jPanel223.setBackground(new java.awt.Color(255, 153, 0));
        jPanel223.setToolTipText("");
        jPanel223.setRequestFocusEnabled(false);

        jLabel98.setFont(new java.awt.Font("French Script MT", 0, 120)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel223Layout = new javax.swing.GroupLayout(jPanel223);
        jPanel223.setLayout(jPanel223Layout);
        jPanel223Layout.setHorizontalGroup(
            jPanel223Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel223Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel223Layout.setVerticalGroup(
            jPanel223Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel223Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Schermata2.add(jPanel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, 140));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pacinotte1/button.png"))); // NOI18N
        jLabel99.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel99MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel99MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel99MouseExited(evt);
            }
        });
        Schermata2.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 200, -1));

        premi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        premi.setForeground(new java.awt.Color(255, 255, 255));
        premi.setText("jLabel3");
        Schermata2.add(premi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        getContentPane().add(Schermata2, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel99MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel99MouseClicked
        // PULSANTE ESTRAI
        
        do{
        ran = Math.random()*90+1;
        k = (int)ran;
        String risultato = Integer.toString(k);
        jLabel98.setText(risultato);
        }while(v[k]==1);
        v[k] = 1;
        
        labels1[k].setForeground(Color.red);
        
        
        int lim1=1, lim2=5, c=0;
        
        //Il primo ciclo si ripete 18 volte, che equivale al numero di righe da controllare
        for(int i=0; i<18; i++)
        {
            //I limiti permettono una riga per volta
            for(int j=lim1; j<=lim2; j++)
            {
                //Conta i numeri estratti in una riga
                if(v[j]==1)
                {
                    c++;
                    System.out.print(" "+v[j]+""+ k+""+ c);
                }
                
            }
            
            //Gestisce le possibili vincite in base alla c
            switch(c)
            {
                case 2:
                    if(p[0]==0)
                    {
                        p[0]=1;
                        premi.setText("HAI FATTO AMBO!!!");
                    }
                    break;
                     
                case 3:
                    if(p[1]==0)
                    {
                        p[1]=1;
                        premi.setText("HAI FATTO TERNO!!!");
                    }
                    break;
                 
                case 4:
                    if(p[2]==0)
                    {
                        p[2]=1;
                        premi.setText("HAI FATTO QUATERNA!!!");
                    }
                    break;
                 
                case 5:
                    if(p[3]==0)
                    {
                        p[3]=1;
                        premi.setText("HAI FATTO CINQUINA!!!");
                    }
                    break;
            }
            
            //Aggiornamento dei limiti e del contatore per la prossima riga
            lim1+=5;
            lim2+=5;
            c=0; 
            
        }
        
        lim1=1; lim2=5; c=0;
        for(int i=1; i<=18; i++)
        {
            for(int j=lim1; j<=lim2; j++)
            {
                if(v[j]==1)
                    c++;
            }
            
            //Questo if permette di controllare il conatore ogni 3 righe, che formano una tabella
            if(i%3==0)
            {
                if(c==15)
                {
                    JOptionPane.showMessageDialog(null, "WOWW (tombola)");
                }
                    
                c=0;
            }
            
            //Finita la prima colonna di tabelle si passa alla seconda reimpostando i limiti
            if(lim2 == 85)
            {
                lim1=6;
                lim2=10;
            }
            
            else
            {
                lim1+=10;
                lim2+=10;
            }
        }
        
        c=0;
        
        
        lim1=1; lim2=5;
        for(int i=1; i<=3; i++)
        {
            for(int j=lim1; j<=lim2; j++)
            {
                if(v[arraynum[j]]==1)
                {
                    c++;
                    labels2[j].setForeground(Color.red);
                }
            }
                
            switch(c)
            {
                case 2:
                    if(p[0]==0)
                    {
                        p[0]=1;
                        premi.setText("1 HAI FATTO AMBO!!!");
                    }
                    break;
                     
                case 3:
                    if(p[1]==0)
                    {
                        p[1]=1;
                        premi.setText("1 HAI FATTO TERNO!!!");
                    }
                    break;
                 
                case 4:
                    if(p[2]==0)
                    {
                        p[2]=1;
                        premi.setText("1 HAI FATTO QUATERNA!!!");
                    }
                    break;
                 
                case 5:
                    if(p[3]==0)
                    {
                        p[3]=1;
                        premi.setText("1 HAI FATTO CINQUINA!!!");
                    }
                    break;
            }
            lim1+=5;
            lim2+=5;
            c=0;
        }
        
        c=0;
        lim1=16; lim2=20;
        for(int i=1; i<=3; i++)
        {
            for(int j=lim1; j<=lim2; j++)
            {
                if(v[arraynum[j]]==1)
                {
                    c++;
                    labels2[j].setForeground(Color.red);
                }
            }
                
            switch(c)
            {
                case 2:
                    if(p[0]==0)
                    {
                        p[0]=1;
                        premi.setText("2 HAI FATTO AMBO!!!");
                    }
                    break;
                     
                case 3:
                    if(p[1]==0)
                    {
                        p[1]=1;
                        premi.setText("2 HAI FATTO TERNO!!!");
                    }
                    break;
                 
                case 4:
                    if(p[2]==0)
                    {
                        p[2]=1;
                        premi.setText("2 HAI FATTO QUATERNA!!!");
                    }
                    break;
                 
                case 5:
                    if(p[3]==0)
                    {
                        p[3]=1;
                        premi.setText("2 HAI FATTO CINQUINA!!!");
                    }
                    break;
            }
            lim1+=5;
            lim2+=5;
            c=0;
        }
        
        c=0;
        lim1=31; lim2=35;
        for(int i=1; i<=3; i++)
        {
            for(int j=lim1; j<=lim2; j++)
            {
                if(v[arraynum[j]]==1)
                {
                    c++;
                    labels2[j].setForeground(Color.red);
                }
            }
                
            switch(c)
            {
                case 2:
                    if(p[0]==0)
                    {
                        p[0]=1;
                        premi.setText("3 HAI FATTO AMBO!!!");
                    }
                    break;
                     
                case 3:
                    if(p[1]==0)
                    {
                        p[1]=1;
                        premi.setText("3 HAI FATTO TERNO!!!");
                    }
                    break;
                 
                case 4:
                    if(p[2]==0)
                    {
                        p[2]=1;
                        premi.setText("3 HAI FATTO QUATERNA!!!");
                    }
                    break;
                 
                case 5:
                    if(p[3]==0)
                    {
                        p[3]=1;
                        premi.setText("3 HAI FATTO CINQUINA!!!");
                    }
                    break;
            }
            lim1+=5;
            lim2+=5;
            c=0;
        }
        
        c=0;
        lim1=46; lim2=50;
        for(int i=1; i<=3; i++)
        {
            for(int j=lim1; j<=lim2; j++)
            {
                if(v[arraynum[j]]==1)
                {
                    c++;
                    labels2[j].setForeground(Color.red);
                }
            }
                
            switch(c)
            {
                case 2:
                    if(p[0]==0)
                    {
                        p[0]=1;
                        premi.setText("4 HAI FATTO AMBO!!!");
                    }
                    break;
                     
                case 3:
                    if(p[1]==0)
                    {
                        p[1]=1;
                        premi.setText("4 HAI FATTO TERNO!!!");
                    }
                    break;
                 
                case 4:
                    if(p[2]==0)
                    {
                        p[2]=1;
                        premi.setText("4 HAI FATTO QUATERNA!!!");
                    }
                    break;
                 
                case 5:
                    if(p[3]==0)
                    {
                        p[3]=1;
                        premi.setText("4 HAI FATTO CINQUINA!!!");
                    }
                    break;
            }
            lim1+=5;
            lim2+=5;
            c=0;
        }
        
        c=0;
        //TOMBOLA CARTELLA 1
        for(int i=1; i<=15; i++)
        {
            if(v[arraynum[i]]==1)
                c++;
            
            if(c==15)
            {
                JOptionPane.showMessageDialog(null, "1 WOWW (tombola)");
            }
        }
        
        c=0;
        //TOMBOLA CARTELLA 2
        for(int i=16; i<=30; i++)
        {
            if(v[arraynum[i]]==1)
                c++;
            
            if(c==15)
            {
                JOptionPane.showMessageDialog(null, "2 WOWW (tombola)");
            }
        }
        
        c=0;
        //TOMBOLA CARTELLA 3
        for(int i=31; i<=45; i++)
        {
            if(v[arraynum[i]]==1)
                c++;
            
            if(c==15)
            {
                JOptionPane.showMessageDialog(null, "3 WOWW (tombola)");
            }
        }
        
        c=0;
        //TOMBOLA CARTELLA 4
        for(int i=46; i<=60; i++)
        {
            if(v[arraynum[i]]==1)
                c++;
            
            if(c==15)
            {
                JOptionPane.showMessageDialog(null, "4 WOWW (tombola)");
            }
        }
        
        
    }//GEN-LAST:event_jLabel99MouseClicked

    private void jLabel99MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel99MouseEntered
        // TODO add your handling code here:
        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("button clicked.png")));
    }//GEN-LAST:event_jLabel99MouseEntered

    private void jLabel99MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel99MouseExited
        // TODO add your handling code here:
        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("button.png")));
    }//GEN-LAST:event_jLabel99MouseExited

    private void jLabel97MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel97MouseExited
        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("esci.png")));
    }//GEN-LAST:event_jLabel97MouseExited

    private void jLabel97MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel97MouseEntered
        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("esci_enter.png")));
    }//GEN-LAST:event_jLabel97MouseEntered

    private void jLabel97MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel97MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel97MouseClicked

    private void jLabel96MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel96MouseExited
        jLabel96.setOpaque(false);
        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("gioca.png")));
        jLabel96.setOpaque(false);
    }//GEN-LAST:event_jLabel96MouseExited

    private void jLabel96MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel96MouseEntered
        jLabel96.setOpaque(false);
        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("gioca_enter.png")));
        jLabel96.setOpaque(false);
    }//GEN-LAST:event_jLabel96MouseEntered

    private void jLabel96MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel96MouseClicked
        NumGioc nuovoNumGioc = new NumGioc(this,true);
        nuovoNumGioc.setLocationRelativeTo(this);
        nuovoNumGioc.setVisible(true);

        if(nuovoNumGioc.scelta!=1)
        {
            s1= nuovoNumGioc.num1.getText();
            giocatori = Integer.parseInt(s1);

            Schermata1.setVisible(false);
            Schermata2.setVisible(true);
            Gioc1.setVisible(false);
            Gioc2.setVisible(false);
            Gioc3.setVisible(false);
            Gioc4.setVisible(false);

            GiocLabel1.setVisible(false);
            GiocLabel2.setVisible(false);
            GiocLabel3.setVisible(false);
            GiocLabel4.setVisible(false);

            switch(giocatori){
                case 1:
                Gioc1.setVisible(true);

                GiocLabel1.setVisible(true);
                break;
                case 2:
                Gioc1.setVisible(true);
                Gioc2.setVisible(true);

                GiocLabel1.setVisible(true);
                GiocLabel2.setVisible(true);
                break;
                case 3:
                Gioc1.setVisible(true);
                Gioc2.setVisible(true);
                Gioc3.setVisible(true);

                GiocLabel1.setVisible(true);
                GiocLabel2.setVisible(true);
                GiocLabel3.setVisible(true);
                break;
                case 4:
                Gioc1.setVisible(true);
                Gioc2.setVisible(true);
                Gioc3.setVisible(true);
                Gioc4.setVisible(true);

                GiocLabel1.setVisible(true);
                GiocLabel2.setVisible(true);
                GiocLabel3.setVisible(true);
                GiocLabel4.setVisible(true);
                break;
            }

            if(giocatori >=1)
            {
                arraynum[1] = random.nextInt(10) + 10;
                arraynum[2] = random.nextInt(10) + 20;
                arraynum[3] = random.nextInt(10) + 30;
                arraynum[4] = random.nextInt(10) + 50;
                arraynum[5] = random.nextInt(10) + 60;

                arraynum[6] = random.nextInt(9) + 1;
                do{
                    arraynum[7] = random.nextInt(10) + 20;
                }while(arraynum[2]==arraynum[7]);

                do{
                    arraynum[8] = random.nextInt(10) + 30;
                }while(arraynum[3]==arraynum[8]);

                arraynum[9] = random.nextInt(10) + 40;
                arraynum[10] = random.nextInt(10) + 70;

                do{
                    arraynum[11] = random.nextInt(10) + 10;
                }while(arraynum[2]==arraynum[11]);

                do{
                    arraynum[12] = random.nextInt(10) + 40;
                }while(arraynum[9]==arraynum[12]);

                do{
                    arraynum[13] = random.nextInt(10) + 50;
                }while(arraynum[4]==arraynum[13]);

                do{
                    arraynum[14] = random.nextInt(10) + 60;
                }while(arraynum[5]==arraynum[14]);
                arraynum[15] = random.nextInt(11) + 80;

                for(int i = 1; i <=15;i++) {
                    arraystrin[i] = Integer.toString(arraynum[i]);
                }

                Num1.setText(arraystrin[1]);
                Num2.setText(arraystrin[2]);
                Num3.setText(arraystrin[3]);
                Num4.setText(arraystrin[4]);
                Num5.setText(arraystrin[5]);

                Num6.setText(arraystrin[6]);
                Num7.setText(arraystrin[7]);
                Num8.setText(arraystrin[8]);
                Num9.setText(arraystrin[9]);
                Num10.setText(arraystrin[10]);

                Num11.setText(arraystrin[11]);
                Num12.setText(arraystrin[12]);
                Num13.setText(arraystrin[13]);
                Num14.setText(arraystrin[14]);
                Num15.setText(arraystrin[15]);
            }
            if(giocatori >=2)
            {
                arraynum[16] = random.nextInt(10) + 10;
                arraynum[17] = random.nextInt(10) + 20;
                arraynum[18] = random.nextInt(10) + 30;
                arraynum[19] = random.nextInt(10) + 40;
                arraynum[20] = random.nextInt(10) + 60;

                arraynum[21] = random.nextInt(9) + 1;
                do{
                    arraynum[22] = random.nextInt(10) + 40;
                }while(arraynum[19]==arraynum[22]);

                arraynum[23] = random.nextInt(10) + 50;

                do{
                    arraynum[24] = random.nextInt(10) + 60;
                }while(arraynum[20]==arraynum[24]);

                arraynum[25] = random.nextInt(10) + 70;

                do{
                    arraynum[26] = random.nextInt(10) + 10;
                }while(arraynum[16]==arraynum[26]);

                do{
                    arraynum[27] = random.nextInt(10) + 30;
                }while(arraynum[18]==arraynum[27]);

                do{
                    arraynum[28] = random.nextInt(10) + 50;
                }while(arraynum[23]==arraynum[28]);

                do{
                    arraynum[29] = random.nextInt(10) + 70;
                }while(arraynum[25]==arraynum[29]);
                arraynum[30] = random.nextInt(11) + 80;

                for(int i = 16; i <=30;i++) {
                    arraystrin[i] = Integer.toString(arraynum[i]);
                }

                Num16.setText(arraystrin[16]);
                Num17.setText(arraystrin[17]);
                Num18.setText(arraystrin[18]);
                Num19.setText(arraystrin[19]);
                Num20.setText(arraystrin[20]);

                Num21.setText(arraystrin[21]);
                Num22.setText(arraystrin[22]);
                Num23.setText(arraystrin[23]);
                Num24.setText(arraystrin[24]);
                Num25.setText(arraystrin[25]);

                Num26.setText(arraystrin[26]);
                Num27.setText(arraystrin[27]);
                Num28.setText(arraystrin[28]);
                Num29.setText(arraystrin[29]);
                Num30.setText(arraystrin[30]);

            }
            if(giocatori >=3)
            {
                arraynum[31] = random.nextInt(9) + 1;
                arraynum[32] = random.nextInt(10) + 10;
                arraynum[33] = random.nextInt(10) + 30;
                arraynum[34] = random.nextInt(10) + 50;
                arraynum[35] = random.nextInt(10) + 60;

                arraynum[36] = random.nextInt(10) + 20;
                do{
                    arraynum[37] = random.nextInt(10) + 30;
                }while(arraynum[33]==arraynum[37]);

                arraynum[38] = random.nextInt(10) + 40;

                arraynum[39] = random.nextInt(10) + 70;
                arraynum[40] = random.nextInt(11) + 80;

                do{
                    arraynum[41] = random.nextInt(10) + 10;
                }while(arraynum[32]==arraynum[41]);

                do{
                    arraynum[42] = random.nextInt(10) + 20;
                }while(arraynum[36]==arraynum[42]);

                do{
                    arraynum[43] = random.nextInt(10) + 50;
                }while(arraynum[34]==arraynum[43]);

                do{
                    arraynum[44] = random.nextInt(10) + 70;
                }while(arraynum[39]==arraynum[44]);
                do{
                    arraynum[45] = random.nextInt(11) + 80;
                }while(arraynum[40]==arraynum[45]);

                for(int i = 31; i <=45;i++) {
                    arraystrin[i] = Integer.toString(arraynum[i]);
                }

                Num31.setText(arraystrin[31]);
                Num32.setText(arraystrin[32]);
                Num33.setText(arraystrin[33]);
                Num34.setText(arraystrin[34]);
                Num35.setText(arraystrin[35]);

                Num36.setText(arraystrin[36]);
                Num37.setText(arraystrin[37]);
                Num38.setText(arraystrin[38]);
                Num39.setText(arraystrin[39]);
                Num40.setText(arraystrin[40]);

                Num41.setText(arraystrin[41]);
                Num42.setText(arraystrin[42]);
                Num43.setText(arraystrin[43]);
                Num44.setText(arraystrin[44]);
                Num45.setText(arraystrin[45]);

            }
            if(giocatori>=4)
            {
                arraynum[46] = random.nextInt(9) + 1;
                arraynum[47] = random.nextInt(10) + 10;
                arraynum[48] = random.nextInt(10) + 30;
                arraynum[49] = random.nextInt(10) + 60;
                arraynum[50] = random.nextInt(10) + 70;

                do{
                    arraynum[51] = random.nextInt(10) + 10;
                }while(arraynum[47]==arraynum[51]);

                arraynum[52] = random.nextInt(10) + 20;
                arraynum[53] = random.nextInt(10) + 40;
                arraynum[54] = random.nextInt(10) + 50;
                do{
                    arraynum[55] = random.nextInt(10) + 70;
                }while(arraynum[50]==arraynum[55]);

                do{
                    arraynum[56] = random.nextInt(10) + 20;
                }while(arraynum[52]==arraynum[56]);

                do{
                    arraynum[57] = random.nextInt(10) + 30;
                }while(arraynum[48]==arraynum[57]);

                do{
                    arraynum[58] = random.nextInt(10) + 40;
                }while(arraynum[53]==arraynum[58]);

                do{
                    arraynum[59] = random.nextInt(10) + 50;
                }while(arraynum[54]==arraynum[59]);
                arraynum[60] = random.nextInt(11) + 80;

                for(int i = 46; i <=60;i++) {
                    arraystrin[i] = Integer.toString(arraynum[i]);
                }

                Num46.setText(arraystrin[46]);
                Num47.setText(arraystrin[47]);
                Num48.setText(arraystrin[48]);
                Num49.setText(arraystrin[49]);
                Num50.setText(arraystrin[50]);

                Num51.setText(arraystrin[51]);
                Num52.setText(arraystrin[52]);
                Num53.setText(arraystrin[53]);
                Num54.setText(arraystrin[54]);
                Num55.setText(arraystrin[55]);

                Num56.setText(arraystrin[56]);
                Num57.setText(arraystrin[57]);
                Num58.setText(arraystrin[58]);
                Num59.setText(arraystrin[59]);
                Num60.setText(arraystrin[60]);

            }

        }
    }//GEN-LAST:event_jLabel96MouseClicked

    private void fullscreenonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullscreenonMouseClicked

        gd.setFullScreenWindow(this);
        fullscreenon.setVisible(false);
        fullscreenoff.setVisible(true);

    }//GEN-LAST:event_fullscreenonMouseClicked

    private void fullscreenoffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullscreenoffMouseClicked
        gd.setFullScreenWindow(null);
        fullscreenoff.setVisible(false);
        fullscreenon.setVisible(true);
    }//GEN-LAST:event_fullscreenoffMouseClicked

    private void aiutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aiutoMouseEntered
        aiuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("domanda_entered.png")));
    }//GEN-LAST:event_aiutoMouseEntered

    private void aiutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aiutoMouseClicked
        JOptionPane.showMessageDialog(null,"Esposizione del gioco della tombola, tematizzato stile Harry Potter."
                + "\nRealizzato dagli alunni 5L Indirizzo 'Informatica'."); 
        /*
        "Benvenuti alla magica tombola tematizzata stile Harry Potter! Preparatevi a immergervi in
        un'esperienza unica e affascinante, dove incantesimi e magia si fondono con il classico divertimento della tombola. 
        Pronti a scoprire i numeri magici e vincere fantastici premi?"
        */
    }//GEN-LAST:event_aiutoMouseClicked

    private void aiutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aiutoMouseExited
        aiuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("domanda.png")));
    }//GEN-LAST:event_aiutoMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tombolainterfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tombolainterfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tombolainterfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tombolainterfaccia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tombolainterfaccia().setVisible(true);
            }
        });
        
        JPanel pn= new JPanel()
        {
            @Override
            public void paint(Graphics g)
            {
                g.setColor(Color.red);
                g.fillOval(10, 40, 100, 100);
            }
        };
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel E01;
    private javax.swing.JLabel E02;
    private javax.swing.JLabel E03;
    private javax.swing.JLabel E04;
    private javax.swing.JLabel E05;
    private javax.swing.JLabel E06;
    private javax.swing.JLabel E07;
    private javax.swing.JLabel E08;
    private javax.swing.JLabel E09;
    private javax.swing.JLabel E10;
    private javax.swing.JLabel E11;
    private javax.swing.JLabel E12;
    private javax.swing.JLabel E13;
    private javax.swing.JLabel E14;
    private javax.swing.JLabel E15;
    private javax.swing.JLabel E16;
    private javax.swing.JLabel E17;
    private javax.swing.JLabel E18;
    private javax.swing.JLabel E19;
    private javax.swing.JLabel E20;
    private javax.swing.JLabel E21;
    private javax.swing.JLabel E22;
    private javax.swing.JLabel E23;
    private javax.swing.JLabel E24;
    private javax.swing.JLabel E25;
    private javax.swing.JLabel E26;
    private javax.swing.JLabel E27;
    private javax.swing.JLabel E28;
    private javax.swing.JLabel E29;
    private javax.swing.JLabel E30;
    private javax.swing.JLabel E31;
    private javax.swing.JLabel E32;
    private javax.swing.JLabel E33;
    private javax.swing.JLabel E34;
    private javax.swing.JLabel E35;
    private javax.swing.JLabel E36;
    private javax.swing.JLabel E37;
    private javax.swing.JLabel E38;
    private javax.swing.JLabel E39;
    private javax.swing.JLabel E40;
    private javax.swing.JLabel E41;
    private javax.swing.JLabel E42;
    private javax.swing.JLabel E43;
    private javax.swing.JLabel E44;
    private javax.swing.JLabel E45;
    private javax.swing.JLabel E46;
    private javax.swing.JLabel E47;
    private javax.swing.JLabel E48;
    private javax.swing.JLabel E49;
    private javax.swing.JLabel E50;
    private javax.swing.JLabel E51;
    private javax.swing.JLabel E52;
    private javax.swing.JLabel E53;
    private javax.swing.JLabel E54;
    private javax.swing.JLabel E55;
    private javax.swing.JLabel E56;
    private javax.swing.JLabel E57;
    private javax.swing.JLabel E58;
    private javax.swing.JLabel E59;
    private javax.swing.JLabel E60;
    private javax.swing.JLabel E61;
    private javax.swing.JLabel E62;
    private javax.swing.JLabel E63;
    private javax.swing.JLabel E64;
    private javax.swing.JLabel E65;
    private javax.swing.JLabel E66;
    private javax.swing.JLabel E67;
    private javax.swing.JLabel E68;
    private javax.swing.JLabel E69;
    private javax.swing.JLabel E70;
    private javax.swing.JLabel E71;
    private javax.swing.JLabel E72;
    private javax.swing.JLabel E73;
    private javax.swing.JLabel E74;
    private javax.swing.JLabel E75;
    private javax.swing.JLabel E76;
    private javax.swing.JLabel E77;
    private javax.swing.JLabel E78;
    private javax.swing.JLabel E79;
    private javax.swing.JLabel E80;
    private javax.swing.JLabel E81;
    private javax.swing.JLabel E82;
    private javax.swing.JLabel E83;
    private javax.swing.JLabel E84;
    private javax.swing.JLabel E85;
    private javax.swing.JLabel E86;
    private javax.swing.JLabel E87;
    private javax.swing.JLabel E88;
    private javax.swing.JLabel E89;
    private javax.swing.JLabel E90;
    private javax.swing.JPanel Gioc1;
    private javax.swing.JPanel Gioc2;
    private javax.swing.JPanel Gioc3;
    private javax.swing.JPanel Gioc4;
    private javax.swing.JLabel GiocLabel1;
    private javax.swing.JLabel GiocLabel2;
    private javax.swing.JLabel GiocLabel3;
    private javax.swing.JLabel GiocLabel4;
    private javax.swing.JLabel Num1;
    private javax.swing.JLabel Num10;
    private javax.swing.JLabel Num11;
    private javax.swing.JLabel Num12;
    private javax.swing.JLabel Num13;
    private javax.swing.JLabel Num14;
    private javax.swing.JLabel Num15;
    private javax.swing.JLabel Num16;
    private javax.swing.JLabel Num17;
    private javax.swing.JLabel Num18;
    private javax.swing.JLabel Num19;
    private javax.swing.JLabel Num2;
    private javax.swing.JLabel Num20;
    private javax.swing.JLabel Num21;
    private javax.swing.JLabel Num22;
    private javax.swing.JLabel Num23;
    private javax.swing.JLabel Num24;
    private javax.swing.JLabel Num25;
    private javax.swing.JLabel Num26;
    private javax.swing.JLabel Num27;
    private javax.swing.JLabel Num28;
    private javax.swing.JLabel Num29;
    private javax.swing.JLabel Num3;
    private javax.swing.JLabel Num30;
    private javax.swing.JLabel Num31;
    private javax.swing.JLabel Num32;
    private javax.swing.JLabel Num33;
    private javax.swing.JLabel Num34;
    private javax.swing.JLabel Num35;
    private javax.swing.JLabel Num36;
    private javax.swing.JLabel Num37;
    private javax.swing.JLabel Num38;
    private javax.swing.JLabel Num39;
    private javax.swing.JLabel Num4;
    private javax.swing.JLabel Num40;
    private javax.swing.JLabel Num41;
    private javax.swing.JLabel Num42;
    private javax.swing.JLabel Num43;
    private javax.swing.JLabel Num44;
    private javax.swing.JLabel Num45;
    private javax.swing.JLabel Num46;
    private javax.swing.JLabel Num47;
    private javax.swing.JLabel Num48;
    private javax.swing.JLabel Num49;
    private javax.swing.JLabel Num5;
    private javax.swing.JLabel Num50;
    private javax.swing.JLabel Num51;
    private javax.swing.JLabel Num52;
    private javax.swing.JLabel Num53;
    private javax.swing.JLabel Num54;
    private javax.swing.JLabel Num55;
    private javax.swing.JLabel Num56;
    private javax.swing.JLabel Num57;
    private javax.swing.JLabel Num58;
    private javax.swing.JLabel Num59;
    private javax.swing.JLabel Num6;
    private javax.swing.JLabel Num60;
    private javax.swing.JLabel Num7;
    private javax.swing.JLabel Num8;
    private javax.swing.JLabel Num9;
    private javax.swing.JPanel P01;
    private javax.swing.JPanel P02;
    private javax.swing.JPanel P03;
    private javax.swing.JPanel P04;
    private javax.swing.JPanel P05;
    private javax.swing.JPanel P06;
    private javax.swing.JPanel P07;
    private javax.swing.JPanel P08;
    private javax.swing.JPanel P09;
    private javax.swing.JPanel P10;
    private javax.swing.JPanel P11;
    private javax.swing.JPanel P12;
    private javax.swing.JPanel P13;
    private javax.swing.JPanel P14;
    private javax.swing.JPanel P15;
    private javax.swing.JPanel P16;
    private javax.swing.JPanel P17;
    private javax.swing.JPanel P18;
    private javax.swing.JPanel P19;
    private javax.swing.JPanel P20;
    private javax.swing.JPanel P21;
    private javax.swing.JPanel P22;
    private javax.swing.JPanel P23;
    private javax.swing.JPanel P24;
    private javax.swing.JPanel P25;
    private javax.swing.JPanel P26;
    private javax.swing.JPanel P27;
    private javax.swing.JPanel P28;
    private javax.swing.JPanel P29;
    private javax.swing.JPanel P30;
    private javax.swing.JPanel P31;
    private javax.swing.JPanel P32;
    private javax.swing.JPanel P33;
    private javax.swing.JPanel P34;
    private javax.swing.JPanel P35;
    private javax.swing.JPanel P36;
    private javax.swing.JPanel P37;
    private javax.swing.JPanel P38;
    private javax.swing.JPanel P39;
    private javax.swing.JPanel P40;
    private javax.swing.JPanel P41;
    private javax.swing.JPanel P42;
    private javax.swing.JPanel P43;
    private javax.swing.JPanel P44;
    private javax.swing.JPanel P45;
    private javax.swing.JPanel P46;
    private javax.swing.JPanel P47;
    private javax.swing.JPanel P48;
    private javax.swing.JPanel P49;
    private javax.swing.JPanel P50;
    private javax.swing.JPanel P51;
    private javax.swing.JPanel P52;
    private javax.swing.JPanel P53;
    private javax.swing.JPanel P54;
    private javax.swing.JPanel P55;
    private javax.swing.JPanel P56;
    private javax.swing.JPanel P57;
    private javax.swing.JPanel P58;
    private javax.swing.JPanel P59;
    private javax.swing.JPanel P60;
    private javax.swing.JPanel P61;
    private javax.swing.JPanel P62;
    private javax.swing.JPanel P63;
    private javax.swing.JPanel P64;
    private javax.swing.JPanel P65;
    private javax.swing.JPanel P66;
    private javax.swing.JPanel P67;
    private javax.swing.JPanel P68;
    private javax.swing.JPanel P69;
    private javax.swing.JPanel P70;
    private javax.swing.JPanel P71;
    private javax.swing.JPanel P72;
    private javax.swing.JPanel P73;
    private javax.swing.JPanel P74;
    private javax.swing.JPanel P75;
    private javax.swing.JPanel P76;
    private javax.swing.JPanel P77;
    private javax.swing.JPanel P78;
    private javax.swing.JPanel P79;
    private javax.swing.JPanel P80;
    private javax.swing.JPanel P81;
    private javax.swing.JPanel P82;
    private javax.swing.JPanel P83;
    private javax.swing.JPanel P84;
    private javax.swing.JPanel P85;
    private javax.swing.JPanel P86;
    private javax.swing.JPanel P87;
    private javax.swing.JPanel P88;
    private javax.swing.JPanel P89;
    private javax.swing.JPanel P90;
    private javax.swing.JPanel Schermata1;
    private javax.swing.JPanel Schermata2;
    private javax.swing.JPanel Tabella;
    private javax.swing.JLabel aiuto;
    private javax.swing.JLabel fullscreenoff;
    private javax.swing.JLabel fullscreenon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel129;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel134;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel140;
    private javax.swing.JPanel jPanel141;
    private javax.swing.JPanel jPanel142;
    private javax.swing.JPanel jPanel143;
    private javax.swing.JPanel jPanel144;
    private javax.swing.JPanel jPanel145;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel147;
    private javax.swing.JPanel jPanel148;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel160;
    private javax.swing.JPanel jPanel161;
    private javax.swing.JPanel jPanel162;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
    private javax.swing.JPanel jPanel167;
    private javax.swing.JPanel jPanel168;
    private javax.swing.JPanel jPanel169;
    private javax.swing.JPanel jPanel170;
    private javax.swing.JPanel jPanel171;
    private javax.swing.JPanel jPanel172;
    private javax.swing.JPanel jPanel173;
    private javax.swing.JPanel jPanel174;
    private javax.swing.JPanel jPanel175;
    private javax.swing.JPanel jPanel176;
    private javax.swing.JPanel jPanel177;
    private javax.swing.JPanel jPanel178;
    private javax.swing.JPanel jPanel179;
    private javax.swing.JPanel jPanel180;
    private javax.swing.JPanel jPanel181;
    private javax.swing.JPanel jPanel182;
    private javax.swing.JPanel jPanel183;
    private javax.swing.JPanel jPanel184;
    private javax.swing.JPanel jPanel185;
    private javax.swing.JPanel jPanel186;
    private javax.swing.JPanel jPanel187;
    private javax.swing.JPanel jPanel188;
    private javax.swing.JPanel jPanel189;
    private javax.swing.JPanel jPanel190;
    private javax.swing.JPanel jPanel191;
    private javax.swing.JPanel jPanel192;
    private javax.swing.JPanel jPanel193;
    private javax.swing.JPanel jPanel194;
    private javax.swing.JPanel jPanel195;
    private javax.swing.JPanel jPanel196;
    private javax.swing.JPanel jPanel197;
    private javax.swing.JPanel jPanel198;
    private javax.swing.JPanel jPanel199;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel200;
    private javax.swing.JPanel jPanel201;
    private javax.swing.JPanel jPanel202;
    private javax.swing.JPanel jPanel203;
    private javax.swing.JPanel jPanel204;
    private javax.swing.JPanel jPanel205;
    private javax.swing.JPanel jPanel206;
    private javax.swing.JPanel jPanel207;
    private javax.swing.JPanel jPanel208;
    private javax.swing.JPanel jPanel209;
    private javax.swing.JPanel jPanel210;
    private javax.swing.JPanel jPanel211;
    private javax.swing.JPanel jPanel212;
    private javax.swing.JPanel jPanel213;
    private javax.swing.JPanel jPanel214;
    private javax.swing.JPanel jPanel215;
    private javax.swing.JPanel jPanel216;
    private javax.swing.JPanel jPanel217;
    private javax.swing.JPanel jPanel218;
    private javax.swing.JPanel jPanel219;
    private javax.swing.JPanel jPanel220;
    private javax.swing.JPanel jPanel221;
    private javax.swing.JPanel jPanel223;
    private javax.swing.JLabel premi;
    // End of variables declaration//GEN-END:variables

     class RoundedPanel extends JPanel
    {
        public Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public Color getBackgroundColor() {
            return backgroundColor;
        }

        public int getCornerRadius() {
            return cornerRadius;
        }

        public void setBackgroundColor(Color backgroundColor) {
            this.backgroundColor = backgroundColor;
        }

        public void setCornerRadius(int cornerRadius) {
            this.cornerRadius = cornerRadius;
        }

        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
        }
        
    }
}


