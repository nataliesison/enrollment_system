import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.*;
import java.io.File;
import java.io.IOException;
import java.awt.Desktop;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
public class System {
	public static final String jdriver ="com.mysql.jdbc.Driver";
	public static final String dburl ="jdbc:mysql://localhost:3306/system?useUnicode=true&characterEncoding=utf8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static final String userdb ="root";
	public static final String passdb ="";
    public static void main (String[] args) { 
	ClockPane 	clockpane = new ClockPane();
	ClockPane 	clockpane1 = new ClockPane();
	ClockPane 	clockpane2= new ClockPane();
	ClockPane	clockpane3= new ClockPane();
	ClockPane	clockpane4= new ClockPane();
	ClockPane	clockpane5= new ClockPane();
	ClockPane	clockpane6= new ClockPane();
    	String choice1[]={"BSIT","BSCS","BSPSYC","BSEED","BSHRM","BSBM","ABJOURN","BSHM","BSOA","BENT"};
    	String choice2[]={"BSIT","BSCS","BSPSYC","BSEED","BSHRM","BSBM","ABJOURN","BSHM","BSOA","BENT"};
    	String choice3[]={"BSIT","BSCS","BSPSYC","BSEED","BSHRM","BSBM","ABJOURN","BSHM","BSOA","BENT"};
    	String gender[]={"Male","Female"};
    	String str[]={"STEM","HUMSS","ABM","GAS","TVL-ICT","TVL-ELECTRONICS","TVL-IA","TVL-HE"};
    	String syr[]={"2016-2017","2017-2018","2018-2019","2019-2020","2021-2022"};
    	String yrad[]={"2016-2017","2017-2018","2018-2019","2019-2020","2021-2022"};
    	String nsem[]={"1st sem","2nd sem"};
    	String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
    	String civil1[]={"Single", "Married", "Widow"};
		String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String year[]={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};

    	//EnrollmentTable
   		String col1[]={"Status","Student Number","Last Name","First Name","Middle Name","Sex","Course","Sem","School Year","Age"};
   		String data1[][]={};
   		DefaultTableModel model=new DefaultTableModel(data1,col1);
		JTable enTable=new JTable(model);
		JScrollPane sp1=new JScrollPane(enTable);
		//StudentInformation		
		String col2[]={"Status","Student Number","Last Name","First Name","Middle Name","Sex","Course","Sem","School Year","Age"};
   		String data2[][]={};
   		DefaultTableModel model2=new DefaultTableModel(data2,col2);
		JTable inTable=new JTable(model2);
		JScrollPane sp2=new JScrollPane(inTable);
		//ArchiveTable
		String col3[]={"Status","Student Number","Last Name","First Name","Middle Name","Sex","Course","Sem","School Year","Age"};
   		String data3[][]={};
   		DefaultTableModel model3=new DefaultTableModel(data3,col3);
		JTable archTable=new JTable(model3);
		JScrollPane sp3=new JScrollPane(archTable);
    	//Frames
    	JFrame fmain=new JFrame("Enrollment System");
    	JFrame adm=new JFrame("Fill up Form");
    	JFrame login=new JFrame("Login Form");
    	JFrame terms=new JFrame("Terms and Conditions");
    	JFrame exam=new JFrame("Entrance Exam");
    	JFrame exam2 = new JFrame("Entrance Exam");
    	JFrame resultF=new JFrame("Results");
    	JFrame admin =new JFrame("Enrollment System (admin)");
    	JFrame FUpdate=new JFrame("Update");
    	JFrame FUpdate1=new JFrame("Update");
    	JFrame viewStudent=new JFrame("Student Information");
    	JFrame exam3 = new JFrame("Entrance Exam");
    	JFrame exam4 = new JFrame("Entrance Exam");
    	
    	Image icon2=Toolkit.getDefaultToolkit().getImage("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo2.png");
		fmain.setIconImage(icon2);
		Image icon3=Toolkit.getDefaultToolkit().getImage("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo2.png");
		adm.setIconImage(icon3);
		Image icon4=Toolkit.getDefaultToolkit().getImage("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo2.png");
		login.setIconImage(icon4);
		Image icon5=Toolkit.getDefaultToolkit().getImage("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo2.png");
		terms.setIconImage(icon5);
		Image icon6=Toolkit.getDefaultToolkit().getImage("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo2.png");
		exam.setIconImage(icon6);
		Image icon7=Toolkit.getDefaultToolkit().getImage("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo2.png");
		exam2.setIconImage(icon7);
		Image icon8=Toolkit.getDefaultToolkit().getImage("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo2.png");
		exam3.setIconImage(icon8);
		Image icon9=Toolkit.getDefaultToolkit().getImage("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo2.png");
		exam4.setIconImage(icon9);
		Image icon10=Toolkit.getDefaultToolkit().getImage("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo2.png");
		FUpdate.setIconImage(icon10);
		Image icon11=Toolkit.getDefaultToolkit().getImage("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo2.png");
		FUpdate1.setIconImage(icon11);
		Image icon12=Toolkit.getDefaultToolkit().getImage("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo2.png");
		resultF.setIconImage(icon12);
		Image icon13=Toolkit.getDefaultToolkit().getImage("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo2.png");
		admin.setIconImage(icon13);
		Image icon14=Toolkit.getDefaultToolkit().getImage("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo2.png");
		viewStudent.setIconImage(icon14);
    	
    	//MAinf
    	Color lightGreen1 = Color.decode("#C1FFC1");
    	Color green1 = Color.decode("#F5F5F5");
    	JLabel lb1=new JLabel("Admin");
    	JLabel lb2=new JLabel("Log in as...");
    	JLabel lb3=new JLabel("Student");
    	ImageIcon iconTour = new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\tourIcon.png");
    	ImageIcon fmainStudent = new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\studIcon.png");
    	ImageIcon fmainAdm = new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\admIcon.png");
    	JButton stud=new JButton(fmainStudent);
    	JButton Admin=new JButton(fmainAdm);
    	ImageIcon headerMain=new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsuheader1.png");
    	JLabel headerL = new JLabel(headerMain);
    	JButton tour=new JButton("TOUR",iconTour);
    	//termsCond
    	Color whiteSmoke = Color.decode("#FFFAFA");
    	JTextArea tcArea = new JTextArea();
    	JLabel title = new JLabel("TERMS AND CONDITION");
    	JRadioButton yestc = new JRadioButton("I agree");
    	JRadioButton notc = new JRadioButton("I disagree");
    	JButton tcBack = new JButton("Back");
    	JButton tcNext = new JButton("Next");
    	//JButton tcCan = new JButton("Cancel");
    	//entrance exam
    	JPanel leftPanel1 = new JPanel();
    	JPanel rightPanel1 = new JPanel();
    	JPanel leftPanel2 = new JPanel();
    	JPanel rightPanel2 = new JPanel();
    	JLabel dirEx = new JLabel("I. Direction: Fill in the missing word/phrase. Choose the letter of the correct answer.");
    	JButton nextEx = new JButton("Next");
    	JButton backAd = new JButton("Back");
    	JButton nextEx2 = new JButton("Next");
    	JButton backAd2 = new JButton("Back");
    	
    	JPanel leftPanel3 = new JPanel();
    	JPanel rightPanel3 = new JPanel();
    	JPanel leftPanel4 = new JPanel();
    	JPanel rightPanel4 = new JPanel();
    	JLabel dirEx2 = new JLabel("I. Transform each statement below into mathematical statement.");
    	JButton nextEx3 = new JButton("Next");
    	JButton backAd3 = new JButton("Back");
    	//JButton nextEx4 = new JButton("Next");
    	JButton backAd4 = new JButton("Back");
    	//result
    	//admform
    	Color bgGreen = Color.decode("#E1F5A9");
    	Color lsGreen = Color.decode("#4FEA37");
    	ImageIcon logoCvsu = new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo2.png");
    	JLabel logoFil = new JLabel(logoCvsu);
    	JLabel fil1=new JLabel("Republic of the Philippines");
    	JLabel fil2=new JLabel("CAVITE STATE UNIVERSITY");
    	JLabel fil3=new JLabel("Imus Campus");
    	JLabel fil4=new JLabel("Imus City, Cavite");
    	JLabel fil5=new JLabel("APPLICATION FORM FOR ADMISSION");
    	JLabel fil6=new JLabel("Please indicate Preferred Courses:");
    	JLabel Lname=new JLabel("Last Name: ");
    	JTextField ln=new JTextField();
    	JLabel Fname=new JLabel("First Name: ");
    	JTextField fn=new JTextField();
    	JLabel Mname=new JLabel("Middle Name: ");
    	JTextField mn=new JTextField();
    	JComboBox cb1=new JComboBox(choice1);
    	JComboBox cb2=new JComboBox(choice2);
    	JComboBox cb3=new JComboBox(choice3);
    	JLabel c1=new JLabel("1st choice");
    	JLabel c2=new JLabel("2st choice");
    	JLabel c3=new JLabel("3st choice");
    	JLabel lref=new JLabel("Learner's Reference Number: ");
    	JTextField lrn=new JTextField();
    	JLabel yerlb=new JLabel("School Year:	");
    	JComboBox cbyr=new JComboBox(yrad);
    	JLabel nsem1=new JLabel("Sem: ");
    	JComboBox nsem2=new JComboBox(nsem);
    	JLabel strand=new JLabel("Strand (SHS Grad): ");
    	JComboBox cstrand=new JComboBox(str);
    	JLabel addr=new JLabel("Permanent Address: ");
    	JTextField peradd=new JTextField();
    	JLabel cellnum=new JLabel("Contact No: ");
    	JTextField mobilenum=new JTextField();
    	JLabel em=new JLabel("Email Address: ");
    	JTextField email=new JTextField();
    	JLabel gen=new JLabel("Sex: ");
    	JComboBox sex=new JComboBox(gender);
    	JLabel age=new JLabel("Age: ");
    	JTextField AGE=new JTextField();
    	JLabel bday=new JLabel("Date of Birth: ");
    	JLabel reli=new JLabel("Religion: ");
    	JTextField religion=new JTextField();
    	JLabel nat=new JLabel("Nationality: ");
    	JTextField nationality=new JTextField();
    	JLabel cv=new JLabel("Civil Status: ");
    	JComboBox civil=new JComboBox(civil1);
    	JLabel fam=new JLabel("F A M I L Y   B A C K G R O U N D");
    	JLabel dad=new JLabel("Father: ");
    	JTextField papa=new JTextField();
    	JLabel mom=new JLabel("Mother: ");
    	JTextField mama=new JTextField();
    	JLabel guard=new JLabel("Guardian: ");
    	JTextField bantay=new JTextField();
    	JLabel work1=new JLabel("Occupation: ");
    	JTextField w1=new JTextField();
  		JLabel work2=new JLabel("Occupation: ");
  		JTextField w2=new JTextField();
  		JLabel work3=new JLabel("Occupation: ");
    	JTextField w3=new JTextField();
    	JLabel cnum1=new JLabel("Contact No.: ");
    	JTextField cn1=new JTextField();
    	JLabel cnum2=new JLabel("Contact No.: ");
    	JTextField cn2=new JTextField();
    	JLabel cnum3=new JLabel("Contact No.: ");
    	JTextField cn3=new JTextField();
    	JLabel educ=new JLabel("E D U C A T I O N A L  B A C K G R O U N D");
    	JLabel nschl = new JLabel("School Name");
    	JLabel sy=new JLabel("Year Graduated");
    	JLabel elem=new JLabel("Elementary");
    	JLabel secon=new JLabel("Secondary");
    	JLabel voc=new JLabel("Vocational");
    	JLabel col=new JLabel("College");
    	JTextField schl1=new JTextField();
    	JTextField yr1=new JTextField();
    	JTextField schl2=new JTextField();
    	JTextField yr2=new JTextField();
    	JTextField schl3=new JTextField();
    	JTextField yr3=new JTextField();
    	JTextField schl4=new JTextField();
    	JTextField yr4=new JTextField();
    	JButton nnext=new JButton("Next");
    	JLabel req=new JLabel("Requirements");
    	JCheckBox f138=new JCheckBox("Form 138");
    	JCheckBox f137=new JCheckBox("Form 137");
    	JCheckBox nso=new JCheckBox("NSO/PSA");
    	JCheckBox gMoral = new JCheckBox("Good Moral");
    	JCheckBox dip = new JCheckBox("Diploma");
    	JPanel r=new JPanel();
    	JButton bck=new JButton("Back");
		JComboBox mon=new JComboBox(month);
		JComboBox day=new JComboBox(date);
		JComboBox yr=new JComboBox(year);
    	//LoginForm
    	Color beige = Color.decode("#FFF0F5");
    	JPanel logp=new JPanel();
    	JLabel ad=new JLabel("WELCOME Admin!");
    	ImageIcon aduser=new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\loginAdm.png");
    	ImageIcon adpass=new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\loginPass.png");
    	JLabel uuser=new JLabel(aduser);
    	JLabel ppass=new JLabel(adpass);
    	JPasswordField pass=new JPasswordField();
    	JTextField user=new JTextField();
    	JButton log=new JButton("LOGIN");
    	JButton cancel=new JButton("CANCEL");
    	//adminmain
    	ImageIcon admins=new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\jn1.jpg");
    	ImageIcon generalBG=new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\greenBg.jpg");
    	ImageIcon iconHome=new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\iconHome.png");
    	ImageIcon iconEnroll=new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\iconEnroll.png");
    	ImageIcon iconStudInfo=new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\iconStudInfo.png");
    	ImageIcon iconReg=new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\iconReg.png");
    	ImageIcon iconReport=new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\iconReport.png");
    	ImageIcon iconArchive=new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\iconArchive.png");
    	ImageIcon iconLogout=new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\iconLogout.png");
    	JLabel icon= new JLabel(admins);
    	JLabel wel=new JLabel("WELCOME !");
    	JLabel a=new JLabel("Administrator");
    	JButton home=new JButton("HOME", iconHome);
    	JButton enroll=new JButton("ENROLLMENT", iconEnroll);
    	JButton info=new JButton("STUDENT INFO.", iconStudInfo);
    	JButton regf=new JButton("REG FORM", iconReg);
    	JButton report=new JButton("REPORT", iconReport);
    	JButton archiveb=new JButton("ARCHIVE", iconArchive);
    	JButton logout=new JButton("LOGOUT", iconLogout);
    	JPanel jp1=new JPanel();
    	JPanel jp2=new JPanel();
    	JPanel jphome=new JPanel();
    	JPanel jpen=new JPanel();
    	JPanel jpin=new JPanel();
    	JPanel jpreg=new JPanel();
    	JPanel jprep=new JPanel();
    	JPanel jparch=new JPanel();
    	JLabel logo=new JLabel();
    	JButton pending=new JButton("PENDING");
    	JButton approve=new JButton("APPROVE");
    	JButton dropped=new JButton("DROPPED");
    	JButton view = new JButton("View");
    	JButton vBack =new JButton("Back");
    	JButton newstud=new JButton("New Student");
    	JButton search=new JButton("Search");
    	JTextField sear=new JTextField();
    	JButton it=new JButton("BSIT");	
    	JButton cs=new JButton("BSCS");
    	JButton psyc=new JButton("BSPSYC");
    	JButton ee=new JButton("BSEED");
    	JButton bsem=new JButton("BSHRM");
    	JButton bm=new JButton("BSBM");
    	JButton hm=new JButton("BSHM");
    	JButton journ=new JButton("AB-JOURN");
    	JButton oa=new JButton("BSOA");
    	JButton bent=new JButton("BENT");
    	JButton save=new JButton("Save");
    	JButton cncl=new JButton("Cancel");
    	ImageIcon cvsu=new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo1.png");
    	JLabel lblogo=new JLabel(cvsu);
    	JTextField sear1=new JTextField();
    	JButton search1=new JButton("Search");
    	JButton archive=new JButton("Archive");
    	JButton update=new JButton("Update");
    	JTextField sear2=new JTextField();
    	JButton search2=new JButton("Search");
    	JLabel course=new JLabel();
    	JLabel address=new JLabel();
    	JLabel sem=new JLabel();
    	JLabel schlyr=new JLabel();
    	JPanel j1=new JPanel();
    	JPanel j2=new JPanel();
    	JPanel j3=new JPanel();
    	JPanel j4=new JPanel();
    	JPanel j5=new JPanel();
    	JPanel j6=new JPanel();
    	JPanel j7=new JPanel();
    	JPanel j8=new JPanel();
    	JPanel j9=new JPanel();
    	JPanel j10=new JPanel();
    	JPanel j11=new JPanel();
    	JPanel j12=new JPanel();
    	JPanel j13=new JPanel();
    	JPanel j14=new JPanel();
    	JPanel j15=new JPanel();
    	JPanel j16=new JPanel();
    	JPanel j17=new JPanel();
    	JPanel j18=new JPanel();
    	JPanel j19=new JPanel();
    	JPanel j20=new JPanel();
    	JPanel j21=new JPanel();
    	JPanel j22=new JPanel();
    	JPanel j23=new JPanel();
    	JPanel j24=new JPanel();
    	JPanel j25=new JPanel();
    	JPanel j26=new JPanel();
    	JPanel j27=new JPanel();
    	JPanel j28=new JPanel();
    	JPanel j29=new JPanel();
    	JPanel j30=new JPanel();
    	JPanel j31=new JPanel();
    	JPanel j32=new JPanel();
    	JPanel j33=new JPanel();
    	JPanel j34=new JPanel();
    	JPanel j35=new JPanel();
    	JPanel j36=new JPanel();
    	JPanel j37=new JPanel();
    	JPanel j38=new JPanel();
    	JPanel j39=new JPanel();
    	JPanel j40=new JPanel();
    	JPanel j41=new JPanel();
    	JPanel j42=new JPanel();
    	JPanel j43=new JPanel();
    	JPanel j44=new JPanel();
    	JPanel j45=new JPanel();
    	JPanel j46=new JPanel();
    	JPanel j47=new JPanel();
    	JPanel j48=new JPanel();
    	JPanel j49=new JPanel();
    	JLabel l1=new JLabel("Sched Code");
    	JLabel l2=new JLabel("Course Code");
    	JLabel l3=new JLabel("Course Description");
    	JLabel l4=new JLabel("Units");
    	JLabel l5=new JLabel("Time");
    	JLabel l6=new JLabel("Day");
    	JLabel l7=new JLabel("Room");
		JLabel l9=new JLabel("201820035");
		JLabel l10=new JLabel("201820036");
		JLabel l11=new JLabel("201820037");
		JLabel l12=new JLabel("201820038");
		JLabel l13=new JLabel("201820039");
		JLabel l14=new JLabel("201820040");
		JLabel l15=new JLabel("GNED 01");
		JLabel l16=new JLabel("GNED 06");
		JLabel l17=new JLabel("GNED 11A");
		JLabel l18=new JLabel("GNED 03");
		JLabel l19=new JLabel("DCIT 23A");
		JLabel l20=new JLabel("ITEC 50A");
		JLabel l21=new JLabel("ART APPRECIATION");
		JLabel l22=new JLabel("SCIENCE, TECHNOLOGY, AND SOCIETY");
		JLabel l23=new JLabel("PANITIKANG PANLIPUNAN");
		JLabel l24=new JLabel("MATHEMATICS IN THE MODERN WORLD");
		JLabel l25=new JLabel("COMPUTER PROGRAMMING 2");
		JLabel l26=new JLabel("WEB SYSTEM AND TECHNOLOGIES 1");
		JLabel l27=new JLabel("3.00");
		JLabel l28=new JLabel("3.00");
		JLabel l29=new JLabel("3.00");
		JLabel l30=new JLabel("3.00");
		JLabel l31=new JLabel("3.00");
		JLabel l32=new JLabel("3.00");
		JLabel l33=new JLabel("17:00-18:30/17:00-18:30");
		JLabel l34=new JLabel("11:30-13:00/14:00-15:30");
		JLabel l35=new JLabel("10:00-11:30/15:30-17:00");
		JLabel l36=new JLabel("16:30-18:00/13:30-15:00");
		JLabel l37=new JLabel("13:00-15:00/7:00-12:00");
		JLabel l38=new JLabel("8:00-11:00/13:00-15:00");
		JLabel l39=new JLabel("M/W");
		JLabel l40=new JLabel("M/W");
		JLabel l41=new JLabel("T/W");
		JLabel l42=new JLabel("T/W");
		JLabel l43=new JLabel("M/W");
		JLabel l44=new JLabel("M/T");
		JLabel l45=new JLabel("119/116");
		JLabel l46=new JLabel("112/119");
		JLabel l47=new JLabel("A-402/A-402");
		JLabel l48=new JLabel("205/113");
		JLabel l49=new JLabel("201/CL1");
		JLabel l50=new JLabel("CL2/201");
		JLabel l59=new JLabel("201820059");
		JLabel l60=new JLabel("201820060");
		JLabel l61=new JLabel("201820061");
		JLabel l62=new JLabel("201820062");
		JLabel l63=new JLabel("201820063");
		JLabel l64=new JLabel("201820064");
		JLabel l65=new JLabel("GNED 01");
		JLabel l66=new JLabel("GNED 03");
		JLabel l67=new JLabel("GNED 06");
		JLabel l68=new JLabel("GNED 12");
		JLabel l69=new JLabel("  DCIT 23");
		JLabel l70=new JLabel("ITEC 50");
		JLabel l71=new JLabel("ART APPRECIATION");
		JLabel l72=new JLabel("MATHEMATICS IN THE MODERN WORLD");
		JLabel l73=new JLabel("SCIENCE, TECHNOLOGY, AND SOCIETY");
		JLabel l74=new JLabel("DALUMAT NG/SA FILIPINO");
		JLabel l75=new JLabel("COMPUTER PROGRAMMING 2");
		JLabel l76=new JLabel("WEB SYSTEM AND TECHNOLOGIES");
		JLabel l77=new JLabel("3.00");
		JLabel l78=new JLabel("3.00");
		JLabel l79=new JLabel("3.00");
		JLabel l80=new JLabel("3.00");
		JLabel l81=new JLabel("3.00");
		JLabel l82=new JLabel("3.00");
		JLabel l83=new JLabel("17:00-18:30/17:00-18:30");
		JLabel l84=new JLabel("11:30-13:00/14:00-15:30");
		JLabel l85=new JLabel("10:00-11:30/15:30-17:00");
		JLabel l86=new JLabel("16:30-18:00/13:30-15:00");
		JLabel l87=new JLabel("13:00-15:00/7:00-12:00");
		JLabel l88=new JLabel("8:00-11:00/13:00-15:00");
		JLabel l89=new JLabel("T/TH");
		JLabel l90=new JLabel("T/TH");
		JLabel l91=new JLabel("M/T");
		JLabel l92=new JLabel("M/W");
		JLabel l93=new JLabel("T/F");
		JLabel l94=new JLabel("T/W");
		JLabel l95=new JLabel("119/116");
		JLabel l96=new JLabel("112/119");
		JLabel l97=new JLabel("A-402/A-402");
		JLabel l98=new JLabel("205/113");
		JLabel l99=new JLabel("201/CL1");
		JLabel l100=new JLabel("CL2/201");
		JLabel l101=new JLabel("201820101");
		JLabel l102=new JLabel("201820102");
		JLabel l103=new JLabel("201820103");
		JLabel l104=new JLabel("201820104");
		JLabel l105=new JLabel("201820105");
		JLabel l106=new JLabel("201820106");
		JLabel l107=new JLabel("BPSY 50");
		JLabel l108=new JLabel("  BPSY 60");
		JLabel l109=new JLabel("  BIOL 5");
		JLabel l110=new JLabel("  ZOOL 1");
		JLabel l111=new JLabel("  NSTP 2");
		JLabel l112=new JLabel("   FITT 2");
		JLabel l113=new JLabel("PSYCHOLOGICAL STATISTICS");
		JLabel l114=new JLabel("THEORIES OF PERSONALITY");
		JLabel l115=new JLabel("BIOLOGY OF HEALTH AND SCIENCES");
		JLabel l116=new JLabel("GENERAL ZOOLOGY");
		JLabel l117=new JLabel("NATIONAL SSERVICE TRAINING 2");
		JLabel l118=new JLabel("FITNESS EXERCISES");
		JLabel l119=new JLabel("3.00");
		JLabel l120=new JLabel("3.00");
		JLabel l121=new JLabel("3.00");
		JLabel l122=new JLabel("3.00");
		JLabel l123=new JLabel("3.00");
		JLabel l124=new JLabel("3.00");
		JLabel l125=new JLabel("17:00-18:30/17:00-18:30");
		JLabel l126=new JLabel("11:30-13:00/14:00-15:30");
		JLabel l127=new JLabel("10:00-11:30/15:30-17:00");
		JLabel l128=new JLabel("16:30-18:00/13:30-15:00");
		JLabel l129=new JLabel("13:00-15:00/7:00-12:00");
		JLabel l130=new JLabel("8:00-11:00/13:00-15:00");
		JLabel l131=new JLabel("M/W");
		JLabel l132=new JLabel("M/W");
		JLabel l133=new JLabel("T/W");
		JLabel l134=new JLabel("T/W");
		JLabel l135=new JLabel("M/W");
		JLabel l136=new JLabel("M/T");
		JLabel l137=new JLabel("119/116");
		JLabel l138=new JLabel("112/119");
		JLabel l139=new JLabel("A-402/A-402");
		JLabel l140=new JLabel("205/113");
		JLabel l141=new JLabel("201/CL1");
		JLabel l142=new JLabel("CL2/201");
		JLabel l143=new JLabel("201820137");
		JLabel l144=new JLabel("201820138");
		JLabel l145=new JLabel("201820139");
		JLabel l146=new JLabel("201820140");
		JLabel l147=new JLabel("201820141");
		JLabel l148=new JLabel("201820142");
		JLabel l149=new JLabel("GNED 11");
		JLabel l150=new JLabel("GNED 08");
		JLabel l151=new JLabel("GNED 06");
		JLabel l152=new JLabel("EDUC 60");
		JLabel l153=new JLabel("EDUC 65   ");
		JLabel l154=new JLabel("ITEC 85");
		JLabel l155=new JLabel("PANITIKANGPANLIPUNAN");
		JLabel l156=new JLabel("UNDERSTANDING THE SELF");
		JLabel l157=new JLabel("FACILITAING LEARNER-CENTERED TEACHING");
		JLabel l158=new JLabel("FOUNDATION OF SPECIAL AND INC. ED.");
		JLabel l159=new JLabel("TECH FOR TEACHING & LEARNING");
		JLabel l160=new JLabel("LANGUAGE, CULTURE AND SOCIETY");
		JLabel l161=new JLabel("3.00");
		JLabel l162=new JLabel("3.00");
		JLabel l163=new JLabel("3.00");
		JLabel l164=new JLabel("3.00");
		JLabel l165=new JLabel("3.00");
		JLabel l166=new JLabel("3.00");
		JLabel l167=new JLabel("17:00-18:30/17:00-18:30");
		JLabel l168=new JLabel("11:30-13:00/14:00-15:30");
		JLabel l169=new JLabel("10:00-11:30/15:30-17:00");
		JLabel l170=new JLabel("16:30-18:00/13:30-15:00");
		JLabel l171=new JLabel("13:00-15:00/7:00-12:00");
		JLabel l172=new JLabel("8:00-11:00/13:00-15:00");
		JLabel l173=new JLabel("M/W");
		JLabel l174=new JLabel("M/W");
		JLabel l175=new JLabel("T/W");
		JLabel l176=new JLabel("T/W");
		JLabel l177=new JLabel("M/W");
		JLabel l178=new JLabel("M/T");
		JLabel l179=new JLabel("119/116");
		JLabel l180=new JLabel("112/119");
		JLabel l181=new JLabel("A-402/A-402");
		JLabel l182=new JLabel("205/113");
		JLabel l183=new JLabel("201/CL1");
		JLabel l184=new JLabel("CL2/201");
		JLabel l185=new JLabel("201820059");
		JLabel l186=new JLabel("201820060");
		JLabel l187=new JLabel("201820061");
		JLabel l188=new JLabel("201820062");
		JLabel l189=new JLabel("201820063");
		JLabel l190=new JLabel("201820064");
		JLabel l191=new JLabel("GNED 01");
		JLabel l192=new JLabel("GNED 03");
		JLabel l193=new JLabel("GNED 06");
		JLabel l194=new JLabel("GNED 12");
		JLabel l195=new JLabel("DCIT 23   ");
		JLabel l196=new JLabel("ITEC 50");
		JLabel l197=new JLabel("ART APPRECIATION");
		JLabel l198=new JLabel("MATHEMATICS IN THE MODERN WORLD");
		JLabel l199=new JLabel("SCIENCE, TECHNOLOGY, AND SOCIETY");
		JLabel l200=new JLabel("DALUMAT NG/SA FILIPINO");
		JLabel l201=new JLabel("COMPUTER PROGRAMMING 2");
		JLabel l202=new JLabel("WEB SYSTEM AND TECHNOLOGIES");
		JLabel l203=new JLabel("3.00");
		JLabel l204=new JLabel("3.00");
		JLabel l205=new JLabel("3.00");
		JLabel l206=new JLabel("3.00");
		JLabel l207=new JLabel("3.00");
		JLabel l208=new JLabel("3.00");
		JLabel l209=new JLabel("17:00-18:30/17:00-18:30");
		JLabel l210=new JLabel("11:30-13:00/14:00-15:30");
		JLabel l211=new JLabel("10:00-11:30/15:30-17:00");
		JLabel l212=new JLabel("16:30-18:00/13:30-15:00");
		JLabel l213=new JLabel("13:00-15:00/7:00-12:00");
		JLabel l214=new JLabel("8:00-11:00/13:00-15:00");
		JLabel l215=new JLabel("M/W");
		JLabel l216=new JLabel("M/W");
		JLabel l217=new JLabel("T/W");
		JLabel l218=new JLabel("T/W");
		JLabel l219=new JLabel("M/W");
		JLabel l220=new JLabel("M/T");
		JLabel l221=new JLabel("119/116");
		JLabel l222=new JLabel("112/119");
		JLabel l223=new JLabel("A-402/A-402");
		JLabel l224=new JLabel("205/113");
		JLabel l225=new JLabel("201/CL1");
		JLabel l226=new JLabel("205/113");
		JLabel l227=new JLabel("201820059");
		JLabel l228=new JLabel("201820060");
		JLabel l229=new JLabel("201820061");
		JLabel l230=new JLabel("201820062");
		JLabel l231=new JLabel("201820063");
		JLabel l232=new JLabel("201820064");
		JLabel l233=new JLabel("BMGT 23");
		JLabel l234=new JLabel("SOSC 6");
		JLabel l235=new JLabel("BMGT 24");
		JLabel l236=new JLabel("MNGT 26");
		JLabel l237=new JLabel("HUMN 6   ");
		JLabel l238=new JLabel("BLAW 21");
		JLabel l239=new JLabel("BUSINESS MANAGEMENT");
		JLabel l240=new JLabel("----LIFE AND WORKS OF RIZAL-----");
		JLabel l241=new JLabel("-----BASIC FINANCE-----");
		JLabel l242=new JLabel("INTRODUCTION TO QUANTITATIVE APPROACH");
		JLabel l243=new JLabel("-----SOCIAL PHILOSOPHY------");
		JLabel l244=new JLabel("OBLIGATIONS A N D CONTRACTS");
		JLabel l245=new JLabel("3.00");
		JLabel l246=new JLabel("3.00");
		JLabel l247=new JLabel("3.00");
		JLabel l248=new JLabel("3.00");
		JLabel l249=new JLabel("3.00");
		JLabel l250=new JLabel("3.00");
		JLabel l251=new JLabel("17:00-18:30/17:00-18:30");
		JLabel l252=new JLabel("11:30-13:00/14:00-15:30");
		JLabel l253=new JLabel("10:00-11:30/15:30-17:00");
		JLabel l254=new JLabel("16:30-18:00/13:30-15:00");
		JLabel l255=new JLabel("13:00-15:00/7:00-12:00");
		JLabel l256=new JLabel("8:00-11:00/13:00-15:00");
		JLabel l257=new JLabel("M/W");
		JLabel l258=new JLabel("M/W");
		JLabel l259=new JLabel("T/W");
		JLabel l260=new JLabel("T/W");
		JLabel l261=new JLabel("M/W");
		JLabel l262=new JLabel("M/T");
		JLabel l263=new JLabel("119/116");
		JLabel l264=new JLabel("112/119");
		JLabel l265=new JLabel("A-402/A-402");
		JLabel l266=new JLabel("205/113");
		JLabel l267=new JLabel("201/CL1");
		JLabel l268=new JLabel("CL2/201");
		JLabel l269=new JLabel("201820059");
		JLabel l270=new JLabel("201820060");
		JLabel l271=new JLabel("201820061");
		JLabel l272=new JLabel("201820062");
		JLabel l273=new JLabel("201820063");
		JLabel l274=new JLabel("201820064");
		JLabel l275=new JLabel("  GNED 07");
		JLabel l276=new JLabel("  GNED 12");
		JLabel l277=new JLabel("  GNED 03");
		JLabel l278=new JLabel("  JOUR 60");
		JLabel l279=new JLabel("     NSTP 2");
		JLabel l280=new JLabel("  FITT 2");
		JLabel l281=new JLabel("THE CONTEMPORARY WORLD");
		JLabel l282=new JLabel("DALUMAT NG / SA FILIPINO");
		JLabel l283=new JLabel("MATHEMATICS IN THE MODERN WORLD");
		JLabel l284=new JLabel("COMMUNICATION THEORY");
		JLabel l285=new JLabel("NATIONAL SERVICE TRAINING PROGRAM 2");
		JLabel l286=new JLabel("FITNESS EXERCISES 2");
		JLabel l287=new JLabel("3.00");
		JLabel l288=new JLabel("3.00");
		JLabel l289=new JLabel("3.00");
		JLabel l290=new JLabel("3.00");
		JLabel l291=new JLabel("3.00");
		JLabel l292=new JLabel("3.00");
		JLabel l293=new JLabel("17:00-18:30/17:00-18:30");
		JLabel l294=new JLabel("11:30-13:00/14:00-15:30");
		JLabel l295=new JLabel("10:00-11:30/15:30-17:00");
		JLabel l296=new JLabel("16:30-18:00/13:30-15:00");
		JLabel l297=new JLabel("13:00-15:00/7:00-12:00");
		JLabel l298=new JLabel("8:00-11:00/13:00-15:00");
		JLabel l299=new JLabel("T/TH");
		JLabel l300=new JLabel("M/W");
		JLabel l301=new JLabel("T/W");
		JLabel l302=new JLabel("T/W");
		JLabel l303=new JLabel("M/W");
		JLabel l304=new JLabel("M/TH");
		JLabel l305=new JLabel("119/116");
		JLabel l306=new JLabel("112/119");
		JLabel l307=new JLabel("A-402/A-402");
		JLabel l308=new JLabel("205/113");
		JLabel l309=new JLabel("201/CL1");
		JLabel l310=new JLabel("CL2/201");
		JButton regIt=new JButton("BSIT");	
    	JButton regCs=new JButton("BSCS");
    	JButton regPsyc=new JButton("BSPSYC");
    	JButton regEe=new JButton("BSEED");
    	JButton regBsem=new JButton("BSHRM");
    	JButton regBm=new JButton("BSBM");
    	JButton regHm=new JButton("BSHM");
    	JButton regJourn=new JButton("AB-JOURN");
    	JButton regOa=new JButton("BSOA");
    	JButton regBent=new JButton("BENT");	
		JButton print=new JButton("Print");
		JPanel sem1=new JPanel();
		JPanel sem2=new JPanel();
		JLabel tnum=new JLabel("Number of Enrollees: ");
		JLabel tnum1=new JLabel("Number of Enrollees: ");
		JLabel drp=new JLabel("Number of Drop Students: ");
		JLabel drp1=new JLabel("Number of Drop Students: ");
		JComboBox year1=new JComboBox(syr);
		JLabel crs=new JLabel();
		//UpdateButton
		JButton upsave=new JButton("Save");
		JButton enUpdate=new JButton("UPDATE");
		//archiveButton
		JButton retrive =new JButton("Retrieve");
		JLabel d=new JLabel("Drop Students Archive");
		JLabel ar=new JLabel("Students Archive");
		
		
		
		

		
		home.setBackground(bgGreen);
		enroll.setBackground(bgGreen);
		info.setBackground(bgGreen);
		regf.setBackground(bgGreen);
		report.setBackground(bgGreen);
		archiveb.setBackground(bgGreen);
		logout.setBackground(bgGreen);
		tour.setBackground(bgGreen);
		it.setBackground(bgGreen);
		cs.setBackground(bgGreen);
		psyc.setBackground(bgGreen);
		ee.setBackground(bgGreen);
		hm.setBackground(bgGreen);
		bsem.setBackground(bgGreen);
		journ.setBackground(bgGreen);
		oa.setBackground(bgGreen);
		bent.setBackground(bgGreen);
		bm.setBackground(bgGreen);
		regIt.setBackground(bgGreen);
		regCs.setBackground(bgGreen);
		regPsyc.setBackground(bgGreen);
		regEe.setBackground(bgGreen);
		regBsem.setBackground(bgGreen);
		regBm.setBackground(bgGreen);
		regHm.setBackground(bgGreen);
		regJourn.setBackground(bgGreen);
		regOa.setBackground(bgGreen);
		regBent.setBackground(bgGreen);
		
		
    	//-------------------------------------------end of constructor-------------------------------------//
    	
    	//---------------------------------------mainFrameSelection----------------------------------------//
    	
    	headerL.setBounds(0,10,1350,201);
    	lb1.setBounds(828,500,200,50);
    	lb2.setBounds(580,250,300,50);
    	lb3.setBounds(425,500,200,50);
    	lb2.setFont(new Font("Times New Roman",20,30));
    	stud.setBounds(350,300,200,200);
    	Admin.setBounds(750,300,200,200);
    	tour.setBounds(1090,580,200,50);
    	clockpane.setBounds(20,580,200,50);
    	clockpane5.setBounds(20,580,200,50);
    	clockpane6.setBounds(50,385,150,50);
    	clockpane1.setBounds(1080,200,200,50);
    	clockpane2.setBounds(1080,200,200,50);
    	clockpane3.setBounds(1080,200,200,50);
    	clockpane4.setBounds(1080,200,200,50);
    	
    	
    	try{
   			fmain.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\greenBackground1.jpg")))));
   			}
   		catch(IOException e){
   			e.printStackTrace();
   			}
    	
    	//student
    	stud.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			fmain.setVisible(false);
    			terms.setVisible(true);	
    		}
    	});
    	
    	//admin
    	    Admin.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			fmain.setVisible(false);
    			login.setVisible(true);
    		}
    	});
    	//Tour
    	tour.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
       			try {
                    video();
                } 
                catch (IOException ex) {
                    ex.printStackTrace();
                }
       	
					}
			});
    	
    	clockpane1.setOpaque(false);
    	clockpane2.setOpaque(false);
    	clockpane3.setOpaque(false);
    	clockpane4.setOpaque(false);
    	clockpane5.setOpaque(false);
    	clockpane6.setOpaque(false);
    	
    	stud.setBackground(green1);
    	Admin.setBackground(green1);
    	
    	fmain.add(headerL);
    	fmain.add(lb1);
    	fmain.add(lb2);
    	fmain.add(lb3);
    	fmain.add(stud);
    	fmain.add(Admin);
    	fmain.add(tour);
    	fmain.add(clockpane);
    	
    	
    	//--------------------------------------------endOfMainFrame------------------------------------------//
    	
    	//--------------------------------------------------TermsandCondition-------------------------------------------//
    	
    		String tc ="                    		                                                                                                       "+
    				" 1)   I N T R O D U C T I O N                                                                                 "+
    				"                                                                 "+
    				"                                                                                                          "+
    				"                                                                 "+
    				"These Website Standard Terms And Conditions (these “Terms” or these “Website Standard Terms And Conditions”) contained herein on this webpage, shall govern your use of this website, including all pages within this website (collectively referred to herein below as this “Website”). These Terms apply in full force and effect to your use of this Website and by using this Website, you expressly accept all terms and conditions contained herein in full. You must not use this Website, if you have any objection to any of these Website Standard Terms And Conditions."+
    				"This Website is not for use by any minors (defined as those who are not at least 18 years of age), and you must not use this Website if you a minor."+
    				"                    		                                                                                                       					"+
    				" 2)  Intellectual Property Rights                                                                                "+
    				"                                                                 "+
    				"                                                                                                          "+
    				"                                                           "+
    				"Other than content you own, which you may have opted to include on this Website, under these Terms, [Sender.Company] and/or its licensors own all rights to the intellectual property and material contained in this Website, and all such rights are reserved. "+
    				"You are granted a limited license only, subject to the restrictions provided in these Terms, for purposes of viewing the material contained on this Website"+"                                                                       		        			   "+
    				"                                                              		"+
    				" 3)   Restrictions                                                                                               "+
    				"                                                                 "+
    				"                                                                                                              "+
    				"                                                              "+
    				"You are expressly and emphatically restricted from all of the following: "+"                                                            "+
    				"*publishing any Website material in any media; *selling, sublicensing and/or otherwise commercializing any Website material; *publicly performing and/or showing any Website material; *using this Website in any way that is, or may be, damaging to this Website; *using this Website in any way that impacts user access to this Website;";
    	
    	yestc.setOpaque(false);
    	notc.setOpaque(false);
    	tcArea.setBackground(whiteSmoke);
    	tcBack.setBounds(290,550,80,30);
   		tcNext.setBounds(380,550,80,30);
   		//tcCan.setBounds(470,550,80,30);
   		yestc.setBounds(50,515,100,30);
   		notc.setBounds(50,545,100,30);
   		title.setBounds(225,5,200,50);
    	tcArea.setBounds(20,50,550,450);
    	tcArea.setText(tc);
    	tcArea.setBorder(BorderFactory.createEtchedBorder());
    	tcArea.setEditable(false);
    	tcArea.setWrapStyleWord(true);
    	tcArea.setLineWrap(true);
    	
    	try{
   			terms.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\greenBackground.jpg")))));
   			}
   		catch(IOException e){
   			e.printStackTrace();
   			}
	  
    	terms.add(tcArea);
    	terms.add(title);
    	terms.add(notc);
    	terms.add(yestc);
    	terms.add(tcBack);
    	terms.add(tcNext);
//    	terms.add(tcCan);
    	
    	//termsfunction
    	yestc.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			yestc.setSelected(true);
    			notc.setSelected(false);	
    		}
    	});
    	notc.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			notc.setSelected(true);
    			yestc.setSelected(false);	
    		}
    	});
    	
    	
    	tcNext.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			if(yestc.isSelected()){
    				terms.setVisible(false);
    				adm.setVisible(true);
    			}
    			else if(notc.isSelected()){
    				JOptionPane.showMessageDialog(null,"read the terms and conditions");
    			}
    			else{
    				JOptionPane.showMessageDialog(null,"please select");
    			}	
    		}
    	});
    	tcBack.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			terms.setVisible(false);
    			fmain.setVisible(true);	
    		}
    	});
    	
    	tcBack.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F1){
   					tcBack.doClick();
   				}
   			}
   		});
   		tcNext.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F2){
   					tcNext.doClick();
   				}
   			}
   		});
    	
    	
    	
    	//--------------------------------------------------endOfTermsandCondition--------------------------------------//
    	
    	//---------------------------------------------------FillUpForm----------------------------------------------------//
    	logoFil.setBounds(10,10,120,105);
    	fil1.setBounds(140,20,200,30);
    	fil2.setBounds(140,40,200,30);
    	fil3.setBounds(140,60,200,30);
    	fil4.setBounds(140,80,200,30);
    	fil5.setBounds(20,110,230,30);
    	fil6.setBounds(20,150,200,30);
    	c1.setBounds(20,180,60,30);
    	cb1.setBounds(90,180,100,30);
    	c2.setBounds(200,180,60,30);
    	cb2.setBounds(270,180,100,30);
    	c3.setBounds(380,180,60,30);
    	cb3.setBounds(450,180,100,30);
    	lref.setBounds(20,230,180,30);
    	lrn.setBounds(190,230,150,30);
    	nsem1.setBounds(550,265,90,30);
    	nsem2.setBounds(580,265,150,30);
    	strand.setBounds(20,265,150,30);
    	yerlb.setBounds(260,265,150,30);
    	cbyr.setBounds(340,265,140,30);
    	cstrand.setBounds(130,265,110,30);
    	Lname.setBounds(20,300,90,30);
    	ln.setBounds(90,300,150,30);
    	Fname.setBounds(260,300,90,30);
    	fn.setBounds(330,300,150,30);
    	Mname.setBounds(500,300,90,30);
    	mn.setBounds(580,300,150,30);
    	addr.setBounds(20,335,130,30);
    	peradd.setBounds(140,335,590,30);
    	cellnum.setBounds(20,370,90,30);
    	mobilenum.setBounds(90,370,130,30);
    	em.setBounds(250,370,90,30);
    	email.setBounds(340,370,150,30);
    	gen.setBounds(20,410,50,30);
    	sex.setBounds(60,410,70,30);
    	age.setBounds(150,410,60,30);
    	AGE.setBounds(180,410,60,30);
    	bday.setBounds(260,410,90,30);
    	mon.setBounds(340,410,80,30);
    	day.setBounds(425,410,40,30);
		yr.setBounds(470,410,60,30);
    	reli.setBounds(550,410,100,30);
    	religion.setBounds(605,410,125,30);
    	nat.setBounds(20,450,100,30);
    	nationality.setBounds(90,450,130,30);
    	cv.setBounds(250,450,100,30);
    	civil.setBounds(330,450,100,30);
    	fam.setBounds(20,490,200,30);
    	dad.setBounds(20,520,70,30);
    	papa.setBounds(70,520,220,30);
    	cnum1.setBounds(310,520,90,30);
    	cn1.setBounds(390,520,90,30);
    	work1.setBounds(500,520,90,30);
    	w1.setBounds(580,520,150,30);
    	mom.setBounds(20,560,70,30);
    	mama.setBounds(70,560,220,30);
    	cnum2.setBounds(310,560,90,30);
    	cn2.setBounds(390,560,90,30);
    	work2.setBounds(500,560,90,30);
    	w2.setBounds(580,560,150,30);
    	guard.setBounds(20,600,70,30);
    	bantay.setBounds(80,600,210,30);
    	cnum3.setBounds(310,600,90,30);
    	cn3.setBounds(390,600,90,30);
    	work3.setBounds(500,600,90,30);
    	w3.setBounds(580,600,150,30);
    	educ.setBounds(800,150,300,30);
    	nschl.setBounds(950,180,100,30);
    	sy.setBounds(1150,180,100,30);
    	elem.setBounds(800,210,100,30);
    	schl1.setBounds(880,210,230,30);
    	yr1.setBounds(1140,210,110,30);
    	secon.setBounds(800,250,100,30);
    	schl2.setBounds(880,250,230,30);
    	yr2.setBounds(1140,250,110,30);
    	voc.setBounds(800,290,100,30);
    	schl3.setBounds(880,290,230,30);
    	yr3.setBounds(1140,290,110,30);
    	col.setBounds(800,330,100,30);
    	schl4.setBounds(880,330,230,30);
    	yr4.setBounds(1140,330,110,30);
    	bck.setBounds(1000,600,110,30);
    	nnext.setBounds(1150,600,100,30);
    	r.setBounds(800,370,450,210);
    	r.setBorder(BorderFactory.createEtchedBorder());
    	req.setBounds(20,10,100,30);
    	f138.setBounds(70,40,100,30);
    	f137.setBounds(230,40,100,30);
    	nso.setBounds(70,80,100,30);
    	dip.setBounds(70,120,100,30);
    	gMoral.setBounds(230,80,100,30);
    	
    	r.add(req);
    	r.add(f137);
    	r.add(f138);
    	r.add(nso);
    	r.add(gMoral);
    	r.add(dip);
    	
    	nnext.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			adm.setVisible(false);
    			exam.setVisible(true);
    		}
    	});
    	nnext.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F2){
   					nnext.doClick();
   				}
   			}
   		});
    	bck.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			adm.setVisible(false);
    			fmain.setVisible(true);
    		}
    	});
    	bck.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F1){
   					bck.doClick();
   				}
   			}
   		});
    	
    	r.setLayout(null);
    	
    	try{
   			adm.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\greenBackground1.jpg")))));
   			}
   		catch(IOException e){
   			e.printStackTrace();
   			}
   			
   		ln.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a1=e.getKeyChar();
   				if(Character.isDigit(a1)){
   					e.consume();
   				}
   			}
   		});
   		fn.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a2=e.getKeyChar();
   				if(Character.isDigit(a2)){
   					e.consume();
   				}
   			}
   		});
   		mn.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a3=e.getKeyChar();
   				if(Character.isDigit(a3)){
   					e.consume();
   				}
   			}
   		});
   		lrn.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a4=e.getKeyChar();
   				if(Character.isLetter(a4)){
   					e.consume();
   				}
   			}
   		});
   		mobilenum.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a5=e.getKeyChar();
   				if(Character.isLetter(a5)){
   					e.consume();
   				}
   			}
   		});
   		mama.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a7=e.getKeyChar();
   				if(Character.isDigit(a7)){
   					e.consume();
   				}
   			}
   		});
   		papa.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a7=e.getKeyChar();
   				if(Character.isDigit(a7)){
   					e.consume();
   				}
   			}
   		});
   		bantay.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a8=e.getKeyChar();
   				if(Character.isDigit(a8)){
   					e.consume();
   				}
   			}
   		});
   		w1.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a8=e.getKeyChar();
   				if(Character.isDigit(a8)){
   					e.consume();
   				}
   			}
   		});
   		w2.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a9=e.getKeyChar();
   				if(Character.isDigit(a9)){
   					e.consume();
   				}
   			}
   		});
   		w3.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a10=e.getKeyChar();
   				if(Character.isDigit(a10)){
   					e.consume();
   				}
   			}
   		});
   		religion.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a11=e.getKeyChar();
   				if(Character.isDigit(a11)){
   					e.consume();
   				}
   			}
   		});
   		nationality.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a12=e.getKeyChar();
   				if(Character.isDigit(a12)){
   					e.consume();
   				}
   			}
   		});
   		cn1.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a14=e.getKeyChar();
   				if(Character.isLetter(a14)){
   					e.consume();
   				}
   			}
   		});
   		cn2.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a15=e.getKeyChar();
   				if(Character.isLetter(a15)){
   					e.consume();
   				}
   			}
   		});
   		cn3.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a16=e.getKeyChar();
   				if(Character.isLetter(a16)){
   					e.consume();
   				}
   			}
   		});
   		AGE.addKeyListener(new KeyAdapter(){
   			public void keyTyped(KeyEvent e){
   				char a17=e.getKeyChar();
   				if(Character.isLetter(a17)){
   					e.consume();
   				}
   			}
   		});
   
   	
   			
   			
    	adm.add(logoFil);
    	adm.add(ln);
    	adm.add(fil1);
    	adm.add(fil2);
    	adm.add(fil3);
    	adm.add(fil4);
    	adm.add(fil5);
    	adm.add(fil6);
    	adm.add(c1);
    	adm.add(cb1);
    	adm.add(c2);
    	adm.add(cb2);
    	adm.add(c3);
    	adm.add(cb3);
    	adm.add(lref);
    	adm.add(lrn);
    	adm.add(strand);
    	adm.add(yerlb);
    	adm.add(cbyr);
    	adm.add(cstrand);
    	adm.add(Lname);
    	adm.add(Fname);
    	adm.add(Mname);
    	adm.add(ln);
    	adm.add(fn);
    	adm.add(mn);
    	adm.add(em);
    	adm.add(email);
    	adm.add(addr);
    	adm.add(peradd);
    	adm.add(cellnum);
    	adm.add(mobilenum);
    	adm.add(gen);
    	adm.add(sex);
    	adm.add(bday);
    	adm.add(AGE);
    	adm.add(age);
    	adm.add(reli);
    	adm.add(religion);
    	adm.add(nat);
    	adm.add(nationality);
    	adm.add(cv);
    	adm.add(civil);
    	adm.add(fam);
    	adm.add(mom);
    	adm.add(mama);
    	adm.add(papa);
    	adm.add(dad);
    	adm.add(guard);
    	adm.add(bantay);
    	adm.add(work1);
    	adm.add(work2);
    	adm.add(work3);
    	adm.add(w1);
    	adm.add(w2);
    	adm.add(w3);
    	adm.add(cnum1);
    	adm.add(cn1);
    	adm.add(cnum2);
    	adm.add(cn2);
    	adm.add(cnum3);
    	adm.add(mon);
    	adm.add(day);
    	adm.add(yr);
    	adm.add(cn3);
    	adm.add(educ);
    	adm.add(elem);
    	adm.add(secon);
    	adm.add(voc);
    	adm.add(col);
    	adm.add(nschl);
    	adm.add(sy);
    	adm.add(schl1);
    	adm.add(yr1);
    	adm.add(schl2);
    	adm.add(yr2);
    	adm.add(schl3);
    	adm.add(yr3);
    	adm.add(schl4);
    	adm.add(yr4);
    	adm.add(nnext);
    	adm.add(r);
    	adm.add(bck);
    	adm.add(nsem1);
    	adm.add(nsem2);
    	//---------------------------------------------------endOFFillUpForm------------------------------------------------//
    	
    	//---------------------------------------------------ENTRANCEexam------------------------------------------------//
    	ImageIcon logoC = new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\cvsulogo.png");
    	Color lightGreen = Color.decode("#C1FFC1");
    	Color green = Color.decode("#5BC85B");
    	JLabel cvsuLogo = new JLabel(logoC);
    	JLabel cvsuLogo2 = new JLabel(logoC);
    	JLabel cvsuLogo3 = new JLabel(logoC);
    	JLabel cvsuLogo4 = new JLabel(logoC);
    	JButton subEx = new JButton("Submit");
    	ButtonGroup examG = new ButtonGroup();
    	ButtonGroup examG2 = new ButtonGroup();
    	ButtonGroup examG3 = new ButtonGroup();
    	ButtonGroup examG4 = new ButtonGroup();
    	ButtonGroup examG5 = new ButtonGroup();
    	ButtonGroup examG6 = new ButtonGroup();
    	ButtonGroup examG7 = new ButtonGroup();
    	ButtonGroup examG8 = new ButtonGroup();
    	ButtonGroup examG9 = new ButtonGroup();
    	ButtonGroup examG10 = new ButtonGroup();
    	ButtonGroup examG11 = new ButtonGroup();
    	ButtonGroup examG12 = new ButtonGroup();
    	ButtonGroup examG13 = new ButtonGroup();
    	ButtonGroup examG14 = new ButtonGroup();
    	ButtonGroup examG15 = new ButtonGroup();
    	ButtonGroup examG16 = new ButtonGroup();
    	ButtonGroup examG17 = new ButtonGroup();
    	ButtonGroup examG18 = new ButtonGroup();
    	ButtonGroup examG19 = new ButtonGroup();
    	ButtonGroup examG20 = new ButtonGroup();
    	ButtonGroup examG21 = new ButtonGroup();
    	ButtonGroup examG22 = new ButtonGroup();
    	ButtonGroup examG23 = new ButtonGroup();
    	ButtonGroup examG24 = new ButtonGroup();
    	ButtonGroup examG25 = new ButtonGroup();
    	ButtonGroup examG26 = new ButtonGroup();
    	ButtonGroup examG27 = new ButtonGroup();
    	ButtonGroup examG28 = new ButtonGroup();
    	ButtonGroup examG29 = new ButtonGroup();
    	ButtonGroup examG30 = new ButtonGroup();
    	ButtonGroup examG31 = new ButtonGroup();
    	ButtonGroup examG32 = new ButtonGroup();
    	ButtonGroup examG33 = new ButtonGroup();
    	ButtonGroup examG34 = new ButtonGroup();
    	ButtonGroup examG35 = new ButtonGroup();
    	ButtonGroup examG36 = new ButtonGroup();
    	ButtonGroup examG37 = new ButtonGroup();
    	ButtonGroup examG38 = new ButtonGroup();
    	ButtonGroup examG39 = new ButtonGroup();
    	ButtonGroup examG40 = new ButtonGroup();
    	ButtonGroup examG41 = new ButtonGroup();
    	ButtonGroup examG42 = new ButtonGroup();
    	ButtonGroup examG43 = new ButtonGroup();
    	ButtonGroup examG44 = new ButtonGroup();
    	ButtonGroup examG45 = new ButtonGroup();
    	ButtonGroup examG46 = new ButtonGroup();
    	ButtonGroup examG47 = new ButtonGroup();
    	ButtonGroup examG48 = new ButtonGroup();
    	ButtonGroup examG49 = new ButtonGroup();
    	ButtonGroup examG50 = new ButtonGroup();
    	leftPanel1.setBorder(BorderFactory.createEtchedBorder());
        rightPanel1.setBorder(BorderFactory.createEtchedBorder());
        leftPanel2.setBorder(BorderFactory.createEtchedBorder());
        rightPanel2.setBorder(BorderFactory.createEtchedBorder());
        leftPanel3.setBorder(BorderFactory.createEtchedBorder());
        rightPanel3.setBorder(BorderFactory.createEtchedBorder());
        leftPanel4.setBorder(BorderFactory.createEtchedBorder());
        rightPanel4.setBorder(BorderFactory.createEtchedBorder());
    	
    	
    	//QUESTION #1
		JLabel ques = new JLabel(" 1) I’m 18 and my brother is 20, so he’s _________ me.");
		JPanel ques1_pn = new JPanel();
		JRadioButton q1a = new JRadioButton("a) the oldest of");
		JRadioButton q1b = new JRadioButton("b) older than");
		JRadioButton q1c = new JRadioButton("c) as old as");
		JRadioButton q1d = new JRadioButton("d) oldest than");
		
		//Question #2
		JLabel ques2 = new JLabel(" 2) Carl’s very ________ . He’s never late, and he never forgets to do things.");
		JPanel ques2_pn = new JPanel();
		JRadioButton q2a = new JRadioButton("a) reliable");
		JRadioButton q2b = new JRadioButton("b) patient");
		JRadioButton q2c = new JRadioButton("c) strict");
		JRadioButton q2d = new JRadioButton("d) angry");
		
		//Question #3
		JLabel ques3 = new JLabel(" 3) We stayed in a lovely villa ________ the sea. ");
		JPanel ques3_pn = new JPanel();
		JRadioButton q3a = new JRadioButton("a) it overlooks");
		JRadioButton q3b = new JRadioButton("b) overlooking");
		JRadioButton q3c = new JRadioButton("c) overlooked");
		JRadioButton q3d = new JRadioButton("d) looked");
		
		//Question #4
		JLabel ques4 = new JLabel(" 4) Not until the 1980s ________ for the average person to own a computer. ");
		JPanel ques4_pn = new JPanel();
		JRadioButton q4a = new JRadioButton("a) it was possible");
		JRadioButton q4b = new JRadioButton("b) was it possible");
		JRadioButton q4c = new JRadioButton("c) was possible");
		JRadioButton q4d = new JRadioButton("d) possible");
		
		//Question #5
		JLabel ques5 = new JLabel(" 5) Jan ________ her arm on a hot iron. ");
		JPanel ques5_pn = new JPanel();
		JRadioButton q5a = new JRadioButton("a) broke");
		JRadioButton q5b = new JRadioButton("b) burned");
		JRadioButton q5c = new JRadioButton("c) sprained");
		JRadioButton q5d = new JRadioButton("d) bended");
		
		//Question #6
		JLabel ques6 = new JLabel(" 6) Tomorrow’s a holiday, so we ________ go to work. ");
		JPanel ques6_pn = new JPanel();
		JRadioButton q6a = new JRadioButton("a) have to");
		JRadioButton q6b = new JRadioButton("b) mustn't");
		JRadioButton q6c = new JRadioButton("c) dont have to");
		JRadioButton q6d = new JRadioButton("d) need");
		
		//Question #7
		JLabel ques7 = new JLabel(" 7) I usually ________ swimming at least once a week. ");
		JPanel ques7_pn = new JPanel();
		JRadioButton q7a = new JRadioButton("a) go");
		JRadioButton q7b = new JRadioButton("b) do");
		JRadioButton q7c = new JRadioButton("c) play");
		JRadioButton q7d = new JRadioButton("d) work");
		
		//Question #8
		JLabel ques8 = new JLabel(" 8) My friend Siena ________ to Russia last year.");
		JPanel ques8_pn = new JPanel();
		JRadioButton q8a = new JRadioButton("a) went");
		JRadioButton q8b = new JRadioButton("b) has gone");
		JRadioButton q8c = new JRadioButton("c) has been");
		JRadioButton q8d = new JRadioButton("d) goes");
		
		//Question #9
		JLabel ques9 = new JLabel(" 9) This is ________ area, with a lot of factories and warehouses.");
		JPanel ques9_pn = new JPanel();
		JRadioButton q9a = new JRadioButton("a) an agricultural");
		JRadioButton q9b = new JRadioButton("b) an industrial");
		JRadioButton q9c = new JRadioButton("c) a residential");
		JRadioButton q9d = new JRadioButton("d) a farm");
		
		//Question #10
		JLabel ques10 = new JLabel(" 10) If I ________ well in my exams, I ________ to university. ");
		JPanel ques10_pn = new JPanel();
		JRadioButton q10a = new JRadioButton("a) will do; will go");
		JRadioButton q10b = new JRadioButton("b) will do; go");
		JRadioButton q10c = new JRadioButton("c) do; will go");
		JRadioButton q10d = new JRadioButton("d) did; went");
		
		//Question #11
		JLabel ques11 = new JLabel(" 11) She was so upset that she burst ________ tears.");
		JPanel ques11_pn = new JPanel();
		JRadioButton q11a = new JRadioButton("a) into ");
		JRadioButton q11b = new JRadioButton("b) out");
		JRadioButton q11c = new JRadioButton("c) with ");
		JRadioButton q11d = new JRadioButton("d) onto");
		
		//Question #12
		JLabel ques12 = new JLabel(" 12) Where did you go _________ holiday last year?");
		JPanel ques12_pn = new JPanel();
		JRadioButton q12a = new JRadioButton("a) for ");
		JRadioButton q12b = new JRadioButton("b) on");
		JRadioButton q12c = new JRadioButton("c) to ");
		JRadioButton q12d = new JRadioButton("d) with");
		
		//Question #13
		JLabel ques13 = new JLabel(" 13) Ocean currents _________ play an important part in regulating global climate.");
		JPanel ques13_pn = new JPanel();
		JRadioButton q13a = new JRadioButton("a) are known to ");
		JRadioButton q13b = new JRadioButton("b) thought to");
		JRadioButton q13c = new JRadioButton("c) are believed that they");
		JRadioButton q13d = new JRadioButton("d) believes to be");
		
		//Question #14
		JLabel ques14 = new JLabel(" 14) My cousin _________ getting a job in Bahrain.");
		JPanel ques14_pn = new JPanel();
		JRadioButton q14a = new JRadioButton("a would like");
		JRadioButton q14b = new JRadioButton("b) is planning");
		JRadioButton q14c = new JRadioButton("c) is thinking of");
		JRadioButton q14d = new JRadioButton("d) plans of");
		
		//Question #15
		JLabel ques15 = new JLabel(" 15) I can’t  _________ your hair, because I haven’t got any scissors.");
		JPanel ques15_pn = new JPanel();
		JRadioButton q15a = new JRadioButton("a brush");
		JRadioButton q15b = new JRadioButton("b) cut");
		JRadioButton q15c = new JRadioButton("c) wash");
		JRadioButton q15d = new JRadioButton("d) comb");
		
		//Question #16
		JLabel ques16 = new JLabel(" 16) I wish I _________ have an exam tomorrow!");
		JPanel ques16_pn = new JPanel();
		JRadioButton q16a = new JRadioButton("a)  don’t ");
		JRadioButton q16b = new JRadioButton("b) didn’t");
		JRadioButton q16c = new JRadioButton("c) won’t ");
		JRadioButton q16d = new JRadioButton("d) off");
		
		//Question #17
		JLabel ques17 = new JLabel(" 17) The government plans to _________ taxes on sales of luxury items.");
		JPanel ques17_pn = new JPanel();
		JRadioButton q17a = new JRadioButton("a)  increase");
		JRadioButton q17b = new JRadioButton("b) expand");
		JRadioButton q17c = new JRadioButton("c) go up");
		JRadioButton q17d = new JRadioButton("d) decrease");
		
		//Question #18
		JLabel ques18 = new JLabel(" 18) life in Hongkong was very strange, but now I’m used _________ here.");
		JPanel ques18_pn = new JPanel();
		JRadioButton q18a = new JRadioButton("a) living");
		JRadioButton q18b = new JRadioButton("b) to live");
		JRadioButton q18c = new JRadioButton("c)  to living");
		JRadioButton q18d = new JRadioButton("d) leaving");
		
		//Question #19
		JLabel ques19 = new JLabel(" 19) There _________ milk in the fridge.");
		JPanel ques19_pn = new JPanel();
		JRadioButton q19a = new JRadioButton("a) is some ");
		JRadioButton q19b = new JRadioButton("b) are some");
		JRadioButton q19c = new JRadioButton("c)  is a");
		JRadioButton q19d = new JRadioButton("d) are");
		
		//Question #20
		JLabel ques20 = new JLabel(" 20) Criminals are people who are guilty of _________ the law.");
		JPanel ques20_pn = new JPanel();
		JRadioButton q20a = new JRadioButton("a) breaking");
		JRadioButton q20b = new JRadioButton("b) cheating");
		JRadioButton q20c = new JRadioButton("c) committing");
		JRadioButton q20d = new JRadioButton("d) committed");
		
		//Question #21
		JLabel ques21 = new JLabel(" 21) Why on earth isn’t Josh here yet? _________ for him for over an hour!");
		JPanel ques21_pn = new JPanel();
		JRadioButton q21a = new JRadioButton("a) I’m waiting");
		JRadioButton q21b = new JRadioButton("b) I’ve been waiting");
		JRadioButton q21c = new JRadioButton("c) I’ve waited");
		JRadioButton q21d = new JRadioButton("d) wait");
		
		//Question #22
		JLabel ques22 = new JLabel(" 22) “It’s pouring down, and it’s freezing.”   What are the weather conditions?");
		JPanel ques22_pn = new JPanel();
		JRadioButton q22a = new JRadioButton("a) high winds and snow");
		JRadioButton q22b = new JRadioButton("b) heavy rain and cold temperatures");
		JRadioButton q22c = new JRadioButton("c) thick cloud but quite warm");
		JRadioButton q22d = new JRadioButton("d) warm and cold");
		
		//Question #23
		JLabel ques23 = new JLabel(" 23) _________ feeling OK? You don’t look very well.");
		JPanel ques23_pn = new JPanel();
		JRadioButton q23a = new JRadioButton("a) Do you ");
		JRadioButton q23b = new JRadioButton("b) You are ");
		JRadioButton q23c = new JRadioButton("c) Are you");
		JRadioButton q23d = new JRadioButton("d) you");
		
		//Question #24
		JLabel ques24 = new JLabel(" 24) Daniel’s hair is getting far too long; he should _________ soon.");
		JPanel ques24_pn = new JPanel();
		JRadioButton q24a = new JRadioButton("a) cut it");
		JRadioButton q24b = new JRadioButton("b) have cut it");
		JRadioButton q24c = new JRadioButton("c) have it cut");
		JRadioButton q24d = new JRadioButton("d) cutted");
		
		//QUESTION #25
		JLabel ques25 = new JLabel(" 25) The sum of a number x and seven is ten.");
		JPanel ques25_pn = new JPanel();
		JRadioButton q25a = new JRadioButton("a) x+7=10");
		JRadioButton q25b = new JRadioButton("b) 10+7=x");
		JRadioButton q25c = new JRadioButton("c) x-10=7");
		JRadioButton q25d = new JRadioButton("d) 10-7=x");
		
		//QUESTION #26
		JLabel ques26 = new JLabel(" 26) Four time of a number b is sixty-four.");
		JPanel ques26_pn = new JPanel();
		JRadioButton q26a = new JRadioButton("a) 4b2 = 64");
		JRadioButton q26b = new JRadioButton("b) 4b = 64");
		JRadioButton q26c = new JRadioButton("c) b4 = 46");
		JRadioButton q26d = new JRadioButton("d) 2b4 = 64");
		
		//QUESTION #27
		JLabel ques27 = new JLabel(" 27) The product of twice a number f and number g. ");
		JPanel ques27_pn = new JPanel();
		JRadioButton q27a = new JRadioButton("a) 2fg2");
		JRadioButton q27b = new JRadioButton("b) 2f2g");
		JRadioButton q27c = new JRadioButton("c  2fg");
		JRadioButton q27d = new JRadioButton("d) (fg)(fg)");
		
		//QUESTION #28
		JLabel ques28 = new JLabel(" 28) The sum of two numbers m and n is equal to their product.");
		JPanel ques28_pn = new JPanel();
		JRadioButton q28a = new JRadioButton("a) mn+mn");
		JRadioButton q28b = new JRadioButton("b) m*n=m-n");
		JRadioButton q28c = new JRadioButton("c) m+n=(mn)");
		JRadioButton q28d = new JRadioButton("d) m-n=(mn)");
		
		//QUESTION #29
		JLabel ques29 = new JLabel(" 29) The difference between a number x and two is equal to the product of a number y and six. ");
		JPanel ques29_pn = new JPanel();
		JRadioButton q29a = new JRadioButton("a) (6-x)=2y");
		JRadioButton q29b = new JRadioButton("b) 6*y=x2");
		JRadioButton q29c = new JRadioButton("c) x2=6y");
		JRadioButton q29d = new JRadioButton("d) (x-2)=6y");
		
		//QUESTION #30
		JLabel ques30 = new JLabel(" 30) The age of Maria five years from now is two less than her age last year ");
		JPanel ques30_pn = new JPanel();
		JRadioButton q30a = new JRadioButton("a) m+5=2(m-1)-2");
		JRadioButton q30b = new JRadioButton("b) m-1=2(m+5)-2");
		JRadioButton q30c = new JRadioButton("c) m+2=1(m+5)+2");
		JRadioButton q30d = new JRadioButton("d) m+3=2(m+1)-5");
		
		//QUESTION #31
		JLabel ques31 = new JLabel(" 31) The product of the sum of a number m and three, and n ");
		JPanel ques31_pn = new JPanel();
		JRadioButton q31a = new JRadioButton("a) (m+3)n");
		JRadioButton q31b = new JRadioButton("b) m+n=3");
		JRadioButton q31c = new JRadioButton("c) 3mn");
		JRadioButton q31d = new JRadioButton("d) mn=3");
		
		//QUESTION #32
		JLabel ques32 = new JLabel(" 32) The average of number x,y and z. ");
		JPanel ques32_pn = new JPanel();
		JRadioButton q32a = new JRadioButton("a) xyz/3");
		JRadioButton q32b = new JRadioButton("b) x+y+z/3");
		JRadioButton q32c = new JRadioButton("c) x-y-z/3");
		JRadioButton q32d = new JRadioButton("d) xyz/xyz");
		
		//QUESTION #33
		JLabel ques33 = new JLabel(" 33) A three digit number whose hundreds digit is half the tens digit ");
		JLabel quess33 = new JLabel("and whose tens digit is two more than the units digit. ");
		JPanel ques33_pn = new JPanel();
		JRadioButton q33a = new JRadioButton("a) 10(x)+100(2x)+1(x-2)");
		JRadioButton q33b = new JRadioButton("b) 100(x)+10(2x)+1(2x-2)");
		JRadioButton q33c = new JRadioButton("c) x+20x+2x");
		JRadioButton q33d = new JRadioButton("d) 1(x)+100(3x)+(x-2)");
		
		//QUESTION #34
		JLabel ques34 = new JLabel(" 34) The quotient of the product of the sum and difference of numbers x and y, ");
		JLabel quess34 = new JLabel(" and the difference of z and 5.");
		JPanel ques34_pn = new JPanel();
		JRadioButton q34a = new JRadioButton("a) (x-y)(xy)/z+5");
		JRadioButton q34b = new JRadioButton("b) (xty)(x-y)/z-5");
		JRadioButton q34c = new JRadioButton("c) (x)(y)/z-5");
		JRadioButton q34d = new JRadioButton("d) (xy)(xz)/z+5");

		//QUESTION #35
		JLabel ques35 = new JLabel(" 35) Twelve more than a number. ");
		JPanel ques35_pn = new JPanel();
		JRadioButton q35a = new JRadioButton("a) 12+x");
		JRadioButton q35b = new JRadioButton("b) 12x+1");
		JRadioButton q35c = new JRadioButton("c) 12y+x");
		JRadioButton q35d = new JRadioButton("d) 12+5");
		
		//QUESTION #36
		JLabel ques36 = new JLabel(" 36) eight minus a number. ");
		JPanel ques36_pn = new JPanel();
		JRadioButton q36a = new JRadioButton("a) 8+x");
		JRadioButton q36b = new JRadioButton("b) x=8");
		JRadioButton q36c = new JRadioButton("c) 8-x");
		JRadioButton q36d = new JRadioButton("d) 8-1");
		
		//QUESTION #37
		JLabel ques37 = new JLabel(" 37) An unknown quantity less fourteen.");
		JPanel ques37_pn = new JPanel();
		JRadioButton q37a = new JRadioButton("a) ?+14");
		JRadioButton q37b = new JRadioButton("b) 14/x");
		JRadioButton q37c = new JRadioButton("c) x-14");
		JRadioButton q37d = new JRadioButton("d) 14x");
		
		//QUESTION #38
		JLabel ques38 = new JLabel(" 38) six times a number is fifty-four.");
		JPanel ques38_pn = new JPanel();
		JRadioButton q38a = new JRadioButton("a) 54x=6");
		JRadioButton q38b = new JRadioButton("b) 54*x=6");
		JRadioButton q38c = new JRadioButton("c) 6*number=54");
		JRadioButton q38d = new JRadioButton("d) 6x=54");
		
		//QUESTION #39
		JLabel ques39 = new JLabel(" 39) Twice the sum of x and y.");
		JPanel ques39_pn = new JPanel();
		JRadioButton q39a = new JRadioButton("a) 2x+y");
		JRadioButton q39b = new JRadioButton("b) x+y=2xy");
		JRadioButton q39c = new JRadioButton("c) x*y=2");
		JRadioButton q39d = new JRadioButton("d) x+2y");
		
		//QUESTION #40
		JLabel ques40 = new JLabel(" 40) x diminished by thrice y.");
		JPanel ques40_pn = new JPanel();
		JRadioButton q40a = new JRadioButton("a) 3y-x");
		JRadioButton q40b = new JRadioButton("b) 3x+y");
		JRadioButton q40c = new JRadioButton("c) x-3y");
		JRadioButton q40d = new JRadioButton("d) x*3y");
		
		//QUESTION #41
		JLabel ques41 = new JLabel(" 41) The sum of five times x and two times y.");
		JPanel ques41_pn = new JPanel();
		JRadioButton q41a = new JRadioButton("a) 5x+2y");
		JRadioButton q41b = new JRadioButton("b) 5x+y");
		JRadioButton q41c = new JRadioButton("c) 5x-y");
		JRadioButton q41d = new JRadioButton("d) 5x*2y");
		
		//QUESTION #42
		JLabel ques42 = new JLabel(" 42) Twice z less than the quotient of x and y.");
		JPanel ques42_pn = new JPanel();
		JRadioButton q42a = new JRadioButton("a) x-y/2z");
		JRadioButton q42b = new JRadioButton("b) 2z/x-y");
		JRadioButton q42c = new JRadioButton("c) x-y*2z");
		JRadioButton q42d = new JRadioButton("d) x / y - 2z");
		
		//QUESTION #43
		JLabel ques43 = new JLabel(" 43) The area of ??a rectangle is the product of the length and the width of the triangle.");
		JPanel ques43_pn = new JPanel();
		JRadioButton q43a = new JRadioButton("a) A = w/l");
		JRadioButton q43b = new JRadioButton("b) A = lw");
		JRadioButton q43c = new JRadioButton("c) A = (lw)(lw)");
		JRadioButton q43d = new JRadioButton("d) A = lwh");
		
		//QUESTION #44
		JLabel ques44 = new JLabel(" 44) The perimeter of a rectangle is the sum of twice its length and twice its width.");
		JPanel ques44_pn = new JPanel();
		JRadioButton q44a = new JRadioButton("a) P = 2(2l)+2(2w)");
		JRadioButton q44b = new JRadioButton("b) P = 2l + 2w");
		JRadioButton q44c = new JRadioButton("c) P = 2l2w");
		JRadioButton q44d = new JRadioButton("d) P = 2lw");
		
		//QUESTION #45
		JLabel ques45 = new JLabel(" 45) The sum of two numbers:.");
		JPanel ques45_pn = new JPanel();
		JRadioButton q45a = new JRadioButton("a) xy");
		JRadioButton q45b = new JRadioButton("b) x+y");
		JRadioButton q45c = new JRadioButton("c) num1+num2");
		JRadioButton q45d = new JRadioButton("d) 1+2");
		
		//QUESTION #46
		JLabel ques46 = new JLabel(" 46) Three times the sum of two numbers:");
		JPanel ques46_pn = new JPanel();
		JRadioButton q46a = new JRadioButton("a) 3xy");
		JRadioButton q46b = new JRadioButton("b) 3x+y");
		JRadioButton q46c = new JRadioButton("c) 3(x+y)");
		JRadioButton q46d = new JRadioButton("d) 1+2");
		
		//QUESTION #47
		JLabel ques47 = new JLabel(" 47) A number, less 3: ");
		JPanel ques47_pn = new JPanel();
		JRadioButton q47a = new JRadioButton("a) 3-1");
		JRadioButton q47b = new JRadioButton("b) 3-num1");
		JRadioButton q47c = new JRadioButton("c) x-3");
		JRadioButton q47d = new JRadioButton("d) 3-1");
		
		//QUESTION #48
		JLabel ques48 = new JLabel(" 48) The product of a number and 3: ");
		JPanel ques48_pn = new JPanel();
		JRadioButton q48a = new JRadioButton("a) 3*1");
		JRadioButton q48b = new JRadioButton("b) 3-x");
		JRadioButton q48c = new JRadioButton("c) x-3");
		JRadioButton q48d = new JRadioButton("d) 3x");
		
		//QUESTION #49
		JLabel ques49 = new JLabel(" 49) Five times a number is two more than twice the number: ");
		JPanel ques49_pn = new JPanel();
		JRadioButton q49a = new JRadioButton("a) 5x = 2+2x");
		JRadioButton q49b = new JRadioButton("b) 5x = 2(2x)");
		JRadioButton q49c = new JRadioButton("c) 2(5x)-2x");
		JRadioButton q49d = new JRadioButton("d) 2x+2/5x");
		
		//QUESTION #50
		JLabel ques50 = new JLabel(" 50) An unknown quantity less fourteen. ");
		JPanel ques50_pn = new JPanel();
		JRadioButton q50a = new JRadioButton("a) ?-14");
		JRadioButton q50b = new JRadioButton("b) x-14)");
		JRadioButton q50c = new JRadioButton("c) 1-14");
		JRadioButton q50d = new JRadioButton("d) 14*1");
		
		
		
		backAd.setBounds(1090,600,80,40);
		nextEx.setBounds(1180,600,80,40);
		nextEx2.setBounds(1180,600,80,40);
		backAd2.setBounds(1090,600,80,40);
		leftPanel1.setBounds(10,10,520,650);
		rightPanel1.setBounds(550,10,520,650);
		leftPanel2.setBounds(10,10,520,650);
		rightPanel2.setBounds(550,10,520,650);
		cvsuLogo.setBounds(980,10,400,200);
		cvsuLogo2.setBounds(980,10,400,200);
		cvsuLogo3.setBounds(980,10,400,200);
		cvsuLogo4.setBounds(980,10,400,200);
		dirEx.setBounds(10,10,500,40);
		nextEx3.setBounds(1180,600,80,40);
		backAd3.setBounds(1090,600,80,40);
		//nextEx4.setBounds(1090,600,80,40);
		backAd4.setBounds(1090,600,80,40);
		subEx.setBounds(1180,600,80,40);
		leftPanel3.setBounds(10,10,520,650);
		rightPanel3.setBounds(550,10,520,650);
		leftPanel4.setBounds(10,10,520,650);
		rightPanel4.setBounds(550,10,520,650);
		ques.setBounds(10,40,500,40);
		ques1_pn.setBounds(10,90,450,40);
		ques2.setBounds(10,140,500,40);
		ques2_pn.setBounds(10,190,350,40);
		ques3.setBounds(10,240,500,40);
		ques3_pn.setBounds(10,290,445,40);
		ques4.setBounds(10,340,500,40);
		ques4_pn.setBounds(10,390,500,40);
		ques5.setBounds(10,440,500,40);
		ques5_pn.setBounds(10,490,375,40);
		ques6.setBounds(10,540,500,40);
		ques6_pn.setBounds(10,590,400,40);
		
		ques7.setBounds(10,10,500,40);
		ques7_pn.setBounds(10,45,308,40);
		ques8.setBounds(10,90,500,40);
		ques8_pn.setBounds(10,140,395,40);
		ques9.setBounds(10,190,500,40);
		ques9_pn.setBounds(10,240,500,40);
		ques10.setBounds(10,290,500,40);
		ques10_pn.setBounds(10,340,490,40);
		ques11.setBounds(10,390,500,40);
		ques11_pn.setBounds(10,440,344,40);
		ques12.setBounds(10,490,500,40);
		ques12_pn.setBounds(10,540,331,40);
		
		ques13.setBounds(10,10,500,40);
		ques13_pn.setBounds(5,45,500,90);
		ques14.setBounds(10,125,500,40);
		ques14_pn.setBounds(5,175,500,40);
		ques15.setBounds(10,225,500,40);
		ques15_pn.setBounds(5,275,500,40);
		ques16.setBounds(10,325,500,40);
		ques16_pn.setBounds(5,375,500,40);
		ques17.setBounds(10,425,500,40);
		ques17_pn.setBounds(5,475,500,40);
		ques18.setBounds(10,525,500,40);
		ques18_pn.setBounds(5,575,500,40);
		
		ques19.setBounds(10,10,500,40);
		ques19_pn.setBounds(10,40,500,40);
		ques20.setBounds(10,90,500,40);
		ques20_pn.setBounds(10,140,500,40);
		ques21.setBounds(10,190,500,40);
		ques21_pn.setBounds(10,240,500,40);
		ques22.setBounds(10,290,500,40);
		ques22_pn.setBounds(10,340,500,40);
		ques23.setBounds(10,390,500,40);
		ques23_pn.setBounds(10,440,500,40);
		ques24.setBounds(10,490,500,40);
		ques24_pn.setBounds(10,540,500,40);
		
			dirEx2.setBounds(10,10,500,40);
		ques25.setBounds(10,40,500,40);
		ques25_pn.setBounds(10,90,450,40);
		ques26.setBounds(10,140,500,40);
		ques26_pn.setBounds(10,190,350,40);
		ques27.setBounds(10,240,500,40);
		ques27_pn.setBounds(10,290,445,40);
		ques28.setBounds(10,340,500,40);
		ques28_pn.setBounds(10,390,500,40);
		ques29.setBounds(10,440,500,40);
		ques29_pn.setBounds(10,490,375,40);
		ques30.setBounds(10,540,500,40);
		ques30_pn.setBounds(10,590,400,40);
		
		ques31.setBounds(10,10,500,40);
		ques31_pn.setBounds(10,45,308,40);
		ques32.setBounds(10,90,500,40);
		ques32_pn.setBounds(10,140,395,40);
		ques33.setBounds(10,190,500,40);
		quess33.setBounds(40,210,500,40);
		ques33_pn.setBounds(10,260,500,40);
		ques34.setBounds(10,310,500,40);
		quess34.setBounds(40,330,500,40);
		ques34_pn.setBounds(10,380,490,40);
		ques35.setBounds(10,430,500,40);
		ques35_pn.setBounds(10,480,344,40);
		ques36.setBounds(10,530,500,40);
		ques36_pn.setBounds(10,580,331,40);
		
		ques37.setBounds(10,10,500,40);
		ques37_pn.setBounds(10,50,450,40);
		ques38.setBounds(10,90,500,40);
		ques38_pn.setBounds(10,130,350,40);
		ques39.setBounds(10,170,500,40);
		ques39_pn.setBounds(10,210,445,40);
		ques40.setBounds(10,250,500,40);
		ques40_pn.setBounds(10,290,500,40);
		ques41.setBounds(10,330,500,40);
		ques41_pn.setBounds(10,370,375,40);
		ques42.setBounds(10,410,500,40);
		ques42_pn.setBounds(10,450,400,40);
		ques43.setBounds(10,490,500,40);
		ques43_pn.setBounds(10,530,400,40);
		ques44.setBounds(10,570,500,40);
		ques44_pn.setBounds(10,610,400,40);
		
		ques45.setBounds(10,10,500,40);
		ques45_pn.setBounds(10,50,450,40);
		ques46.setBounds(10,90,500,40);
		ques46_pn.setBounds(10,130,350,40);
		ques47.setBounds(10,170,500,40);
		ques47_pn.setBounds(10,210,445,40);
		ques48.setBounds(10,250,500,40);
		ques48_pn.setBounds(10,290,500,40);
		ques49.setBounds(10,330,500,40);
		ques49_pn.setBounds(10,370,375,40);
		ques50.setBounds(10,410,500,40);
		ques50_pn.setBounds(10,450,400,40);
		
		//Result Frame
		JLabel result = new JLabel("Entrance Exam Result");
		JPanel resP = new JPanel();
		ImageIcon stamp1 = new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\passed.png");
		ImageIcon stamp2 = new ImageIcon("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\failed.png");
		JLabel stampApp = new JLabel(stamp1);
		JLabel stampRej = new JLabel(stamp2);
		JLabel urScore = new JLabel("Your Score: ");
		JLabel scoreNum = new JLabel("_____________");
		JLabel urAve = new JLabel("Average: ");
		JLabel scoreAve = new JLabel("_____________");
		JLabel res = new JLabel("Result: ");
		JLabel resEqui = new JLabel("----PASSED/FAILED----");
		JLabel resCou = new JLabel("Course suitable for your Average:");
		JLabel courseR = new JLabel("1st/2nd/3rd");
		JButton resOk = new JButton("OKAY");
		resP.setBorder(BorderFactory.createEtchedBorder());
		scoreNum.setBorder(BorderFactory.createEtchedBorder());
		scoreAve.setBorder(BorderFactory.createEtchedBorder());
		resEqui.setBorder(BorderFactory.createEtchedBorder());
		courseR.setBorder(BorderFactory.createEtchedBorder());
		
		//RESULT FRAME SETBOUNDS
		result.setBounds(127,10,300,50);
		resP.setBounds(25,60,330,450);
		urScore.setBounds(20,20,100,40);
		scoreNum.setBounds(20,70,100,40);
		urAve.setBounds(20,120,100,40);
		scoreAve.setBounds(20,170,100,40);
		res.setBounds(125,250,100,40);
		resEqui.setBounds(86,285,130,40);
		resCou.setBounds(60,320,200,40);
		courseR.setBounds(100,355,100,40);
		resOk.setBounds(135,530,100,50);
		stampApp.setBounds(127,37,190,173);
		stampRej.setBounds(127,37,190,173);
		
		//bg colors of buttons
		nextEx.setBackground(lightGreen);
		nextEx2.setBackground(lightGreen);
		backAd.setBackground(lightGreen);
		backAd2.setBackground(lightGreen);
		subEx.setBackground(lightGreen);
		
		nextEx.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				exam2.setVisible(true);
				exam.setVisible(false);
				}
			
		});
		nextEx.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F2){
   					nextEx.doClick();
   				}
   			}
   		});
		backAd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				exam.setVisible(false);
				adm.setVisible(true);
				}
			
		});
		backAd.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F1){
   					backAd.doClick();
   				}
   			}
   		});
		backAd2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				exam.setVisible(true);
				exam2.setVisible(false);
				}
			
		});
		backAd2.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F1){
   					backAd2.doClick();
   				}
   			}
   		});
		nextEx2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				exam2.setVisible(false);
				exam3.setVisible(true);
				}
			
		});
		nextEx2.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F2){
   					nextEx2.doClick();
   				}
   			}
   		});
		nextEx3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				exam4.setVisible(true);
				exam3.setVisible(false);
			}
		});
		nextEx3.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F2){
   					nextEx3.doClick();
   				}
   			}
   		});
		
		backAd3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				exam3.setVisible(false);
				exam2.setVisible(true);
			}
		});
		backAd3.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F1){
   					backAd3.doClick();
   				}
   			}
   		});
		/*nextEx4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				exam4.setVisible(true);
				exam3.setVisible(false);
			}
		});*/
		
		backAd4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				exam4.setVisible(false);
				exam3.setVisible(true);
			}
		});
		backAd4.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F1){
   					backAd4.doClick();
   				}
   			}
   		});
		resOk.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				resultF.setVisible(false);
				fmain.setVisible(true);
				}
			
		});
		resOk.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_ENTER){
   					resOk.doClick();
   				}
   			}
   		});
		
		subEx.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double pts, pts2, pts3, pts4, pts5, pts6, pts7, pts8, pts9, pts10, pts11, pts12 = 0;
				double pts13, pts14, pts15, pts16, pts17, pts18, pts19, pts20, pts21, pts22, pts23, pts24 = 0;
				double pts25=0, pts26, pts27, pts28, pts29, pts30, pts31, pts32, pts33, pts34, pts35, pts36, pts37, pts38, pts39, pts40 = 0;
				double pts41, pts42, pts43, pts44, pts45, pts46, pts47, pts48, pts49, pts50 = 0;
				double grandtotal =0;
				double totalPts, totalPts2, totalPts3, totalPts4 = 0; 
				double mean;
				double mean2;
				
				if(q1a.isSelected()){
					pts = 0;
				}
				else if(q1b.isSelected()){
					pts = 1;
				}
				else if(q1c.isSelected()){
					pts = 0;
				}
				else{
					pts = 0;
				}
				
				if(q2a.isSelected()){
					pts2 = 1;
				}
				else if(q2b.isSelected()){
					pts2 = 0;
				}
				else if(q2c.isSelected()){
					pts2 = 0;
				}
				else{
					pts2 = 0;
				}
				
				if(q3a.isSelected()){
					pts3 = 0;
				}
				else if(q3b.isSelected()){
					pts3 = 0;
				}
				else if(q3c.isSelected()){
					pts3 = 1;
				}
				else{
					pts3 = 0;
				}
				
				if(q4a.isSelected()){
					pts4 = 0;
				}
				else if(q4b.isSelected()){
					pts4 = 1;
				}
				else if(q4c.isSelected()){
					pts4 = 0;
				}
				else{
					pts4 = 0;
				}
				
				if(q5a.isSelected()){
					pts5 = 0;
				}
				else if(q5b.isSelected()){
					pts5 = 1;
				}
				else if(q5c.isSelected()){
					pts5 = 0;
				}
				else{
					pts5 = 0;
				}
				
				if(q6a.isSelected()){
					pts6 = 0;
				}
				else if(q6b.isSelected()){
					pts6 = 0;
				}
				else if(q6c.isSelected()){
					pts6 = 1;
				}
				else{
					pts6 = 0;
				}
				
				if(q7a.isSelected()){
					pts7 = 1;
				}
				else if(q7b.isSelected()){
					pts7 = 0;
				}
				else if(q7c.isSelected()){
					pts7 = 0;
				}
				else{
					pts7 = 0;
				}
				
				if(q8a.isSelected()){
					pts8 = 1;
				}
				else if(q8b.isSelected()){
					pts8 = 0;
				}
				else if(q8c.isSelected()){
					pts8 = 0;
				}
				else{
					pts8 = 0;
				}
				
				if(q9a.isSelected()){
					pts9 = 0;
				}
				else if(q9b.isSelected()){
					pts9 = 1;
				}
				else if(q9c.isSelected()){
					pts9 = 0;
				}
				else{
					pts9 = 0;
				}
				
				if(q10a.isSelected()){
					pts10 = 0;
				}
				else if(q10b.isSelected()){
					pts10 = 0;
				}
				else if(q10c.isSelected()){
					pts10 = 1;
				}
				else{
					pts10 = 0;
				}
				
				if(q11a.isSelected()){
					pts11 = 1;
				}
				else if(q11b.isSelected()){
					pts11 = 0;
				}
				else if(q11c.isSelected()){
					pts11 = 0;
				}
				else{
					pts11 = 0;
				}
				
				if(q12a.isSelected()){
					pts12 = 0;
				}
				else if(q12b.isSelected()){
					pts12 = 1;
				}
				else if(q12c.isSelected()){
					pts12 = 0;
				}
				else{
					pts12 = 0;
				}
				
				if(q13a.isSelected()){
					pts13 = 1;
				}
				else if(q13b.isSelected()){
					pts13 = 0;
				}
				else if(q13c.isSelected()){
					pts13 = 0;
				}
				else{
					pts13 = 0;
				}
				
				if(q14a.isSelected()){
					pts14 = 0;
				}
				else if(q14b.isSelected()){
					pts14 = 0;
				}
				else if(q14c.isSelected()){
					pts14 = 1;
				}
				else{
					pts14 = 0;
				}
				
				if(q15a.isSelected()){
					pts15 = 0;
				}
				else if(q15b.isSelected()){
					pts15 = 1;
				}
				else if(q15c.isSelected()){
					pts15 = 0;
				}
				else{
					pts15 = 0;
				}
				
				if(q16a.isSelected()){
					pts16 = 0;
				}
				else if(q16b.isSelected()){
					pts16 = 1;
				}
				else if(q16c.isSelected()){
					pts16 = 0;
				}
				else{
					pts16 = 0;
				}
				
				if(q17a.isSelected()){
					pts17 = 1;
				}
				else if(q17b.isSelected()){
					pts17 = 0;
				}
				else if(q17c.isSelected()){
					pts17 = 0;
				}
				else{
					pts17 = 0;
				}
				
				if(q18a.isSelected()){
					pts18 = 0;
				}
				else if(q18b.isSelected()){
					pts18 = 0;
				}
				else if(q18c.isSelected()){
					pts18 = 1;
				}
				else{
					pts18 = 0;
				}
				
				if(q19a.isSelected()){
					pts19 = 1;
				}
				else if(q19b.isSelected()){
					pts19 = 0;
				}
				else if(q19c.isSelected()){
					pts19 = 0;
				}
				else{
					pts19 = 0;
				}
				
				if(q20a.isSelected()){
					pts20 = 1;
				}
				else if(q20b.isSelected()){
					pts20 = 0;
				}
				else if(q20c.isSelected()){
					pts20 = 0;
				}
				else{
					pts20 = 0;
				}
				
				if(q21a.isSelected()){
					pts21 = 0;
				}
				else if(q21b.isSelected()){
					pts21 = 1;
				}
				else if(q21c.isSelected()){
					pts21 = 0;
				}
				else{
					pts21 = 0;
				}
				
				if(q22a.isSelected()){
					pts22 = 0;
				}
				else if(q22b.isSelected()){
					pts22 = 1;
				}
				else if(q22c.isSelected()){
					pts22 = 0;
				}
				else{
					pts22 = 0;
				}
				
				if(q23a.isSelected()){
					pts23 = 0;
				}
				else if(q23b.isSelected()){
					pts23 = 0;
				}
				else if(q23c.isSelected()){
					pts23 = 1;
				}
				else{
					pts23 = 0;
				}
				
				if(q24a.isSelected()){
					pts24 = 0;
				}
				else if(q24b.isSelected()){
					pts24 = 0;
				}
				else if(q24c.isSelected()){
					pts24 = 1;
				}
				else{
					pts24 = 0;
				}
				
				if(q25a.isSelected()){
					pts25 = 1;
				}
				else if(q25b.isSelected()){
					pts24 = 0;
				}
				else if(q25c.isSelected()){
					pts25 = 0;
				}
				else{
					pts25 = 0;
				}
				
				if(q26a.isSelected()){
					pts26 = 0;
				}
				else if(q26b.isSelected()){
					pts26 = 1;
				}
				else if(q26c.isSelected()){
					pts26 = 0;
				}
				else{
					pts26 = 0;
				}
				
				if(q27a.isSelected()){
					pts27 = 0;
				}
				else if(q25b.isSelected()){
					pts27 = 0;
				}
				else if(q27c.isSelected()){
					pts27 = 1;
				}
				else{
					pts27 = 0;
				}
				
				if(q28a.isSelected()){
					pts28 = 0;
				}
				else if(q28b.isSelected()){
					pts28 = 0;
				}
				else if(q28c.isSelected()){
					pts28 = 1;
				}
				else{
					pts28 = 0;
				}
				
				if(q29a.isSelected()){
					pts29 = 0;
				}
				else if(q29b.isSelected()){
					pts29 = 0;
				}
				else if(q29c.isSelected()){
					pts29 = 0;
				}
				else if(q29d.isSelected()){
					pts29 = 1;
				}
				else{
					pts29=0;
					}
				
				if(q30a.isSelected()){
					pts30 = 1;
				}
				else if(q30b.isSelected()){
					pts30 = 0;
				}
				else if(q30c.isSelected()){
					pts30 = 0;
				}
				else{
					pts30 = 0;
				}
				
				if(q31a.isSelected()){
					pts31 = 1;
				}
				else if(q31b.isSelected()){
					pts31 = 0;
				}
				else if(q31c.isSelected()){
					pts31 = 0;
				}
				else{
					pts31 = 0;
				}
				
				if(q32a.isSelected()){
					pts32 = 0;
				}
				else if(q32b.isSelected()){
					pts32 = 1;
				}
				else if(q32c.isSelected()){
					pts32 = 0;
				}
				else{
					pts32 = 0;
				}
				
				if(q33a.isSelected()){
					pts33 = 0;
				}
				else if(q33b.isSelected()){
					pts33 = 1;
				}
				else if(q33c.isSelected()){
					pts33 = 0;
				}
				else{
					pts33 = 0;
				}
				
				if(q34a.isSelected()){
					pts34 = 0;
				}
				else if(q34b.isSelected()){
					pts34 = 1;
				}
				else if(q34c.isSelected()){
					pts34 = 0;
				}
				else{
					pts34 = 0;
				}
				
				if(q35a.isSelected()){
					pts35 = 1;
				}
				else if(q35b.isSelected()){
					pts35 = 0;
				}
				else if(q35c.isSelected()){
					pts35 = 0;
				}
				else{
					pts35 = 0;
				}
				
				if(q36a.isSelected()){
					pts36 = 0;
				}
				else if(q36b.isSelected()){
					pts36 = 0;
				}
				else if(q36c.isSelected()){
					pts36 = 1;
				}
				else{
					pts36 = 0;
				}
				
				if(q37a.isSelected()){
					pts37 = 0;
				}
				else if(q37b.isSelected()){
					pts37 = 0;
				}
				else if(q37c.isSelected()){
					pts37= 1;
				}
				else{
					pts37 = 0;
				}
				
				if(q38a.isSelected()){
					pts38 = 1;
				}
				else if(q38b.isSelected()){
					pts38 = 0;
				}
				else if(q37c.isSelected()){
					pts38= 0;
				}
				else{
					pts38 = 0;
				}
				
				if(q39a.isSelected()){
					pts39 = 1;
				}
				else if(q39b.isSelected()){
					pts39 = 0;
				}
				else if(q39c.isSelected()){
					pts39= 0;
				}
				else{
					pts39 = 0;
				}
				
				if(q40a.isSelected()){
					pts40 = 0;
				}
				else if(q40b.isSelected()){
					pts40 = 0;
				}
				else if(q40c.isSelected()){
					pts40= 1;
				}
				else{
					pts40 = 0;
				}
				
				if(q41a.isSelected()){
					pts41 = 1;
				}
				else if(q41b.isSelected()){
					pts41 = 0;
				}
				else if(q41c.isSelected()){
					pts41= 0;
				}
				else{
					pts41 = 0;
				}
				
				if(q42a.isSelected()){
					pts42 = 0;
				}
				else if(q42b.isSelected()){
					pts42 = 0;
				}
				else if(q42c.isSelected()){
					pts42= 0;
				}
				else if(q42d.isSelected()){
					pts42 = 1;
				}
				else{
					pts42=0;
					}
				
				if(q43a.isSelected()){
					pts43 = 0;
				}
				else if(q43b.isSelected()){
					pts43 = 1;
				}
				else if(q43c.isSelected()){
					pts43= 0;
				}
				else{
					pts43 = 0;
				}
				
				if(q44a.isSelected()){
					pts44 = 0;
				}
				else if(q44b.isSelected()){
					pts44 = 1;
				}
				else if(q44c.isSelected()){
					pts44= 0;
				}
				else{
					pts44 = 0;
				}
				
				if(q45a.isSelected()){
					pts45 = 0;
				}
				else if(q45b.isSelected()){
					pts45 = 1;
				}
				else if(q45c.isSelected()){
					pts45= 0;
				}
				else{
					pts45 = 0;
				}
				
				if(q46a.isSelected()){
					pts46 = 0;
				}
				else if(q46b.isSelected()){
					pts46 = 0;
				}
				else if(q46c.isSelected()){
					pts46= 1;
				}
				else{
					pts46 = 0;
				}
				
				if(q47a.isSelected()){
					pts47 = 0;
				}
				else if(q47b.isSelected()){
					pts47 = 0;
				}
				else if(q47c.isSelected()){
					pts47= 1;
				}
				else{
					pts47 = 0;
				}
				
				if(q48a.isSelected()){
					pts48 = 0;
				}
				else if(q48b.isSelected()){
					pts48 = 0;
				}
				else if(q48c.isSelected()){
					pts48= 0;
				}
				else if(q48d.isSelected()){
					pts48 = 1;
				}
				else{
					pts48 = 0;
				}
				
				if(q49a.isSelected()){
					pts49 = 1;
				}
				else if(q49b.isSelected()){
					pts49 = 0;
				}
				else if(q49c.isSelected()){
					pts49= 0;
				}
				else{
					pts49 = 0;
				}
				
				if(q50a.isSelected()){
					pts50 = 0;
				}
				else if(q50b.isSelected()){
					pts50 = 0;
				}
				else if(q50c.isSelected()){
					pts50= 1;
				}
				else{
					pts50 = 0;
				}
				
				totalPts = pts+pts2+pts3+pts4+pts5+pts6+pts7+pts8+pts9+pts10+pts11+pts12;
				totalPts2 = pts13+pts14+pts15+pts16+pts17+pts18+pts19+pts20+pts21+pts22+pts23+pts24;
				totalPts3 = pts25+pts26+pts27+pts28+pts29+pts30+pts31+pts32+pts33+pts34+pts35+pts36;
				totalPts4 = pts37+pts38+pts39+pts40+pts41+pts42+pts43+pts44+pts45+pts46+pts47+pts48+pts49+pts50;
				
				grandtotal = totalPts + totalPts2 + totalPts3 + totalPts4;
				mean = grandtotal/50;
				mean2 = mean*100;
				
				
				if(mean2<=100&&mean2>=85){
					resEqui.setText("-------PASSED-------");
					String x1 = cb1.getSelectedItem().toString();
					courseR.setText(x1);
					stampApp.setVisible(true);
					stampRej.setVisible(false);
					//formsubmit
				String sstat="Not Enrolled";
    			String sfn=fn.getText();
    			String sln=ln.getText();
    			String smn=mn.getText();
    			String sgen=sex.getSelectedItem().toString();
    			String ssem=nsem2.getSelectedItem().toString();
    			String scbyr=cbyr.getSelectedItem().toString();
    			String scb1=cb1.getSelectedItem().toString();
    			String scivil=civil.getSelectedItem().toString();
    			String scstrand=cstrand.getSelectedItem().toString();
    			String slrn=lrn.getText();
    			String speradd=peradd.getText();
    			String smobilenum=mobilenum.getText();
    			String semail=email.getText();
    			String sAGE=AGE.getText();
    			String sreligion=religion.getText();
    			String snationality=nationality.getText();
    			String spapa=papa.getText();
    			String smama=mama.getText();
    			String sbantay=bantay.getText();
    			String sw1=w1.getText();
  				String sw2=w2.getText();
    			String sw3=w3.getText();
    			String scn1=cn1.getText();
    			String scn2=cn2.getText();
    			String scn3=cn3.getText();
    			String sschl1=schl1.getText();
    			String syr1=yr1.getText();
    			String sschl2=schl2.getText();
    			String syr2=yr2.getText();
    			String sschl3=schl3.getText();
    			String syr3=yr3.getText();
    			String sschl4=schl4.getText();
    			String syr4=yr4.getText();
    			String req1,req2,req3,req4,req5;
    			String smon=mon.getSelectedItem().toString();
    			String sdy=day.getSelectedItem().toString();
    			String syear=yr.getSelectedItem().toString();
    			String bday1=smon+" "+sdy+","+syear;
				if(f138.isSelected()){
					req1="Complete";
				}
				else{
					req1="Inc";
				}
				if(f137.isSelected()){
					req2="Complete";
				}
				else{
					req2="Inc";
				}
				if(nso.isSelected()){
					req3="Complete";
				}
				else{
					req3="Inc";
				}
				if(dip.isSelected()){
					req4="Complete";
				}
				else{
					req4="Inc";
				}
				if(gMoral.isSelected()){
					req5="Complete";
				}
				else{
					req5="Inc";
				}
				
    			
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="insert into enroll (Status,LastName, FirstName, MidName, Sex, Course, Sem, SchoolYear, Age,Birthday, LRN, Address, MobileNum, Email, SHSStrand, Religion, Nationality, CivilStatus, FatherName, FatherOccu, ContactNumber,MotherName, MotherOccu, ContactNum,GuardianName, GuardianOccu, ConNum, ElemSchool, ElemYrGrad, SeconSchool, SecYrGrad, VocSchool, VocYrGrad, ColSchool, ColYrGrad,Form138,Form137,NSO,Diploma, GdMoral) values ('"+sstat+"','"+sln+"','"+sfn+"','"+smn+"','"+sgen+"','"+scb1+"','"+ssem+"','"+scbyr+"','"+sAGE+"','"+bday1+"','"+slrn+"','"+speradd+"','"+smobilenum+"','"+semail+"','"+scstrand+"','"+sreligion+"','"+snationality+"','"+scivil+"','"+spapa+"','"+sw1+"','"+scn1+"','"+smama+"','"+sw2+"','"+scn2+"','"+sbantay+"','"+sw3+"','"+scn3+"','"+sschl1+"','"+syr1+"','"+sschl2+"','"+syr2+"','"+sschl3+"','"+syr3+"','"+sschl4+"','"+syr4+"','"+req1+"','"+req2+"','"+req3+"','"+req4+"','"+req5+"')";
    				Statement st = con.createStatement();
    				int upd = st.executeUpdate(squery);
    				
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="select Status, StudentID, LastName, FirstName, MidName, Sex, Course, Sem, SchoolYear, Age from enroll where LastName='"+sln+"' and FirstName='"+sfn+"'";
					Statement st = con.createStatement();
    				ResultSet rs = st.executeQuery(squery);
    				
    				while(rs.next()){
    					String aStat=rs.getString("Status");
    					String aStudId=rs.getString("StudentID");
    					String aLn=rs.getString("LastName");
    					String aFn=rs.getString("FirstName");
    					String aMn=rs.getString("MidName");
    					String aSex=rs.getString("Sex");
    					String aCourse=rs.getString("Course");
    					String aSem=rs.getString("Sem");
    					String aSY=rs.getString("SchoolYear");
    					String aAge=rs.getString("Age");
    					
    					String addnew[]={aStat,aStudId,aLn,aFn,aMn,aSex,aCourse,aSem,aSY,aAge};
    					model.addRow(addnew);
    				}
    				JOptionPane.showMessageDialog(null, "Data add successfully!");
    				
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			
    		ln.setText("");
    		fn.setText("");
    		mn.setText("");
    		lrn.setText("");
    		peradd.setText("");
    		mobilenum.setText("");
    		email.setText("");
    		AGE.setText("");
    		religion.setText("");
    		nationality.setText("");
    		papa.setText("");
    		mama.setText("");
    		bantay.setText("");
    		w1.setText("");
  			w2.setText("");
    		w3.setText("");
    		cn1.setText("");
    		cn2.setText("");
    		cn3.setText("");
    		schl1.setText("");
    		yr1.setText("");
    		schl2.setText("");
    		yr2.setText("");
    		schl3.setText("");
    		yr3.setText("");
    		schl4.setText("");
    		yr4.setText("");
    		
				}
				else if(mean2<=84&&mean2>=75){
					resEqui.setText("-------PASSED-------");
					String x1 = cb2.getSelectedItem().toString();
					courseR.setText(x1);
					stampApp.setVisible(true);
					stampRej.setVisible(false);
					//formsubmit
					String sstat="Not Enrolled";
    			String sfn=fn.getText();
    			String sln=ln.getText();
    			String smn=mn.getText();
    			String sgen=sex.getSelectedItem().toString();
    			String ssem=nsem2.getSelectedItem().toString();
    			String scbyr=cbyr.getSelectedItem().toString();
    			String scb1=cb1.getSelectedItem().toString();
    			String scivil=civil.getSelectedItem().toString();
    			String scstrand=cstrand.getSelectedItem().toString();
    			String slrn=lrn.getText();
    			String speradd=peradd.getText();
    			String smobilenum=mobilenum.getText();
    			String semail=email.getText();
    			String sAGE=AGE.getText();
    			String sreligion=religion.getText();
    			String snationality=nationality.getText();
    			String spapa=papa.getText();
    			String smama=mama.getText();
    			String sbantay=bantay.getText();
    			String sw1=w1.getText();
  				String sw2=w2.getText();
    			String sw3=w3.getText();
    			String scn1=cn1.getText();
    			String scn2=cn2.getText();
    			String scn3=cn3.getText();
    			String sschl1=schl1.getText();
    			String syr1=yr1.getText();
    			String sschl2=schl2.getText();
    			String syr2=yr2.getText();
    			String sschl3=schl3.getText();
    			String syr3=yr3.getText();
    			String sschl4=schl4.getText();
    			String syr4=yr4.getText();
    			String req1,req2,req3,req4,req5;
    			String smon=mon.getSelectedItem().toString();
    			String sdy=day.getSelectedItem().toString();
    			String syear=yr.getSelectedItem().toString();
    			String bday1=smon+" "+sdy+","+syear;
				if(f138.isSelected()){
					req1="Complete";
				}
				else{
					req1="Inc";
				}
				if(f137.isSelected()){
					req2="Complete";
				}
				else{
					req2="Inc";
				}
				if(nso.isSelected()){
					req3="Complete";
				}
				else{
					req3="Inc";
				}
				if(dip.isSelected()){
					req4="Complete";
				}
				else{
					req4="Inc";
				}
				if(gMoral.isSelected()){
					req5="Complete";
				}
				else{
					req5="Inc";
				}
				
    			
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="insert into enroll (Status,LastName, FirstName, MidName, Sex, Course, Sem, SchoolYear, Age,Birthday, LRN, Address, MobileNum, Email, SHSStrand, Religion, Nationality, CivilStatus, FatherName, FatherOccu, ContactNumber,MotherName, MotherOccu, ContactNum,GuardianName, GuardianOccu, ConNum, ElemSchool, ElemYrGrad, SeconSchool, SecYrGrad, VocSchool, VocYrGrad, ColSchool, ColYrGrad,Form138,Form137,NSO,Diploma, GdMoral) values ('"+sstat+"','"+sln+"','"+sfn+"','"+smn+"','"+sgen+"','"+scb1+"','"+ssem+"','"+scbyr+"','"+sAGE+"','"+bday1+"','"+slrn+"','"+speradd+"','"+smobilenum+"','"+semail+"','"+scstrand+"','"+sreligion+"','"+snationality+"','"+scivil+"','"+spapa+"','"+sw1+"','"+scn1+"','"+smama+"','"+sw2+"','"+scn2+"','"+sbantay+"','"+sw3+"','"+scn3+"','"+sschl1+"','"+syr1+"','"+sschl2+"','"+syr2+"','"+sschl3+"','"+syr3+"','"+sschl4+"','"+syr4+"','"+req1+"','"+req2+"','"+req3+"','"+req4+"','"+req5+"')";
    				Statement st = con.createStatement();
    				int upd = st.executeUpdate(squery);
    				
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="select Status, StudentID, LastName, FirstName, MidName, Sex, Course, Sem, SchoolYear, Age from enroll where LastName='"+sln+"' and FirstName='"+sfn+"'";
					Statement st = con.createStatement();
    				ResultSet rs = st.executeQuery(squery);
    				
    				while(rs.next()){
    					String aStat=rs.getString("Status");
    					String aStudId=rs.getString("StudentID");
    					String aLn=rs.getString("LastName");
    					String aFn=rs.getString("FirstName");
    					String aMn=rs.getString("MidName");
    					String aSex=rs.getString("Sex");
    					String aCourse=rs.getString("Course");
    					String aSem=rs.getString("Sem");
    					String aSY=rs.getString("SchoolYear");
    					String aAge=rs.getString("Age");
    					
    					String addnew[]={aStat,aStudId,aLn,aFn,aMn,aSex,aCourse,aSem,aSY,aAge};
    					model.addRow(addnew);
    				}
    				JOptionPane.showMessageDialog(null, "Data add successfully!");
    				
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			
    		ln.setText("");
    		fn.setText("");
    		mn.setText("");
    		lrn.setText("");
    		peradd.setText("");
    		mobilenum.setText("");
    		email.setText("");
    		AGE.setText("");
    		religion.setText("");
    		nationality.setText("");
    		papa.setText("");
    		mama.setText("");
    		bantay.setText("");
    		w1.setText("");
  			w2.setText("");
    		w3.setText("");
    		cn1.setText("");
    		cn2.setText("");
    		cn3.setText("");
    		schl1.setText("");
    		yr1.setText("");
    		schl2.setText("");
    		yr2.setText("");
    		schl3.setText("");
    		yr3.setText("");
    		schl4.setText("");
    		yr4.setText("");
    		
				}
				else if(mean2<=74&&mean2>=50){
					resEqui.setText("-------PASSED-------");
					String x1 = cb3.getSelectedItem().toString();
					courseR.setText(x1);
					stampApp.setVisible(true);
					stampRej.setVisible(false);
					
				//formsubmit
				String sstat="Not Enrolled";
    			String sfn=fn.getText();
    			String sln=ln.getText();
    			String smn=mn.getText();
    			String sgen=sex.getSelectedItem().toString();
    			String ssem=nsem2.getSelectedItem().toString();
    			String scbyr=cbyr.getSelectedItem().toString();
    			String scb1=cb1.getSelectedItem().toString();
    			String scivil=civil.getSelectedItem().toString();
    			String scstrand=cstrand.getSelectedItem().toString();
    			String slrn=lrn.getText();
    			String speradd=peradd.getText();
    			String smobilenum=mobilenum.getText();
    			String semail=email.getText();
    			String sAGE=AGE.getText();
    			String sreligion=religion.getText();
    			String snationality=nationality.getText();
    			String spapa=papa.getText();
    			String smama=mama.getText();
    			String sbantay=bantay.getText();
    			String sw1=w1.getText();
  				String sw2=w2.getText();
    			String sw3=w3.getText();
    			String scn1=cn1.getText();
    			String scn2=cn2.getText();
    			String scn3=cn3.getText();
    			String sschl1=schl1.getText();
    			String syr1=yr1.getText();
    			String sschl2=schl2.getText();
    			String syr2=yr2.getText();
    			String sschl3=schl3.getText();
    			String syr3=yr3.getText();
    			String sschl4=schl4.getText();
    			String syr4=yr4.getText();
    			String req1,req2,req3,req4,req5;
    			String smon=mon.getSelectedItem().toString();
    			String sdy=day.getSelectedItem().toString();
    			String syear=yr.getSelectedItem().toString();
    			String bday1=smon+" "+sdy+","+syear;
				if(f138.isSelected()){
					req1="Complete";
				}
				else{
					req1="Inc";
				}
				if(f137.isSelected()){
					req2="Complete";
				}
				else{
					req2="Inc";
				}
				if(nso.isSelected()){
					req3="Complete";
				}
				else{
					req3="Inc";
				}
				if(dip.isSelected()){
					req4="Complete";
				}
				else{
					req4="Inc";
				}
				if(gMoral.isSelected()){
					req5="Complete";
				}
				else{
					req5="Inc";
				}
				
    			
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="insert into enroll (Status,LastName, FirstName, MidName, Sex, Course, Sem, SchoolYear, Age,Birthday, LRN, Address, MobileNum, Email, SHSStrand, Religion, Nationality, CivilStatus, FatherName, FatherOccu, ContactNumber,MotherName, MotherOccu, ContactNum,GuardianName, GuardianOccu, ConNum, ElemSchool, ElemYrGrad, SeconSchool, SecYrGrad, VocSchool, VocYrGrad, ColSchool, ColYrGrad,Form138,Form137,NSO,Diploma, GdMoral) values ('"+sstat+"','"+sln+"','"+sfn+"','"+smn+"','"+sgen+"','"+scb1+"','"+ssem+"','"+scbyr+"','"+sAGE+"','"+bday1+"','"+slrn+"','"+speradd+"','"+smobilenum+"','"+semail+"','"+scstrand+"','"+sreligion+"','"+snationality+"','"+scivil+"','"+spapa+"','"+sw1+"','"+scn1+"','"+smama+"','"+sw2+"','"+scn2+"','"+sbantay+"','"+sw3+"','"+scn3+"','"+sschl1+"','"+syr1+"','"+sschl2+"','"+syr2+"','"+sschl3+"','"+syr3+"','"+sschl4+"','"+syr4+"','"+req1+"','"+req2+"','"+req3+"','"+req4+"','"+req5+"')";
    				Statement st = con.createStatement();
    				int upd = st.executeUpdate(squery);
    				
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="select Status, StudentID, LastName, FirstName, MidName, Sex, Course, Sem, SchoolYear, Age from enroll where LastName='"+sln+"' and FirstName='"+sfn+"'";
					Statement st = con.createStatement();
    				ResultSet rs = st.executeQuery(squery);
    				
    				while(rs.next()){
    					String aStat=rs.getString("Status");
    					String aStudId=rs.getString("StudentID");
    					String aLn=rs.getString("LastName");
    					String aFn=rs.getString("FirstName");
    					String aMn=rs.getString("MidName");
    					String aSex=rs.getString("Sex");
    					String aCourse=rs.getString("Course");
    					String aSem=rs.getString("Sem");
    					String aSY=rs.getString("SchoolYear");
    					String aAge=rs.getString("Age");
    					
    					String addnew[]={aStat,aStudId,aLn,aFn,aMn,aSex,aCourse,aSem,aSY,aAge};
    					model.addRow(addnew);
    				}
    				JOptionPane.showMessageDialog(null, "Data add successfully!");
    				
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			
    		ln.setText("");
    		fn.setText("");
    		mn.setText("");
    		lrn.setText("");
    		peradd.setText("");
    		mobilenum.setText("");
    		email.setText("");
    		AGE.setText("");
    		religion.setText("");
    		nationality.setText("");
    		papa.setText("");
    		mama.setText("");
    		bantay.setText("");
    		w1.setText("");
  			w2.setText("");
    		w3.setText("");
    		cn1.setText("");
    		cn2.setText("");
    		cn3.setText("");
    		schl1.setText("");
    		yr1.setText("");
    		schl2.setText("");
    		yr2.setText("");
    		schl3.setText("");
    		yr3.setText("");
    		schl4.setText("");
    		yr4.setText("");
    		
				}
				else{
					resEqui.setText("-------FAILED-------");
					courseR.setText("Not Qualified");
					stampApp.setVisible(false);
					stampRej.setVisible(true);
					
				}
				scoreNum.setText(String.valueOf(grandtotal));
				scoreAve.setText(String.valueOf(mean2));
				
				int subPane = JOptionPane.showConfirmDialog(null,"Are you sure you want to submit your exam?","Confirm",JOptionPane.YES_NO_OPTION);
					if(subPane==0){
						resultF.setVisible(true);
						exam4.setVisible(false);
					}
					else{
						exam4.setVisible(true);
						resultF.setVisible(false);
					}
		
		
				
			}
		});
		subEx.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F10){
   					subEx.doClick();
   				}
   			}
   		});
   		
		
		
		
		
        
        //ques1 panel
        ques1_pn.add(q1a);
        ques1_pn.add(q1b);
        ques1_pn.add(q1c);
        ques1_pn.add(q1d);
        examG.add(q1a);
        examG.add(q1b);
        examG.add(q1c);
        examG.add(q1d);
        //ques2 panel
        ques2_pn.add(q2a);
        ques2_pn.add(q2b);
        ques2_pn.add(q2c);
        ques2_pn.add(q2d);
        examG2.add(q2a);
        examG2.add(q2b);
        examG2.add(q2c);
        examG2.add(q2d);
        //ques3 panel
        ques3_pn.add(q3a);
        ques3_pn.add(q3b);
        ques3_pn.add(q3c);
        ques3_pn.add(q3d);
        examG3.add(q3a);
        examG3.add(q3b);
        examG3.add(q3c);
        examG3.add(q3d);
        //ques4 panel
        ques4_pn.add(q4a);
        ques4_pn.add(q4b);
        ques4_pn.add(q4c);
        ques4_pn.add(q4d);
        examG4.add(q4a);
        examG4.add(q4b);
        examG4.add(q4c);
        examG4.add(q4d);
        //ques5 panel
        ques5_pn.add(q5a);
        ques5_pn.add(q5b);
        ques5_pn.add(q5c);
        ques5_pn.add(q5d);
        examG5.add(q5a);
        examG5.add(q5b);
        examG5.add(q5c);
        examG5.add(q5d);
        //ques6 panel
        ques6_pn.add(q6a);
        ques6_pn.add(q6b);
        ques6_pn.add(q6c);
        ques6_pn.add(q6d);
        examG6.add(q6a);
        examG6.add(q6b);
        examG6.add(q6c);
        examG6.add(q6d);
        //ques7 panel
        ques7_pn.add(q7a);
        ques7_pn.add(q7b);
        ques7_pn.add(q7c);
        ques7_pn.add(q7d);
        examG7.add(q7a);
        examG7.add(q7b);
        examG7.add(q7c);
        examG7.add(q7d);
        //ques8 panel
        ques8_pn.add(q8a);
        ques8_pn.add(q8b);
        ques8_pn.add(q8c);
        ques8_pn.add(q8d);
        examG8.add(q8a);
        examG8.add(q8b);
        examG8.add(q8c);
        examG8.add(q8d);
         //ques9 panel
        ques9_pn.add(q9a);
        ques9_pn.add(q9b);
        ques9_pn.add(q9c);
        ques9_pn.add(q9d);
        examG9.add(q9a);
        examG9.add(q9b);
        examG9.add(q9c);
        examG9.add(q9d);
        //ques10 panel
        ques10_pn.add(q10a);
        ques10_pn.add(q10b);
        ques10_pn.add(q10c);
        ques10_pn.add(q10d);
        examG10.add(q10a);
        examG10.add(q10b);
        examG10.add(q10c);
        examG10.add(q10d);
        //ques11 panel
        ques11_pn.add(q11a);
        ques11_pn.add(q11b);
        ques11_pn.add(q11c);
        ques11_pn.add(q11d);
        examG11.add(q11a);
        examG11.add(q11b);
        examG11.add(q11c);
        examG11.add(q11d);
        //ques12 panel
        ques12_pn.add(q12a);
        ques12_pn.add(q12b);
        ques12_pn.add(q12c);
        ques12_pn.add(q12d);
        examG12.add(q12a);
        examG12.add(q12b);
        examG12.add(q12c);
        examG12.add(q12d);
        //ques13 panel
        ques13_pn.add(q13a);
        ques13_pn.add(q13b);
        ques13_pn.add(q13c);
        ques13_pn.add(q13d);
        examG13.add(q13a);
        examG13.add(q13b);
        examG13.add(q13c);
        examG13.add(q13d);
        //ques14 panel
        ques14_pn.add(q14a);
        ques14_pn.add(q14b);
        ques14_pn.add(q14c);
        ques14_pn.add(q14d);
        examG14.add(q14a);
        examG14.add(q14b);
        examG14.add(q14c);
        examG14.add(q14d);
        //ques15 panel
        ques15_pn.add(q15a);
        ques15_pn.add(q15b);
        ques15_pn.add(q15c);
        ques15_pn.add(q15d);
        examG15.add(q15a);
        examG15.add(q15b);
        examG15.add(q15c);
        examG15.add(q15d);
        //ques16 panel
        ques16_pn.add(q16a);
        ques16_pn.add(q16b);
        ques16_pn.add(q16c);
        ques16_pn.add(q16d);
        examG16.add(q16a);
        examG16.add(q16b);
        examG16.add(q16c);
        examG16.add(q16d);
        //ques17 panel
        ques17_pn.add(q17a);
        ques17_pn.add(q17b);
        ques17_pn.add(q17c);
        ques17_pn.add(q17d);
        examG17.add(q17a);
        examG17.add(q17b);
        examG17.add(q17c);
        examG17.add(q17d);
        //ques18 panel
        ques18_pn.add(q18a);
        ques18_pn.add(q18b);
        ques18_pn.add(q18c);
        ques18_pn.add(q18d);
        examG18.add(q18a);
        examG18.add(q18b);
        examG18.add(q18c);
        examG18.add(q18d);
        //ques19 panel
        ques19_pn.add(q19a);
        ques19_pn.add(q19b);
        ques19_pn.add(q19c);
        ques19_pn.add(q19d);
        examG19.add(q19a);
        examG19.add(q19b);
        examG19.add(q19c);
        examG19.add(q19d);
        //ques20 panel
        ques20_pn.add(q20a);
        ques20_pn.add(q20b);
        ques20_pn.add(q20c);
        ques20_pn.add(q20d);
        examG20.add(q20a);
        examG20.add(q20b);
        examG20.add(q20c);
        examG20.add(q20d);
        //ques21 panel
        ques21_pn.add(q21a);
        ques21_pn.add(q21b);
        ques21_pn.add(q21c);
        ques21_pn.add(q21d);
        examG21.add(q21a);
        examG21.add(q21b);
        examG21.add(q21c);
        examG21.add(q21d);
        //ques22panel
        ques22_pn.add(q22a);
        ques22_pn.add(q22b);
        ques22_pn.add(q22c);
        ques22_pn.add(q22d);
        examG22.add(q22a);
        examG22.add(q22b);
        examG22.add(q22c);
        examG22.add(q22d);
        //ques23pane
        ques23_pn.add(q23a);
        ques23_pn.add(q23b);
        ques23_pn.add(q23c);
        ques23_pn.add(q23d);
        examG23.add(q23a);
        examG23.add(q23b);
        examG23.add(q23c);
        examG23.add(q23d);
        //ques24panel
        ques24_pn.add(q24a);
        ques24_pn.add(q24b);
        ques24_pn.add(q24c);
        ques24_pn.add(q24d);
        examG24.add(q24a);
        examG24.add(q24b);
        examG24.add(q24c);
        examG24.add(q24d);
        
        
        
       	
       	leftPanel1.add(dirEx);
        //panels and questions
        leftPanel1.add(ques);
        leftPanel1.add(ques1_pn);
        leftPanel1.add(ques2);
        leftPanel1.add(ques2_pn);
        leftPanel1.add(ques3);
        leftPanel1.add(ques3_pn);
        leftPanel1.add(ques4);
        leftPanel1.add(ques4_pn);
        leftPanel1.add(ques5);
        leftPanel1.add(ques5_pn);
        leftPanel1.add(ques6);
        leftPanel1.add(ques6_pn);
        rightPanel1.add(ques7);
        rightPanel1.add(ques7_pn);
        rightPanel1.add(ques8);
        rightPanel1.add(ques8_pn);
        rightPanel1.add(ques9);
        rightPanel1.add(ques9_pn);
        rightPanel1.add(ques10);
        rightPanel1.add(ques10_pn);
        rightPanel1.add(ques11);
        rightPanel1.add(ques11_pn);
        rightPanel1.add(ques12);
        rightPanel1.add(ques12_pn);
        //2nd page panels & ques
        leftPanel2.add(ques13);
        leftPanel2.add(ques13_pn);
        leftPanel2.add(ques14);
        leftPanel2.add(ques14_pn);
        leftPanel2.add(ques15);
        leftPanel2.add(ques15_pn);
        leftPanel2.add(ques16);
        leftPanel2.add(ques16_pn);
        leftPanel2.add(ques17);
        leftPanel2.add(ques17_pn);
        leftPanel2.add(ques18);
        leftPanel2.add(ques18_pn);
        rightPanel2.add(ques19);
        rightPanel2.add(ques19_pn);
        rightPanel2.add(ques20);
        rightPanel2.add(ques20_pn);
        rightPanel2.add(ques21);
        rightPanel2.add(ques21_pn);
        rightPanel2.add(ques22);
        rightPanel2.add(ques22_pn);
        rightPanel2.add(ques23);
        rightPanel2.add(ques23_pn);
        rightPanel2.add(ques24);
        rightPanel2.add(ques24_pn);
        
        		//ques25 panel
        ques25_pn.add(q25a);
        ques25_pn.add(q25b);
        ques25_pn.add(q25c);
        ques25_pn.add(q25d);
        examG25.add(q25a);
        examG25.add(q25b);
        examG25.add(q25c);
        examG25.add(q25d);
        
        //ques26 panel
        ques26_pn.add(q26a);
        ques26_pn.add(q26b);
        ques26_pn.add(q26c);
        ques26_pn.add(q26d);
        examG26.add(q26a);
        examG26.add(q26b);
        examG26.add(q26c);
        examG26.add(q26d);
        
        //ques27 panel
        ques27_pn.add(q27a);
        ques27_pn.add(q27b);
        ques27_pn.add(q27c);
        ques27_pn.add(q27d);
        examG27.add(q27a);
        examG27.add(q27b);
        examG27.add(q27c);
        examG27.add(q27d);
        
        //ques28 panel
        ques28_pn.add(q28a);
        ques28_pn.add(q28b);
        ques28_pn.add(q28c);
        ques28_pn.add(q28d);
        examG28.add(q28a);
        examG28.add(q28b);
        examG28.add(q28c);
        examG28.add(q28d);
        
        //ques29 panel
        ques29_pn.add(q29a);
        ques29_pn.add(q29b);
        ques29_pn.add(q29c);
        ques29_pn.add(q29d);
        examG29.add(q29a);
        examG29.add(q29b);
        examG29.add(q29c);
        examG29.add(q29d);
        
        //ques30 panel
        ques30_pn.add(q30a);
        ques30_pn.add(q30b);
        ques30_pn.add(q30c);
        ques30_pn.add(q30d);
        examG30.add(q30a);
        examG30.add(q30b);
        examG30.add(q30c);
        examG30.add(q30d);
        
        //ques31 panel
        ques31_pn.add(q31a);
        ques31_pn.add(q31b);
        ques31_pn.add(q31c);
        ques31_pn.add(q31d);
        examG31.add(q31a);
        examG31.add(q31b);
        examG31.add(q31c);
        examG31.add(q31d);
        
        //ques32 panel
        ques32_pn.add(q32a);
        ques32_pn.add(q32b);
        ques32_pn.add(q32c);
        ques32_pn.add(q32d);
        examG32.add(q32a);
        examG32.add(q32b);
        examG32.add(q32c);
        examG32.add(q32d);
        
        //ques33 panel
        ques33_pn.add(q33a);
        ques33_pn.add(q33b);
        ques33_pn.add(q33c);
        ques33_pn.add(q33d);
        examG33.add(q33a);
        examG33.add(q33b);
        examG33.add(q33c);
        examG33.add(q33d);
        
        //ques34 panel
        ques34_pn.add(q34a);
        ques34_pn.add(q34b);
        ques34_pn.add(q34c);
        ques34_pn.add(q34d);
        examG34.add(q34a);
        examG34.add(q34b);
        examG34.add(q34c);
        examG34.add(q34d);
        
        //ques35 panel
        ques35_pn.add(q35a);
        ques35_pn.add(q35b);
        ques35_pn.add(q35c);
        ques35_pn.add(q35d);
        examG35.add(q35a);
        examG35.add(q35b);
        examG35.add(q35c);
        examG35.add(q35d);
        
        //ques36 panel
        ques36_pn.add(q36a);
        ques36_pn.add(q36b);
        ques36_pn.add(q36c);
        ques36_pn.add(q36d);
        examG36.add(q36a);
        examG36.add(q36b);
        examG36.add(q36c);
        examG36.add(q36d);
        
        //ques37 panel
        ques37_pn.add(q37a);
        ques37_pn.add(q37b);
        ques37_pn.add(q37c);
        ques37_pn.add(q37d);
        examG37.add(q37a);
        examG37.add(q37b);
        examG37.add(q37c);
        examG37.add(q37d);
        
        //ques38 panel
        ques38_pn.add(q38a);
        ques38_pn.add(q38b);
        ques38_pn.add(q38c);
        ques38_pn.add(q38d);
        examG38.add(q38a);
        examG38.add(q38b);
        examG38.add(q38c);
        examG38.add(q38d);
        
        //ques39 panel
        ques39_pn.add(q39a);
        ques39_pn.add(q39b);
        ques39_pn.add(q39c);
        ques39_pn.add(q39d);
        examG39.add(q39a);
        examG39.add(q39b);
        examG39.add(q39c);
        examG39.add(q39d);
        
        //ques40 panel
        ques40_pn.add(q40a);
        ques40_pn.add(q40b);
        ques40_pn.add(q40c);
        ques40_pn.add(q40d);
        examG40.add(q40a);
        examG40.add(q40b);
        examG40.add(q40c);
        examG40.add(q40d);
        
        //ques41 panel
        ques41_pn.add(q41a);
        ques41_pn.add(q41b);
        ques41_pn.add(q41c);
        ques41_pn.add(q41d);
        examG41.add(q41a);
        examG41.add(q41b);
        examG41.add(q41c);
        examG41.add(q41d);
        
        //ques42 panel
        ques42_pn.add(q42a);
        ques42_pn.add(q42b);
        ques42_pn.add(q42c);
        ques42_pn.add(q42d);
        examG42.add(q42a);
        examG42.add(q42b);
        examG42.add(q42c);
        examG42.add(q42d);
        
        //ques43 panel
        ques43_pn.add(q43a);
        ques43_pn.add(q43b);
        ques43_pn.add(q43c);
        ques43_pn.add(q43d);
        examG43.add(q43a);
        examG43.add(q43b);
        examG43.add(q43c);
        examG43.add(q43d);
        
        //ques44 panel
        ques44_pn.add(q44a);
        ques44_pn.add(q44b);
        ques44_pn.add(q44c);
        ques44_pn.add(q44d);
        examG44.add(q44a);
        examG44.add(q44b);
        examG44.add(q44c);
        examG44.add(q44d);
        
        //ques45 panel
        ques45_pn.add(q45a);
        ques45_pn.add(q45b);
        ques45_pn.add(q45c);
        ques45_pn.add(q45d);
        examG45.add(q45a);
        examG45.add(q45b);
        examG45.add(q45c);
        examG45.add(q45d);
        
        //ques46 panel
        ques46_pn.add(q46a);
        ques46_pn.add(q46b);
        ques46_pn.add(q46c);
        ques46_pn.add(q46d);
        examG46.add(q46a);
        examG46.add(q46b);
        examG46.add(q46c);
        examG46.add(q46d);
        
        //ques47 panel
        ques47_pn.add(q47a);
        ques47_pn.add(q47b);
        ques47_pn.add(q47c);
        ques47_pn.add(q47d);
        examG47.add(q47a);
        examG47.add(q47b);
        examG47.add(q47c);
        examG47.add(q47d);
        
        //ques48 panel
        ques48_pn.add(q48a);
        ques48_pn.add(q48b);
        ques48_pn.add(q48c);
        ques48_pn.add(q48d);
        examG48.add(q48a);
        examG48.add(q48b);
        examG48.add(q48c);
        examG48.add(q48d);
        
        //ques49 panel
        ques49_pn.add(q49a);
        ques49_pn.add(q49b);
        ques49_pn.add(q49c);
        ques49_pn.add(q49d);
        examG49.add(q49a);
        examG49.add(q49b);
        examG49.add(q49c);
        examG49.add(q49d);
        
        //ques50 panel
        ques50_pn.add(q50a);
        ques50_pn.add(q50b);
        ques50_pn.add(q50c);
        ques50_pn.add(q50d);
        examG50.add(q50a);
        examG50.add(q50b);
        examG50.add(q50c);
        examG50.add(q50d);
        
        leftPanel3.add(dirEx2);
        leftPanel3.add(ques25);
        leftPanel3.add(ques25_pn);
        leftPanel3.add(ques26);
        leftPanel3.add(ques26_pn);
        leftPanel3.add(ques27);
        leftPanel3.add(ques27_pn);
        leftPanel3.add(ques28);
        leftPanel3.add(ques28_pn);
        leftPanel3.add(ques29);
        leftPanel3.add(ques29_pn);
        leftPanel3.add(ques30);
        leftPanel3.add(ques30_pn);
        rightPanel3.add(ques31);
        rightPanel3.add(ques31_pn);
        rightPanel3.add(ques32);
        rightPanel3.add(ques32_pn);
        rightPanel3.add(ques33);
        rightPanel3.add(quess33);
        rightPanel3.add(ques33_pn);
        rightPanel3.add(ques34);
        rightPanel3.add(quess34);
        rightPanel3.add(ques34_pn);
        rightPanel3.add(ques35);
        rightPanel3.add(ques35_pn);
        rightPanel3.add(ques36);
        rightPanel3.add(ques36_pn);
        
        leftPanel4.add(ques37);
        leftPanel4.add(ques37_pn);
        leftPanel4.add(ques38);
        leftPanel4.add(ques38_pn);
        leftPanel4.add(ques39);
        leftPanel4.add(ques39_pn);
        leftPanel4.add(ques40);
        leftPanel4.add(ques40_pn);
        leftPanel4.add(ques41);
        leftPanel4.add(ques41_pn);
        leftPanel4.add(ques42);
        leftPanel4.add(ques42_pn);
        leftPanel4.add(ques43);
        leftPanel4.add(ques43_pn);
        leftPanel4.add(ques44);
        leftPanel4.add(ques44_pn);
        
        rightPanel4.add(ques45);
        rightPanel4.add(ques45_pn);
        rightPanel4.add(ques46);
        rightPanel4.add(ques46_pn);
        rightPanel4.add(ques47);
        rightPanel4.add(ques47_pn);
        rightPanel4.add(ques48);
        rightPanel4.add(ques48_pn);
        rightPanel4.add(ques49);
        rightPanel4.add(ques49_pn);
        rightPanel4.add(ques50);
        rightPanel4.add(ques50_pn);
        
        leftPanel3.setLayout(null);
      	rightPanel3.setLayout(null);
      	leftPanel4.setLayout(null);
      	rightPanel4.setLayout(null);
        
      	leftPanel1.setLayout(null);
      	rightPanel1.setLayout(null);
      	
      	leftPanel2.setLayout(null);
      	rightPanel2.setLayout(null);
      	
      	try{
   			exam.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\greenBackground1.jpg")))));
   			}
   		catch(IOException e){
   			e.printStackTrace();
   			}
   			
   		try{
   			exam2.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\greenBackground1.jpg")))));
   			}
   		catch(IOException e){
   			e.printStackTrace();
   			}
   			
   		try{
   			exam3.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\greenBackground1.jpg")))));
   			}
   		catch(IOException e){
   			e.printStackTrace();
   			}
   		try{
   			exam4.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\greenBackground1.jpg")))));
   			}
   		catch(IOException e){
   			e.printStackTrace();
   			}
   			
   		try{
   			resultF.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\greenBackground1.jpg")))));
   			}
   		catch(IOException e){
   			e.printStackTrace();
   			}
      	
      	//Result panel
      	resP.setLayout(null);
		resP.add(urScore);
		resP.add(scoreNum);
		resP.add(urAve);
		resP.add(scoreAve);
		resP.add(res);
		resP.add(resEqui);
		resP.add(resCou);
		resP.add(courseR);
		resP.add(stampApp);
		resP.add(stampRej);
		
		exam.add(clockpane1);
    	exam2.add(clockpane2);
    	exam3.add(clockpane3);
    	exam4.add(clockpane4);
          
        exam.add(backAd);
       	exam.add(nextEx);
       	exam.add(cvsuLogo); 		
       	exam.add(leftPanel1);
       	exam.add(rightPanel1); 
    	exam.setBounds(10,10,1300,700);
    	exam.setLayout(null);
    	
    	exam2.add(backAd2);
       	exam2.add(nextEx2); 
       	exam2.add(cvsuLogo2);
    	exam2.add(leftPanel2);
       	exam2.add(rightPanel2);
    	exam2.setBounds(10,10,1300,700);
    	exam2.setLayout(null);
    	
    	exam3.add(leftPanel3);
      	exam3.add(rightPanel3);
      	exam3.add(nextEx3);
      	exam3.add(backAd3);
      	exam3.add(cvsuLogo3);
      	exam3.setBounds(10,10,1300,700);
      	exam3.setLayout(null);
      	//exam3.setVisible(true);
      	
      	exam4.add(leftPanel4);
      	exam4.add(rightPanel4);
      	exam4.add(cvsuLogo4);
      	exam4.add(subEx);
      	exam4.add(backAd4);
      	exam4.setBounds(10,10,1300,700);
      	exam4.setLayout(null);
    	
    	resultF.add(result);
    	resultF.add(resP);
    	resultF.add(resOk);
    	resultF.setBounds(500,30,400,650);
    	resultF.setLayout(null);
    	//---------------------------------------------------endOFentranceExam------------------------------------------------//
    	
    	//--------------------------------------------------------LOGINForm-------------------------------------------------//
    	
    	ad.setFont(new Font("Grotesque", Font.BOLD, 20));
    	
    	logp.setBounds(450,90,400,400);
    	ad.setBounds(20,20,250,30);
    	uuser.setBounds(80,90,40,40);
    	ppass.setBounds(80,150,40,40);
    	user.setBounds(120,90,200,40);
    	pass.setBounds(120,150,200,40);
    	log.setBounds(160,250,100,30);
    	cancel.setBounds(160,290,100,30);
    	logp.setBorder(BorderFactory.createEtchedBorder());
    	uuser.setBorder(BorderFactory.createEtchedBorder());
    	ppass.setBorder(BorderFactory.createEtchedBorder());
    	
    	try{
   			login.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\greenBackground1.jpg")))));
   			}
   		catch(IOException e){
   			e.printStackTrace();
   			}
   			
   		logp.setOpaque(false);
    	
    	logp.add(ad);
    	logp.add(uuser);
    	logp.add(ppass);
    	logp.add(user);
    	logp.add(pass);
    	logp.add(log);
    	logp.add(cancel);
    	login.add(clockpane5);
    	
    	logp.setLayout(null);
    	
    	log.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			String x=user.getText();
    			String y=pass.getText();
    			
    			try{
    			Connection con = DriverManager.getConnection(dburl,userdb,passdb);
    				String squery = "select username,password from login where username='"+x+"' and password='"+y+"'";
    				Statement st = con.createStatement();
    				ResultSet rs = st.executeQuery(squery);
    				
    				if(rs.next()){
    					JOptionPane.showMessageDialog(null,"Login Successfully!","Login Success",JOptionPane.INFORMATION_MESSAGE);
    					login.setVisible(false);
    					admin.setVisible(true);
    				}
    				else{
    					JOptionPane.showMessageDialog(null,"Incorrect username and Password","Incorrect Input",JOptionPane.ERROR_MESSAGE);
    					pass.setText("");
    				}
    				
    				st.close();
    				con.close();
    			}
    			
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null, ex);
    			}
    		}
    	});
    	log.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_ENTER){
   					log.doClick();
   				}
   			}
   		});
    	cancel.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			login.setVisible(false);
    			fmain.setVisible(true);
    		}
    	});
    	cancel.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F9){
   					cancel.doClick();
   				}
   			}
   		});
    	
    	
    	login.add(logp);
    	
    	//---------------------------------------------------------endLOGINForm----------------------------------------------//
    	
    	
    	
    	//------------------------------------------------adminMain----------------------------------------------------//
    	
    	jp1.setBounds(10,10,250,210);
    	jp2.setBounds(10,220,250,430);
    	wel.setBounds(10,10,100,20);
    	icon.setBounds(25,30,200,150);
    	a.setBounds(80,180,100,20);
    	home.setBounds(0,0,260,50);
    	enroll.setBounds(0,50,250,50);
    	info.setBounds(0,100,250,50);
    	regf.setBounds(0,150,250,50);
    	report.setBounds(0,200,250,50);
    	archiveb.setBounds(0,250,250,50);
    	logout.setBounds(0,300,250,50);
    	jp1.setBorder(BorderFactory.createEtchedBorder());
    	jp2.setBorder(BorderFactory.createEtchedBorder());
    	icon.setBorder(BorderFactory.createEtchedBorder());
    	jphome.setBounds(260,10,1060,640);
    	jpen.setBounds(260,10,1060,640);
    	jpin.setBounds(260,10,1060,640);
    	jpreg.setBounds(260,10,1060,640);
  		jprep.setBounds(260,10,1060,640);
  		jparch.setBounds(260,10,1060,640);
    	jphome.setBorder(BorderFactory.createEtchedBorder());
    	jpen.setBorder(BorderFactory.createEtchedBorder());
    	jpin.setBorder(BorderFactory.createEtchedBorder());
    	jpreg.setBorder(BorderFactory.createEtchedBorder());
  		jprep.setBorder(BorderFactory.createEtchedBorder());
  		jparch.setBorder(BorderFactory.createEtchedBorder());
  		pending.setBounds(920,580,120,40);
  		approve.setBounds(780,580,120,40);
  		dropped.setBounds(640,580,120,40);
  		enUpdate.setBounds(500,580,120,40);
  		newstud.setBounds(930,20,110,30);
  		view.setBounds(800,20,110,30);
  		search.setBounds(670,20,110,30);
  		sear.setBounds(420,20,250,30);
  		lblogo.setBounds(10,10,1040,630);
  		search1.setBounds(720,20,80,30);
  		sear1.setBounds(510,20,210,30);
  		update.setBounds(930,20,110,30);
  		archive.setBounds(810,20,110,30);
  		print.setBounds(930,20,110,30);
  		course.setBounds(20,60,400,30);
  		sem.setBounds(20,90,250,30);
  		schlyr.setBounds(20,120,150,30);
  		l1.setBounds(30,200,100,30);
  		l2.setBounds(120,200,100,30);
  		l3.setBounds(310,200,150,30);
  		l4.setBounds(517,200,50,30);
  		l5.setBounds(640,200,80,30);
  		l6.setBounds(770,200,50,30);
  		l7.setBounds(840,200,70,30);
  		j1.setBorder(BorderFactory.createEtchedBorder());
  		j2.setBorder(BorderFactory.createEtchedBorder());
  		j3.setBorder(BorderFactory.createEtchedBorder());
  		j4.setBorder(BorderFactory.createEtchedBorder());
  		j5.setBorder(BorderFactory.createEtchedBorder());
  		j6.setBorder(BorderFactory.createEtchedBorder());
  		j7.setBorder(BorderFactory.createEtchedBorder());
  		j1.setBounds(20,230,90,400);
  		j2.setBounds(110,230,100,400);
  		j3.setBounds(210,230,300,400);
  		j4.setBounds(510,230,50,400);
  		j5.setBounds(560,230,200,400);
  		j6.setBounds(760,230,50,400);
  		j7.setBounds(810,230,90,400);
  		j8.setBorder(BorderFactory.createEtchedBorder());
  		j9.setBorder(BorderFactory.createEtchedBorder());
  		j10.setBorder(BorderFactory.createEtchedBorder());
  		j11.setBorder(BorderFactory.createEtchedBorder());
  		j12.setBorder(BorderFactory.createEtchedBorder());
  		j13.setBorder(BorderFactory.createEtchedBorder());
  		j14.setBorder(BorderFactory.createEtchedBorder());
  		j8.setBounds(20,230,90,400);
  		j9.setBounds(110,230,100,400);
  		j10.setBounds(210,230,300,400);
  		j11.setBounds(510,230,50,400);
  		j12.setBounds(560,230,200,400);
  		j13.setBounds(760,230,50,400);
  		j14.setBounds(810,230,90,400);
  		j15.setBorder(BorderFactory.createEtchedBorder());
  		j16.setBorder(BorderFactory.createEtchedBorder());
  		j17.setBorder(BorderFactory.createEtchedBorder());
  		j18.setBorder(BorderFactory.createEtchedBorder());
  		j19.setBorder(BorderFactory.createEtchedBorder());
  		j20.setBorder(BorderFactory.createEtchedBorder());
  		j21.setBorder(BorderFactory.createEtchedBorder());
  		j15.setBounds(20,230,90,400);
  		j16.setBounds(110,230,100,400);
  		j17.setBounds(210,230,300,400);
  		j18.setBounds(510,230,50,400);
  		j19.setBounds(560,230,200,400);
  		j20.setBounds(760,230,50,400);
  		j21.setBounds(810,230,90,400);
  		j22.setBorder(BorderFactory.createEtchedBorder());
  		j23.setBorder(BorderFactory.createEtchedBorder());
  		j24.setBorder(BorderFactory.createEtchedBorder());
  		j25.setBorder(BorderFactory.createEtchedBorder());
  		j26.setBorder(BorderFactory.createEtchedBorder());
  		j27.setBorder(BorderFactory.createEtchedBorder());
  		j28.setBorder(BorderFactory.createEtchedBorder());
  		j22.setBounds(20,230,90,400);
  		j23.setBounds(110,230,100,400);
  		j24.setBounds(210,230,300,400);
  		j25.setBounds(510,230,50,400);
  		j26.setBounds(560,230,200,400);
  		j27.setBounds(760,230,50,400);
  		j28.setBounds(810,230,90,400);
  		j29.setBorder(BorderFactory.createEtchedBorder());
  		j30.setBorder(BorderFactory.createEtchedBorder());
  		j31.setBorder(BorderFactory.createEtchedBorder());
  		j32.setBorder(BorderFactory.createEtchedBorder());
  		j33.setBorder(BorderFactory.createEtchedBorder());
  		j34.setBorder(BorderFactory.createEtchedBorder());
  		j35.setBorder(BorderFactory.createEtchedBorder());
  		j29.setBounds(20,230,90,400);
  		j30.setBounds(110,230,100,400);
  		j31.setBounds(210,230,300,400);
  		j32.setBounds(510,230,50,400);
  		j33.setBounds(560,230,200,400);
  		j34.setBounds(760,230,50,400);
  		j35.setBounds(810,230,90,400);
  		j36.setBorder(BorderFactory.createEtchedBorder());
  		j37.setBorder(BorderFactory.createEtchedBorder());
  		j38.setBorder(BorderFactory.createEtchedBorder());
  		j39.setBorder(BorderFactory.createEtchedBorder());
  		j40.setBorder(BorderFactory.createEtchedBorder());
  		j41.setBorder(BorderFactory.createEtchedBorder());
  		j42.setBorder(BorderFactory.createEtchedBorder());
  		j36.setBounds(20,230,90,400);
  		j37.setBounds(110,230,100,400);
  		j38.setBounds(210,230,300,400);
  		j39.setBounds(510,230,50,400);
  		j40.setBounds(560,230,200,400);
  		j41.setBounds(760,230,50,400);
  		j42.setBounds(810,230,90,400);
  		j43.setBorder(BorderFactory.createEtchedBorder());
  		j44.setBorder(BorderFactory.createEtchedBorder());
  		j45.setBorder(BorderFactory.createEtchedBorder());
  		j46.setBorder(BorderFactory.createEtchedBorder());
  		j47.setBorder(BorderFactory.createEtchedBorder());
  		j48.setBorder(BorderFactory.createEtchedBorder());
  		j49.setBorder(BorderFactory.createEtchedBorder());
  		j43.setBounds(20,230,90,400);
  		j44.setBounds(110,230,100,400);
  		j45.setBounds(210,230,300,400);
  		j46.setBounds(510,230,50,400);
  		j47.setBounds(560,230,200,400);
  		j48.setBounds(760,230,50,400);
  		j49.setBounds(810,230,90,400);

  		regIt.setBounds(930,230,100,30);
  		regCs.setBounds(930,260,100,30);
  		regPsyc.setBounds(930,290,100,30);
  		regEe.setBounds(930,320,100,30);
  		regBsem.setBounds(930,350,100,30);
  		regBm.setBounds(930,380,100,30);
  		regHm.setBounds(930,410,100,30);
  		regJourn.setBounds(930,440,100,30);
  		regOa.setBounds(930,470,100,30);
  		regBent.setBounds(930,500,100,30);
  		it.setBounds(30,10,100,30);
  		cs.setBounds(130,10,100,30);
  		psyc.setBounds(230,10,100,30);
  		ee.setBounds(330,10,100,30);
  		bsem.setBounds(430,10,100,30);
  		bm.setBounds(530,10,100,30);
  		hm.setBounds(630,10,100,30);
  		journ.setBounds(730,10,100,30);
  		oa.setBounds(830,10,100,30);
  		bent.setBounds(930,10,100,30);
  		sem1.setBorder(BorderFactory.createEtchedBorder());
  		sem2.setBorder(BorderFactory.createEtchedBorder());
  		crs.setBounds(400,100,300,30);
  		year1.setBounds(480,150,130,30);
  		sem1.setBounds(170,200,350,150);
  		sem2.setBounds(570,200,350,150);
  		tnum.setBounds(20,20,150,30);
  		tnum1.setBounds(20,20,150,30);
  		drp.setBounds(20,50,150,30);
  		drp1.setBounds(20,50,150,30);
  		sp1.setBounds(80,100,910,450);
  		enTable.setBorder(BorderFactory.createEtchedBorder());
  		sp2.setBounds(80,100,910,450);
  		inTable.setBorder(BorderFactory.createEtchedBorder());
  		sp3.setBounds(80,50,910,450);
  		archTable.setBorder(BorderFactory.createEtchedBorder());
  		retrive.setBounds(890,580,100,30);
  		//print
  		course.setText("Course:  ");
  		address.setText("Address: ");
  		sem.setText("Semester:   1st Sem ");
  		schlyr.setText("Schoolyear:   2018-2019 ");
  		
  		home.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				jpin.setVisible(false);
  				jpen.setVisible(false);
  				jpreg.setVisible(false);
  				jparch.setVisible(false);
  				jprep.setVisible(false);
  				jphome.setVisible(true);
  			}
  		});
  		enroll.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				jphome.setVisible(false);
  				jpreg.setVisible(false);
  				jprep.setVisible(false);
  				jpin.setVisible(false);
  				jparch.setVisible(false);
  				jpen.setVisible(true);
  			}
  		});
  		info.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				jphome.setVisible(false);
  				jpreg.setVisible(false);
  				jprep.setVisible(false);
  				jpen.setVisible(false);
  				jparch.setVisible(false);
  				jpin.setVisible(true);
  			}
  		});
  		regf.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				jphome.setVisible(false);
  				jpin.setVisible(false);
  				jprep.setVisible(false);
  				jpen.setVisible(false);
  				jparch.setVisible(false);
  				jpreg.setVisible(true);
  			}
  		});
  		report.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				jphome.setVisible(false);
  				jpreg.setVisible(false);
  				jpin.setVisible(false);
  				jpen.setVisible(false);
  				jparch.setVisible(false);
  				jprep.setVisible(true);
  			}
  		});
  		archiveb.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				jphome.setVisible(false);
  				jpreg.setVisible(false);
  				jpin.setVisible(false);
  				jpen.setVisible(false);;
  				jprep.setVisible(false);
  				jparch.setVisible(true);
  			}
  		});
  		logout.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
            	int n=JOptionPane.showConfirmDialog(null,"Are you sure you want to logout?","Confirm",JOptionPane.YES_NO_OPTION);
            	if(n==0){
            		admin.setVisible(false);
  					fmain.setVisible(true);
  					pass.setText("");
  					user.setText("");
  				}
  				else{
  					admin.setVisible(true);
  				}
  			
  				
  			}
  		});
  		logout.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
   					logout.doClick();
   				}
   			}
   		});
  		newstud.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				adm.setVisible(true);
  			}
  		});
  		
  		regIt.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				String regCourse = "Bachelor of Science in Information Technology";
  				course.setText("Course: " +regCourse);
  				
  				j1.setVisible(true);
  				j2.setVisible(true);
  				j3.setVisible(true);
  				j4.setVisible(true);
  				j5.setVisible(true);
  				j6.setVisible(true);
  				j7.setVisible(true);
  				j8.setVisible(false);
  				j9.setVisible(false);
  				j10.setVisible(false);
  				j11.setVisible(false);
  				j12.setVisible(false);
  				j13.setVisible(false);
  				j14.setVisible(false);
  				j15.setVisible(false);
  				j16.setVisible(false);
  				j17.setVisible(false);
  				j18.setVisible(false);
  				j19.setVisible(false);
  				j20.setVisible(false);
  				j21.setVisible(false);
  				j22.setVisible(false);
  				j23.setVisible(false);
  				j24.setVisible(false);
  				j25.setVisible(false);
  				j26.setVisible(false);
  				j27.setVisible(false);
  				j28.setVisible(false);
  				j29.setVisible(false);
  				j30.setVisible(false);
  				j31.setVisible(false);
  				j32.setVisible(false);
  				j33.setVisible(false);
  				j34.setVisible(false);
  				j35.setVisible(false);
  			}
  		});
  		regCs.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				String regCourse = "Bachelor of Science in Computer Science";
  				course.setText("Course: " +regCourse);
  				
  				j1.setVisible(false);
  				j2.setVisible(false);
  				j3.setVisible(false);
  				j4.setVisible(false);
  				j5.setVisible(false);
  				j6.setVisible(false);
  				j7.setVisible(false);
  				j8.setVisible(true);
  				j9.setVisible(true);
  				j10.setVisible(true);
  				j11.setVisible(true);
  				j12.setVisible(true);
  				j13.setVisible(true);
  				j14.setVisible(true);
  				j15.setVisible(false);
  				j16.setVisible(false);
  				j17.setVisible(false);
  				j18.setVisible(false);
  				j19.setVisible(false);
  				j20.setVisible(false);
  				j21.setVisible(false);
  				j22.setVisible(false);
  				j23.setVisible(false);
  				j24.setVisible(false);
  				j25.setVisible(false);
  				j26.setVisible(false);
  				j27.setVisible(false);
  				j28.setVisible(false);
  				j29.setVisible(false);
  				j30.setVisible(false);
  				j31.setVisible(false);
  				j32.setVisible(false);
  				j33.setVisible(false);
  				j34.setVisible(false);
  				j35.setVisible(false);
  			}
  		});
  		
  		regPsyc.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				String regCourse = "Bachelor of Science in Psychology";
  				course.setText("Course: " +regCourse);
  				
  				j1.setVisible(false);
  				j2.setVisible(false);
  				j3.setVisible(false);
  				j4.setVisible(false);
  				j5.setVisible(false);
  				j6.setVisible(false);
  				j7.setVisible(false);
  				j8.setVisible(false);
  				j9.setVisible(false);
  				j10.setVisible(false);
  				j11.setVisible(false);
  				j12.setVisible(false);
  				j13.setVisible(false);
  				j14.setVisible(false);
  				j15.setVisible(true);
  				j16.setVisible(true);
  				j17.setVisible(true);
  				j18.setVisible(true);
  				j19.setVisible(true);
  				j20.setVisible(true);
  				j21.setVisible(true);
  				j22.setVisible(false);
  				j23.setVisible(false);
  				j24.setVisible(false);
  				j25.setVisible(false);
  				j26.setVisible(false);
  				j27.setVisible(false);
  				j28.setVisible(false);
  				j29.setVisible(false);
  				j30.setVisible(false);
  				j31.setVisible(false);
  				j32.setVisible(false);
  				j33.setVisible(false);
  				j34.setVisible(false);
  				j35.setVisible(false);
  			}
  		});
  		
  			regEe.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				String regCourse = "Bachelor of Science in Education";
  				course.setText("Course: " +regCourse);
  				
  				
  				j1.setVisible(false);
  				j2.setVisible(false);
  				j3.setVisible(false);
  				j4.setVisible(false);
  				j5.setVisible(false);
  				j6.setVisible(false);
  				j7.setVisible(false);
  				j8.setVisible(false);
  				j9.setVisible(false);
  				j10.setVisible(false);
  				j11.setVisible(false);
  				j12.setVisible(false);
  				j13.setVisible(false);
  				j14.setVisible(false);
  				j15.setVisible(false);
  				j16.setVisible(false);
  				j17.setVisible(false);
  				j18.setVisible(false);
  				j19.setVisible(false);
  				j20.setVisible(false);
  				j21.setVisible(false);
  				j22.setVisible(true);
  				j23.setVisible(true);
  				j24.setVisible(true);
  				j25.setVisible(true);
  				j26.setVisible(true);
  				j27.setVisible(true);
  				j28.setVisible(true);
  				j29.setVisible(false);
  				j30.setVisible(false);
  				j31.setVisible(false);
  				j32.setVisible(false);
  				j33.setVisible(false);
  				j34.setVisible(false);
  				j35.setVisible(false);
  			}
  		});
  		
  		
  			regHm.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				String regCourse = "Bachelor of Science in Hotel & Restaurant Management";
  				course.setText("Course: " +regCourse);
  				
  				j29.setVisible(true);
  				j30.setVisible(true);
  				j31.setVisible(true);
  				j32.setVisible(true);
  				j33.setVisible(true);
  				j34.setVisible(true);
  				j35.setVisible(true);
  				j1.setVisible(false);
  				j2.setVisible(false);
  				j3.setVisible(false);
  				j4.setVisible(false);
  				j5.setVisible(false);
  				j6.setVisible(false);
  				j7.setVisible(false);
  				j8.setVisible(false);
  				j9.setVisible(false);
  				j10.setVisible(false);
  				j11.setVisible(false);
  				j12.setVisible(false);
  				j13.setVisible(false);
  				j14.setVisible(false);
  				j15.setVisible(false);
  				j16.setVisible(false);
  				j17.setVisible(false);
  				j18.setVisible(false);
  				j19.setVisible(false);
  				j20.setVisible(false);
  				j21.setVisible(false);
  				j22.setVisible(false);
  				j23.setVisible(false);
  				j24.setVisible(false);
  				j25.setVisible(false);
  				j26.setVisible(false);
  				j27.setVisible(false);
  				j28.setVisible(false);	
  				
  			}
  		});
  		regBsem.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				String regCourse = "Bachelor of Science in Hotel & Restaurant Management";
  				course.setText("Course: " +regCourse);
  				
  				j29.setVisible(true);
  				j30.setVisible(true);
  				j31.setVisible(true);
  				j32.setVisible(true);
  				j33.setVisible(true);
  				j34.setVisible(true);
  				j35.setVisible(true);
  				j1.setVisible(false);
  				j2.setVisible(false);
  				j3.setVisible(false);
  				j4.setVisible(false);
  				j5.setVisible(false);
  				j6.setVisible(false);
  				j7.setVisible(false);
  				j8.setVisible(false);
  				j9.setVisible(false);
  				j10.setVisible(false);
  				j11.setVisible(false);
  				j12.setVisible(false);
  				j13.setVisible(false);
  				j14.setVisible(false);
  				j15.setVisible(false);
  				j16.setVisible(false);
  				j17.setVisible(false);
  				j18.setVisible(false);
  				j19.setVisible(false);
  				j20.setVisible(false);
  				j21.setVisible(false);
  				j22.setVisible(false);
  				j23.setVisible(false);
  				j24.setVisible(false);
  				j25.setVisible(false);
  				j26.setVisible(false);
  				j27.setVisible(false);
  				j28.setVisible(false);	
  				
  			}
  		});
  		
  		
  			regBm.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				String regCourse = "Bachelor of Science in Business Management";
  				course.setText("Course: " +regCourse);
  				
  				
  				j36.setVisible(true);
  				j37.setVisible(true);
  				j38.setVisible(true);
  				j39.setVisible(true);
  				j40.setVisible(true);
  				j41.setVisible(true);
  				j42.setVisible(true);
  				j1.setVisible(false);
  				j2.setVisible(false);
  				j3.setVisible(false);
  				j4.setVisible(false);
  				j5.setVisible(false);
  				j6.setVisible(false);
  				j7.setVisible(false);
  				j8.setVisible(false);
  				j9.setVisible(false);
  				j10.setVisible(false);
  				j11.setVisible(false);
  				j12.setVisible(false);
  				j13.setVisible(false);
  				j14.setVisible(false);
  				j15.setVisible(false);
  				j16.setVisible(false);
  				j17.setVisible(false);
  				j18.setVisible(false);
  				j19.setVisible(false);
  				j20.setVisible(false);
  				j21.setVisible(false);
  				j22.setVisible(false);
  				j23.setVisible(false);
  				j24.setVisible(false);
  				j25.setVisible(false);
  				j26.setVisible(false);
  				j27.setVisible(false);
  				j28.setVisible(false);	
  				j29.setVisible(false);
  				j30.setVisible(false);
  				j31.setVisible(false);
  				j32.setVisible(false);
  				j33.setVisible(false);
  				j34.setVisible(false);
  				j35.setVisible(false);
  				
  			}
  		});
  		
  		regJourn.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				String regCourse = "Bachelor of Arts in Journalism";
  				course.setText("Course: " +regCourse);
  				
  				
  				j43.setVisible(true);
				j44.setVisible(true);
				j45.setVisible(true);
				j46.setVisible(true);
				j47.setVisible(true);
				j48.setVisible(true);
				j49.setVisible(true);
  				j1.setVisible(false);
  				j2.setVisible(false);
  				j3.setVisible(false);
  				j4.setVisible(false);
  				j5.setVisible(false);
  				j6.setVisible(false);
  				j7.setVisible(false);
  				j8.setVisible(false);
  				j9.setVisible(false);
  				j10.setVisible(false);
  				j11.setVisible(false);
  				j12.setVisible(false);
  				j13.setVisible(false);
  				j14.setVisible(false);
  				j15.setVisible(false);
  				j16.setVisible(false);
  				j17.setVisible(false);
  				j18.setVisible(false);
  				j19.setVisible(false);
  				j20.setVisible(false);
  				j21.setVisible(false);
  				j22.setVisible(false);
  				j23.setVisible(false);
  				j24.setVisible(false);
  				j25.setVisible(false);
  				j26.setVisible(false);
  				j27.setVisible(false);
  				j28.setVisible(false);	
  				j29.setVisible(false);
  				j30.setVisible(false);
  				j31.setVisible(false);
  				j32.setVisible(false);
  				j33.setVisible(false);
  				j34.setVisible(false);
  				j35.setVisible(false);
  				j36.setVisible(false);
  				j37.setVisible(false);
  				j38.setVisible(false);
  				j39.setVisible(false);
  				j40.setVisible(false);
  				j41.setVisible(false);
  				j42.setVisible(false);
  				
  			}
  		});
  		
  		regOa.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				String regCourse = "Bachelor of Science in Office Administration";
  				course.setText("Course: " +regCourse);
  				
  				
  				j36.setVisible(true);
  				j37.setVisible(true);
  				j38.setVisible(true);
  				j39.setVisible(true);
  				j40.setVisible(true);
  				j41.setVisible(true);
  				j42.setVisible(true);
  				j1.setVisible(false);
  				j2.setVisible(false);
  				j3.setVisible(false);
  				j4.setVisible(false);
  				j5.setVisible(false);
  				j6.setVisible(false);
  				j7.setVisible(false);
  				j8.setVisible(false);
  				j9.setVisible(false);
  				j10.setVisible(false);
  				j11.setVisible(false);
  				j12.setVisible(false);
  				j13.setVisible(false);
  				j14.setVisible(false);
  				j15.setVisible(false);
  				j16.setVisible(false);
  				j17.setVisible(false);
  				j18.setVisible(false);
  				j19.setVisible(false);
  				j20.setVisible(false);
  				j21.setVisible(false);
  				j22.setVisible(false);
  				j23.setVisible(false);
  				j24.setVisible(false);
  				j25.setVisible(false);
  				j26.setVisible(false);
  				j27.setVisible(false);
  				j28.setVisible(false);	
  				j29.setVisible(false);
  				j30.setVisible(false);
  				j31.setVisible(false);
  				j32.setVisible(false);
  				j33.setVisible(false);
  				j34.setVisible(false);
  				j35.setVisible(false);
  				
  			}
  		});
  		
  		regBent.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				String regCourse = "Bachelor of Science in Entrepreneurship";
  				course.setText("Course: " +regCourse);
  				
  				
  				j43.setVisible(true);
				j44.setVisible(true);
				j45.setVisible(true);
				j46.setVisible(true);
				j47.setVisible(true);
				j48.setVisible(true);
				j49.setVisible(true);
  				j1.setVisible(false);
  				j2.setVisible(false);
  				j3.setVisible(false);
  				j4.setVisible(false);
  				j5.setVisible(false);
  				j6.setVisible(false);
  				j7.setVisible(false);
  				j8.setVisible(false);
  				j9.setVisible(false);
  				j10.setVisible(false);
  				j11.setVisible(false);
  				j12.setVisible(false);
  				j13.setVisible(false);
  				j14.setVisible(false);
  				j15.setVisible(false);
  				j16.setVisible(false);
  				j17.setVisible(false);
  				j18.setVisible(false);
  				j19.setVisible(false);
  				j20.setVisible(false);
  				j21.setVisible(false);
  				j22.setVisible(false);
  				j23.setVisible(false);
  				j24.setVisible(false);
  				j25.setVisible(false);
  				j26.setVisible(false);
  				j27.setVisible(false);
  				j28.setVisible(false);	
  				j29.setVisible(false);
  				j30.setVisible(false);
  				j31.setVisible(false);
  				j32.setVisible(false);
  				j33.setVisible(false);
  				j34.setVisible(false);
  				j35.setVisible(false);
  				j36.setVisible(false);
  				j37.setVisible(false);
  				j38.setVisible(false);
  				j39.setVisible(false);
  				j40.setVisible(false);
  				j41.setVisible(false);
  				j42.setVisible(false);
  				
  			}
  		});
  		
  		
  		print.addActionListener(new ActionListener(){
  			public void actionPerformed(ActionEvent e){
  				try{
  					schedForm();
  					}
  				catch(IOException ex){
  					ex.printStackTrace();
  				}
  			}
  		});
  		
  		
  		try{
   			admin.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\greenBackground1.jpg")))));
   			}
   		catch(IOException e){
   			e.printStackTrace();
   			}
   		
   		jp2.add(clockpane6);
    	jp1.add(icon);
    	jp1.add(wel);
    	jp1.add(a);
    	jp2.add(home);
    	jp2.add(enroll);
    	jp2.add(info);
    	jp2.add(regf);
    	jp2.add(report);
    	jp2.add(archiveb);
    	jp2.add(logout);
    	//homebuttonpanel
    	jphome.add(logo);
    	jphome.add(lblogo);
    	//enrollbuttonpanel
    	jpen.add(pending);
    	jpen.add(approve);
    	jpen.add(newstud);
    	jpen.add(enUpdate);
    	jpen.add(view);
    	jpen.add(search);
    	jpen.add(sear);
    	jpen.add(it);
    	jpen.add(cs);
    	jpen.add(psyc);
    	jpen.add(ee);
    	jpen.add(bsem);
    	jpen.add(journ);
    	jpen.add(oa);
    	jpen.add(bent);
    	jpen.add(sp1);
    	jpen.add(dropped);
    	//studentInfoPanel
    	jpin.add(sear1);
    	jpin.add(search1);
    	jpin.add(update);
    	jpin.add(archive);
    	jpin.add(sp2);
    	//REGformPanel
    	jpreg.add(j1);
    	jpreg.add(j2);
    	jpreg.add(j3);
    	jpreg.add(j4);
    	jpreg.add(j5);
    	jpreg.add(j6);
    	jpreg.add(j7);
    	jpreg.add(j8);
    	jpreg.add(j1);
    	jpreg.add(j2);
    	jpreg.add(j3);
    	jpreg.add(j4);
    	jpreg.add(j5);
    	jpreg.add(j6);
    	jpreg.add(j7);
    	jpreg.add(j8);
    	jpreg.add(j9);
    	jpreg.add(j10);
    	jpreg.add(j11);
    	jpreg.add(j12);
    	jpreg.add(j13);
    	jpreg.add(j14);
    	jpreg.add(j15);
    	jpreg.add(j16);
    	jpreg.add(j17);
    	jpreg.add(j18);
    	jpreg.add(j19);
    	jpreg.add(j20);
    	jpreg.add(j21);
    	jpreg.add(j22);
    	jpreg.add(j23);
    	jpreg.add(j24);
    	jpreg.add(j25);
    	jpreg.add(j26);
    	jpreg.add(j27);
    	jpreg.add(j28);
    	jpreg.add(j29);
    	jpreg.add(j30);
    	jpreg.add(j31);
    	jpreg.add(j32);
    	jpreg.add(j33);
    	jpreg.add(j34);
    	jpreg.add(j35);
    	jpreg.add(j36);
    	jpreg.add(j37);
    	jpreg.add(j38);
    	jpreg.add(j39);
    	jpreg.add(j40);
    	jpreg.add(j41);
    	jpreg.add(j42);
    	jpreg.add(j43);
    	jpreg.add(j44);
    	jpreg.add(j45);
    	jpreg.add(j46);
    	jpreg.add(j47);
    	jpreg.add(j48);
    	jpreg.add(j49);
    	jpreg.add(course);
    	jpreg.add(address);
    	jpreg.add(sem);
    	jpreg.add(schlyr);
    	jpreg.add(print);
    	jpreg.add(l1);
    	jpreg.add(l2);
    	jpreg.add(l3);
    	jpreg.add(l4);
    	jpreg.add(l5);
    	jpreg.add(l6);
    	jpreg.add(l7);
    	jpreg.add(regIt);
    	jpreg.add(regCs);
    	jpreg.add(regPsyc);
    	jpreg.add(regEe);
    	jpreg.add(regBsem);
    	jpreg.add(regBm);
    	jpreg.add(regHm);
    	jpreg.add(regJourn);
    	jpreg.add(regOa);
    	jpreg.add(regBent);
    	j1.add(l9);
    	j1.add(l10);
    	j1.add(l11);
    	j1.add(l12);
    	j1.add(l13);
    	j1.add(l14);
    	j2.add(l15);
    	j2.add(l16);
    	j2.add(l17);
    	j2.add(l18);
    	j2.add(l19);
    	j2.add(l20);
    	j3.add(l21);
    	j3.add(l22);
    	j3.add(l23);
    	j3.add(l24);
    	j3.add(l25);
    	j3.add(l26);
    	j4.add(l27);
    	j4.add(l28);
    	j4.add(l29);
    	j4.add(l30);
    	j4.add(l31);
    	j4.add(l32);
    	j5.add(l33);
    	j5.add(l34);
    	j5.add(l35);
    	j5.add(l36);
    	j5.add(l37);
    	j5.add(l38);
    	j6.add(l39);
    	j6.add(l40);
    	j6.add(l41);
    	j6.add(l42);
    	j6.add(l43);
    	j6.add(l44);
    	j7.add(l45);
    	j7.add(l46);
    	j7.add(l47);
    	j7.add(l48);
    	j7.add(l49);
    	j7.add(l50);
    	j8.add(l59);
    	j8.add(l60);
    	j8.add(l61);
    	j8.add(l62);
    	j8.add(l63);
    	j8.add(l64);
    	j9.add(l65);
    	j9.add(l66);
    	j9.add(l67);
    	j9.add(l68);
    	j9.add(l69);
    	j9.add(l70);
    	j10.add(l71);
    	j10.add(l72);
    	j10.add(l73);
    	j10.add(l74);
    	j10.add(l75);
    	j10.add(l76);
    	j11.add(l77);
    	j11.add(l78);
    	j11.add(l79);
    	j11.add(l80);
    	j11.add(l81);
    	j11.add(l82);
    	j12.add(l83);
    	j12.add(l84);
    	j12.add(l85);
    	j12.add(l86);
    	j12.add(l87);
    	j12.add(l88);
    	j13.add(l89);
    	j13.add(l90);
    	j13.add(l91);
    	j13.add(l92);
    	j13.add(l93);
    	j13.add(l94);
    	j14.add(l95);
    	j14.add(l96);
    	j14.add(l97);
    	j14.add(l98);
    	j14.add(l99);
    	j14.add(l100);
    	j15.add(l101);
    	j15.add(l102);
    	j15.add(l103);
    	j15.add(l104);
    	j15.add(l105);
    	j15.add(l106);
    	j16.add(l107);
    	j16.add(l108);
    	j16.add(l109);
    	j16.add(l110);
    	j16.add(l111);
    	j16.add(l112);
    	j17.add(l113);
    	j17.add(l114);
    	j17.add(l115);
    	j17.add(l116);
    	j17.add(l117);
    	j17.add(l118);
    	j18.add(l119);
    	j18.add(l120);
    	j18.add(l121);
    	j18.add(l122);
    	j18.add(l123);
    	j18.add(l124);
    	j19.add(l125);
    	j19.add(l126);
    	j19.add(l127);
    	j19.add(l128);
    	j19.add(l129);
    	j19.add(l130);
    	j20.add(l131);
    	j20.add(l132);
    	j20.add(l133);
    	j20.add(l134);
    	j20.add(l135);
    	j20.add(l136);
    	j21.add(l137);
    	j21.add(l138);
    	j21.add(l139);
    	j21.add(l140);
    	j21.add(l141);
    	j21.add(l142);
    	j22.add(l143);
    	j22.add(l144);
    	j22.add(l145);
    	j22.add(l146);
    	j22.add(l147);
    	j22.add(l148);
    	j23.add(l149);
    	j23.add(l150);
    	j23.add(l151);
    	j23.add(l152);
    	j23.add(l153);
    	j23.add(l154);
    	j24.add(l155);
    	j24.add(l156);
    	j24.add(l157);
    	j24.add(l158);
    	j24.add(l159);
    	j24.add(l160);
    	j25.add(l161);
    	j25.add(l162);
    	j25.add(l163);
    	j25.add(l164);
    	j25.add(l165);
    	j25.add(l166);
    	j26.add(l167);
    	j26.add(l168);
    	j26.add(l169);
    	j26.add(l170);
    	j26.add(l171);
    	j26.add(l172);
    	j27.add(l173);
    	j27.add(l174);
    	j27.add(l175);
    	j27.add(l176);
    	j27.add(l177);
    	j27.add(l178);
    	j28.add(l179);
    	j28.add(l180);
    	j28.add(l181);
    	j28.add(l182);
    	j28.add(l183);
    	j28.add(l184);
    	j29.add(l185);
    	j29.add(l186);
    	j29.add(l187);
    	j29.add(l188);
    	j29.add(l189);
    	j29.add(l190);
    	j30.add(l191);
    	j30.add(l192);
    	j30.add(l193);
    	j30.add(l194);
    	j30.add(l195);
    	j30.add(l196);
    	j31.add(l197);
    	j31.add(l198);
    	j31.add(l199);
    	j31.add(l200);
    	j31.add(l201);
    	j31.add(l202);
    	j32.add(l203);
    	j32.add(l204);
    	j32.add(l205);
    	j32.add(l206);
    	j32.add(l207);
    	j32.add(l208);
    	j33.add(l209);
    	j33.add(l210);
    	j33.add(l211);
    	j33.add(l212);
    	j33.add(l213);
    	j33.add(l214);
    	j34.add(l215);
    	j34.add(l216);
    	j34.add(l217);
    	j34.add(l218);
    	j34.add(l219);
    	j34.add(l220);
    	j35.add(l221);
    	j35.add(l222);
    	j35.add(l223);
    	j35.add(l224);
    	j35.add(l225);
    	j35.add(l226);
    	j36.add(l227);
    	j36.add(l228);
    	j36.add(l229);
    	j36.add(l230);
    	j36.add(l231);
    	j36.add(l232);
    	j37.add(l233);
    	j37.add(l234);
    	j37.add(l235);
    	j37.add(l236);
    	j37.add(l237);
    	j37.add(l238);
    	j38.add(l239);
    	j38.add(l240);
    	j38.add(l241);
    	j38.add(l242);
    	j38.add(l243);
    	j38.add(l244);
    	j39.add(l245);
    	j39.add(l246);
    	j39.add(l247);
    	j39.add(l248);
    	j39.add(l249);
    	j39.add(l250);
    	j40.add(l251);
    	j40.add(l252);
    	j40.add(l253);
    	j40.add(l254);
    	j40.add(l255);
    	j40.add(l256);
    	j41.add(l257);
    	j41.add(l258);
    	j41.add(l259);
    	j41.add(l260);
    	j41.add(l261);
    	j41.add(l262);
    	j42.add(l263);
    	j42.add(l264);
    	j42.add(l265);
    	j42.add(l266);
    	j42.add(l267);
    	j42.add(l268);
    	j43.add(l269);
    	j43.add(l270);
    	j43.add(l271);
    	j43.add(l272);
    	j43.add(l273);
    	j43.add(l274);
    	j44.add(l275);
    	j44.add(l276);
    	j44.add(l277);
    	j44.add(l278);
    	j44.add(l279);
    	j44.add(l280);
    	j45.add(l281);
    	j45.add(l282);
    	j45.add(l283);
    	j45.add(l284);
    	j45.add(l285);
    	j45.add(l286);
    	j46.add(l287);
    	j46.add(l288);
    	j46.add(l289);
    	j46.add(l290);
    	j46.add(l291);
    	j46.add(l292);
    	j47.add(l293);
    	j47.add(l294);
    	j47.add(l295);
    	j47.add(l296);
    	j47.add(l297);
    	j47.add(l298);
    	j48.add(l299);
    	j48.add(l300);
    	j48.add(l301);
    	j48.add(l302);
    	j48.add(l303);
    	j48.add(l304);
    	j49.add(l305);
    	j49.add(l306);
    	j49.add(l307);
    	j49.add(l308);
    	j49.add(l309);
    	j49.add(l310);
		//ReportPanel
		jprep.add(it);
		jprep.add(cs);
		jprep.add(psyc);
		jprep.add(ee);
		jprep.add(bsem);
		jprep.add(bm);
		jprep.add(journ);
		jprep.add(oa);
		jprep.add(hm);
		jprep.add(bent);
		jprep.add(tnum);
		sem1.add(drp);
		sem2.add(drp1);
		jprep.add(crs);
		sem1.add(tnum);
		sem2.add(tnum1);
		jprep.add(sem1);
		jprep.add(sem2);
		jprep.add(year1);
		jparch.add(sp3);
		jparch.add(retrive);

    	
    	jp1.setLayout(null);
    	jp2.setLayout(null);
    	jphome.setLayout(null);
    	jpen.setLayout(null);
    	jpin.setLayout(null);
    	jprep.setLayout(null);
    	jpreg.setLayout(null);
    	jparch.setLayout(null);
    	sem1.setLayout(null);
    	sem2.setLayout(null);
    	
    	admin.add(jp1);
    	admin.add(jp2);
    	admin.add(jphome);
    	admin.add(jpen);
    	admin.add(jpin);
    	admin.add(jprep);
    	admin.add(jpreg);
    	admin.add(jparch);
    	jpen.setVisible(false);
    	jpin.setVisible(false);
    	jprep.setVisible(false);
    	jpreg.setVisible(false);
    	jparch.setVisible(false);
    	//----------------------------------------------endOfAdminMain--------------------------------------------------//
    	
    	//-----------------------------------------------newStudent-----------------------------------------------------//
    	save.setBounds(1150,600,100,30);
    	cncl.setBounds(1000,600,110,30);
    	
    	newstud.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			adm.setVisible(true);
    			nnext.setVisible(false);
    			bck.setVisible(false);
    			save.setVisible(true);
    			cncl.setVisible(true);
    		}
    	});
    	save.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			String sstat="Not Enrolled";
    			String sfn=fn.getText();
    			String sln=ln.getText();
    			String smn=mn.getText();
    			String sgen=sex.getSelectedItem().toString();
    			String ssem=nsem2.getSelectedItem().toString();
    			String scbyr=cbyr.getSelectedItem().toString();
    			String scb1=cb1.getSelectedItem().toString();
    			String scivil=civil.getSelectedItem().toString();
    			String scstrand=cstrand.getSelectedItem().toString();
    			String slrn=lrn.getText();
    			String speradd=peradd.getText();
    			String smobilenum=mobilenum.getText();
    			String semail=email.getText();
    			String sAGE=AGE.getText();
    			String sreligion=religion.getText();
    			String snationality=nationality.getText();
    			String spapa=papa.getText();
    			String smama=mama.getText();
    			String sbantay=bantay.getText();
    			String sw1=w1.getText();
  				String sw2=w2.getText();
    			String sw3=w3.getText();
    			String scn1=cn1.getText();
    			String scn2=cn2.getText();
    			String scn3=cn3.getText();
    			String sschl1=schl1.getText();
    			String syr1=yr1.getText();
    			String sschl2=schl2.getText();
    			String syr2=yr2.getText();
    			String sschl3=schl3.getText();
    			String syr3=yr3.getText();
    			String sschl4=schl4.getText();
    			String syr4=yr4.getText();
    			String req1,req2,req3,req4,req5;
    			String smon=mon.getSelectedItem().toString();
    			String sdy=day.getSelectedItem().toString();
    			String syear=yr.getSelectedItem().toString();
    			String bday1=smon+" "+sdy+","+syear;
				if(f138.isSelected()){
					req1="Complete";
				}
				else{
					req1="Inc";
				}
				if(f137.isSelected()){
					req2="Complete";
				}
				else{
					req2="Inc";
				}
				if(nso.isSelected()){
					req3="Complete";
				}
				else{
					req3="Inc";
				}
				if(dip.isSelected()){
					req4="Complete";
				}
				else{
					req4="Inc";
				}
				if(gMoral.isSelected()){
					req5="Complete";
				}
				else{
					req5="Inc";
				}
				
    			
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="insert into enroll (Status,LastName, FirstName, MidName, Sex, Course, Sem, SchoolYear, Age,Birthday, LRN, Address, MobileNum, Email, SHSStrand, Religion, Nationality, CivilStatus, FatherName, FatherOccu, ContactNumber,MotherName, MotherOccu, ContactNum,GuardianName, GuardianOccu, ConNum, ElemSchool, ElemYrGrad, SeconSchool, SecYrGrad, VocSchool, VocYrGrad, ColSchool, ColYrGrad,Form138,Form137,NSO,Diploma, GdMoral) values ('"+sstat+"','"+sln+"','"+sfn+"','"+smn+"','"+sgen+"','"+scb1+"','"+ssem+"','"+scbyr+"','"+sAGE+"','"+bday1+"','"+slrn+"','"+speradd+"','"+smobilenum+"','"+semail+"','"+scstrand+"','"+sreligion+"','"+snationality+"','"+scivil+"','"+spapa+"','"+sw1+"','"+scn1+"','"+smama+"','"+sw2+"','"+scn2+"','"+sbantay+"','"+sw3+"','"+scn3+"','"+sschl1+"','"+syr1+"','"+sschl2+"','"+syr2+"','"+sschl3+"','"+syr3+"','"+sschl4+"','"+syr4+"','"+req1+"','"+req2+"','"+req3+"','"+req4+"','"+req5+"')";
    				Statement st = con.createStatement();
    				int upd = st.executeUpdate(squery);
    				
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="select Status, StudentID, LastName, FirstName, MidName, Sex, Course, Sem, SchoolYear, Age from enroll where LastName='"+sln+"' and FirstName='"+sfn+"'";
					Statement st = con.createStatement();
    				ResultSet rs = st.executeQuery(squery);
    				
    				while(rs.next()){
    					String aStat=rs.getString("Status");
    					String aStudId=rs.getString("StudentID");
    					String aLn=rs.getString("LastName");
    					String aFn=rs.getString("FirstName");
    					String aMn=rs.getString("MidName");
    					String aSex=rs.getString("Sex");
    					String aCourse=rs.getString("Course");
    					String aSem=rs.getString("Sem");
    					String aSY=rs.getString("SchoolYear");
    					String aAge=rs.getString("Age");
    					
    					String addnew[]={aStat,aStudId,aLn,aFn,aMn,aSex,aCourse,aSem,aSY,aAge};
    					model.addRow(addnew);
    				}
    				JOptionPane.showMessageDialog(null, "Data add successfully!");
    				
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			
    			
    			
    			
    		ln.setText("");
    		fn.setText("");
    		mn.setText("");
    		lrn.setText("");
    		peradd.setText("");
    		mobilenum.setText("");
    		email.setText("");
    		AGE.setText("");
    		religion.setText("");
    		nationality.setText("");
    		papa.setText("");
    		mama.setText("");
    		bantay.setText("");
    		w1.setText("");
  			w2.setText("");
    		w3.setText("");
    		cn1.setText("");
    		cn2.setText("");
    		cn3.setText("");
    		schl1.setText("");
    		yr1.setText("");
    		schl2.setText("");
    		yr2.setText("");
    		schl3.setText("");
    		yr3.setText("");
    		schl4.setText("");
    		yr4.setText("");
    	
    			adm.setVisible(false);
    		}
    	});
    	save.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F7){
   					save.doClick();
   				}
   			}
   		});
    	cncl.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			adm.setVisible(false);
    		}
    	});
    	cncl.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F9){
   					backAd3.doClick();
   				}
   			}
   		});
    	
    	adm.add(save);
    	adm.setVisible(false);
    	adm.add(cncl);
    	//------------------------------------------------endNewStudent-------------------------------------------------//
    	
    	//------------------------------------------------EnrollmentStudentbutton---------------------------------------------//

    	pending.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			int numRow=enTable.getSelectedRow();
    			int dd2= JOptionPane.showConfirmDialog(null,"Are you sure you?","Confirmation",JOptionPane.YES_NO_OPTION);
    			String x=model.getValueAt(numRow,1).toString();
    			
    			if(dd2==0){
    				String xapp="Pending";
    				enTable.setValueAt(xapp,numRow,0);
    				try{	
    					Connection con = DriverManager.getConnection(dburl,userdb,passdb);
    					String squery="update enroll set Status='"+xapp+"' where StudentId='"+x+"'";
    					Statement st = con.createStatement();
						int upd=st.executeUpdate(squery);
				
    					JOptionPane.showMessageDialog(null, "successful!");
    						
    					st.close();
    					con.close();
   					}
    				catch(Exception ex){
    					JOptionPane.showMessageDialog(null,ex);
    				}	
    			}
    		}
    	});
    	pending.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F3){
   					pending.doClick();
   				}
   			}
   		});
    	approve.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			int numRow=enTable.getSelectedRow();
    			String x=model.getValueAt(numRow,1).toString();

    			int dd2= JOptionPane.showConfirmDialog(null,"Are you sure?","Confirmation",JOptionPane.YES_NO_OPTION);
    			if(dd2==0){
    			String xapp="Enrolled";
    			enTable.setValueAt(xapp,numRow,0);
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
    				String squery="update enroll set Status='"+xapp+"' where StudentId='"+x+"'";
    				Statement st = con.createStatement();
					int upd=st.executeUpdate(squery);
				
    				JOptionPane.showMessageDialog(null, "successful!");
    				
    				
    				st.close();
    				con.close();
   				}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}	
    				
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
    				String squery="select Status,StudentID, LastName, FirstName, MidName, Sex, Course, Sem, SchoolYear, Age,Birthday, LRN, Address, MobileNum, Email, SHSStrand, Religion, Nationality, CivilStatus, FatherName, FatherOccu, ContactNumber,MotherName, MotherOccu, ContactNum,GuardianName, GuardianOccu, ConNum, ElemSchool, ElemYrGrad, SeconSchool, SecYrGrad, VocSchool, VocYrGrad, ColSchool, ColYrGrad,Form138,Form137,NSO,Diploma, GdMoral from enroll where StudentID='"+x+"'";
					Statement st = con.createStatement();
					ResultSet rs=st.executeQuery(squery);
					while(rs.next()){
					
    					String sstat1=rs.getString("Status");
    					int sstudid=rs.getInt("StudentID");
    					String sfn1=rs.getString("LastName");
    					String sln1=rs.getString("FirstName");
    					String smn1=rs.getString("MidName");
    					String sgen1=rs.getString("Sex");
    					String ssem1=rs.getString("Sem");
    					String scbyr1=rs.getString("SchoolYear");
    					String scb11=rs.getString("Course");
    					String scivil1=rs.getString("CivilStatus");
    					String bday11=rs.getString("Birthday");
    					String scstrand1=rs.getString("SHSStrand");
    					String slrn1=rs.getString("LRN");
    					String speradd1=rs.getString("Address");
    					String smobilenum1=rs.getString("MobileNum");
    					String semail1=rs.getString("Email");
    					String sAGE1=rs.getString("Age");
    					String sreligion1=rs.getString("Religion");
    					String snationality1=rs.getString("Nationality");
    					String spapa1=rs.getString("FatherName");
    					String smama1=rs.getString("MotherName");
    					String sbantay1=rs.getString("GuardianName");
    					String sw11=rs.getString("FatherOccu");
  						String sw21=rs.getString("MotherOccu");
    					String sw31=rs.getString("GuardianOccu");
    					String scn11=rs.getString("ContactNumber");
    					String scn21=rs.getString("ContactNum");
    					String scn31=rs.getString("ConNum");
    					String sschl11=rs.getString("ElemSchool");
    					String syr11=rs.getString("ElemYrGrad");
    					String sschl21=rs.getString("SeconSchool");
    					String syr21=rs.getString("SecYrGrad");
    					String sschl31=rs.getString("VocSchool");
    					String syr31=rs.getString("VocYrGrad");
    					String sschl41=rs.getString("ColSchool");
    					String syr41=rs.getString("ColYrGrad");
   			 			String req11=rs.getString("Form137");
    					String req21=rs.getString("Form138");
    					String req31=rs.getString("NSO");
    					String req41=rs.getString("Diploma");
    					String req51=rs.getString("GdMoral");
   	
    				String squery1 ="insert into studinfo (Status,StudentID, LastName, FirstName, MidName, Sex, Course, Sem, SchoolYear, Age,Birthday, LRN, Address, MobileNum, Email, SHSStrand, Religion, Nationality, CivilStatus, FatherName, FatherOccu, ContactNumber,MotherName, MotherOccu, ContactNum,GuardianName, GuardianOccu, ConNum, ElemSchool, ElemYrGrad, SeconSchool, SecYrGrad, VocSchool, VocYrGrad, ColSchool, ColYrGrad,Form138,Form137,NSO,Diploma, GdMoral) values ('"+xapp+"','"+sstudid+"','"+sln1+"','"+sfn1+"','"+smn1+"','"+sgen1+"','"+scb11+"','"+ssem1+"','"+scbyr1+"','"+sAGE1+"','"+bday11+"','"+slrn1+"','"+speradd1+"','"+smobilenum1+"','"+semail1+"','"+scstrand1+"','"+sreligion1+"','"+snationality1+"','"+scivil1+"','"+spapa1+"','"+sw11+"','"+scn11+"','"+smama1+"','"+sw21+"','"+scn21+"','"+sbantay1+"','"+sw31+"','"+scn31+"','"+sschl11+"','"+syr11+"','"+sschl21+"','"+syr21+"','"+sschl31+"','"+syr31+"','"+sschl41+"','"+syr41+"','"+req11+"','"+req21+"','"+req31+"','"+req41+"','"+req51+"')";
					int upd=st.executeUpdate(squery1);
				
    				JOptionPane.showMessageDialog(null, "add successful!");
    				
    				}
    				rs.close();
    				st.close();
    				con.close();
    				
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			String l3=model.getValueAt(numRow,0).toString();
    			String m3=model.getValueAt(numRow,1).toString();
    			String n3=model.getValueAt(numRow,2).toString();
    			String o3=model.getValueAt(numRow,3).toString();
    			String p3=model.getValueAt(numRow,4).toString();
    			String q3=model.getValueAt(numRow,5).toString();
    			String r3=model.getValueAt(numRow,6).toString();
    			String s3=model.getValueAt(numRow,7).toString();
    			String t3=model.getValueAt(numRow,8).toString();
    			String u3=model.getValueAt(numRow,9).toString();
    			String add[]={l3,m3,n3,o3,p3,q3,r3,s3,t3,u3};
    			model2.addRow(add);
    			}
    		}
    	});
    	approve.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F4){
   					approve.doClick();
   				}
   			}
   		});
    	dropped.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			int numRow=enTable.getSelectedRow();
    			int dd2= JOptionPane.showConfirmDialog(null,"Are you sure?","Confirmation",JOptionPane.YES_NO_OPTION);
    			String x=model.getValueAt(numRow,1).toString();
    			
    			if(dd2==0){
    				String xapp="Dropped";
    				enTable.setValueAt(xapp,numRow,0);
    				try{	
    					Connection con = DriverManager.getConnection(dburl,userdb,passdb);
    					String squery="update enroll set Status='"+xapp+"' where StudentId='"+x+"'";
    					Statement st = con.createStatement();
						int upd=st.executeUpdate(squery);
				
    					JOptionPane.showMessageDialog(null, "successful!");
    						
    					st.close();
    					con.close();
   					}
    				catch(Exception ex){
    					JOptionPane.showMessageDialog(null,ex);
    				}	
    			}
    		}
    	});
    	dropped.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F5){
   					dropped.doClick();
   				}
   			}
   		});
    	archive.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			int rownum=inTable.getSelectedRow();
    			String x=model2.getValueAt(rownum,1).toString();
    			int dd= JOptionPane.showConfirmDialog(archive,"Are you sure you want to delete?","Delete",JOptionPane.YES_NO_OPTION);
    			if(dd==0){
    				
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
    				String squery="select Status,StudentID, LastName, FirstName, MidName, Sex, Course, Sem, SchoolYear, Age,Birthday, LRN, Address, MobileNum, Email, SHSStrand, Religion, Nationality, CivilStatus, FatherName, FatherOccu, ContactNumber,MotherName, MotherOccu, ContactNum,GuardianName, GuardianOccu, ConNum, ElemSchool, ElemYrGrad, SeconSchool, SecYrGrad, VocSchool, VocYrGrad, ColSchool, ColYrGrad,Form138,Form137,NSO,Diploma, GdMoral from studinfo where StudentID='"+x+"'";
					Statement st = con.createStatement();
					ResultSet rs=st.executeQuery(squery);
					while(rs.next()){
					
    					String sstat1=rs.getString("Status");
    					int sstudid=rs.getInt("StudentID");
    					String sfn1=rs.getString("LastName");
    					String sln1=rs.getString("FirstName");
    					String smn1=rs.getString("MidName");
    					String sgen1=rs.getString("Sex");
    					String ssem1=rs.getString("Sem");
    					String scbyr1=rs.getString("SchoolYear");
    					String scb11=rs.getString("Course");
    					String scivil1=rs.getString("CivilStatus");
    					String bday11=rs.getString("Birthday");
    					String scstrand1=rs.getString("SHSStrand");
    					String slrn1=rs.getString("LRN");
    					String speradd1=rs.getString("Address");
    					String smobilenum1=rs.getString("MobileNum");
    					String semail1=rs.getString("Email");
    					String sAGE1=rs.getString("Age");
    					String sreligion1=rs.getString("Religion");
    					String snationality1=rs.getString("Nationality");
    					String spapa1=rs.getString("FatherName");
    					String smama1=rs.getString("MotherName");
    					String sbantay1=rs.getString("GuardianName");
    					String sw11=rs.getString("FatherOccu");
  						String sw21=rs.getString("MotherOccu");
    					String sw31=rs.getString("GuardianOccu");
    					String scn11=rs.getString("ContactNumber");
    					String scn21=rs.getString("ContactNum");
    					String scn31=rs.getString("ConNum");
    					String sschl11=rs.getString("ElemSchool");
    					String syr11=rs.getString("ElemYrGrad");
    					String sschl21=rs.getString("SeconSchool");
    					String syr21=rs.getString("SecYrGrad");
    					String sschl31=rs.getString("VocSchool");
    					String syr31=rs.getString("VocYrGrad");
    					String sschl41=rs.getString("ColSchool");
    					String syr41=rs.getString("ColYrGrad");
   			 			String req11=rs.getString("Form137");
    					String req21=rs.getString("Form138");
    					String req31=rs.getString("NSO");
    					String req41=rs.getString("Diploma");
    					String req51=rs.getString("GdMoral");
    					
    					try{	
    						Connection conn = DriverManager.getConnection(dburl,userdb,passdb);
    						String squery1 ="insert into archive (Status,StudentID, LastName, FirstName, MidName, Sex, Course, Sem, SchoolYear, Age,Birthday, LRN, Address, MobileNum, Email, SHSStrand, Religion, Nationality, CivilStatus, FatherName, FatherOccu, ContactNumber,MotherName, MotherOccu, ContactNum,GuardianName, GuardianOccu, ConNum, ElemSchool, ElemYrGrad, SeconSchool, SecYrGrad, VocSchool, VocYrGrad, ColSchool, ColYrGrad,Form138,Form137,NSO,Diploma, GdMoral) values ('"+sstat1+"','"+sstudid+"','"+sln1+"','"+sfn1+"','"+smn1+"','"+sgen1+"','"+scb11+"','"+ssem1+"','"+scbyr1+"','"+sAGE1+"','"+bday11+"','"+slrn1+"','"+speradd1+"','"+smobilenum1+"','"+semail1+"','"+scstrand1+"','"+sreligion1+"','"+snationality1+"','"+scivil1+"','"+spapa1+"','"+sw11+"','"+scn11+"','"+smama1+"','"+sw21+"','"+scn21+"','"+sbantay1+"','"+sw31+"','"+scn31+"','"+sschl11+"','"+syr11+"','"+sschl21+"','"+syr21+"','"+sschl31+"','"+syr31+"','"+sschl41+"','"+syr41+"','"+req11+"','"+req21+"','"+req31+"','"+req41+"','"+req51+"')";
							Statement st1 = conn.createStatement();
							int upd=st1.executeUpdate(squery1);
    						JOptionPane.showMessageDialog(null, "add successful!");
    				
    						st1.close();
    						conn.close();
    					}
    					catch(Exception ex){
    						JOptionPane.showMessageDialog(null,ex);
    					}
   	
    				
    				}
    				rs.close();
    				st.close();
    				con.close();
    				
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
    				String squery=" delete from studinfo where StudentID='"+x+"'";
					Statement st = con.createStatement();
					int upd=st.executeUpdate(squery);
					
    				JOptionPane.showMessageDialog(null, "add successful!");
    				
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			String l=model2.getValueAt(rownum,0).toString();
    			String m=model2.getValueAt(rownum,1).toString();
    			String n=model2.getValueAt(rownum,2).toString();
    			String o=model2.getValueAt(rownum,3).toString();
    			String p=model2.getValueAt(rownum,4).toString();
    			String q=model2.getValueAt(rownum,5).toString();
    			String r=model2.getValueAt(rownum,6).toString();
    			String s=model2.getValueAt(rownum,7).toString();
    			String t=model2.getValueAt(rownum,8).toString();
    			String u=model2.getValueAt(rownum,9).toString();
    			String del[]={l,m,n,o,p,q,r,s,t,u};
    			model3.addRow(del);
    			model2.removeRow(rownum);
    		}
    			
    		}
    	});
    	archive.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F12){
   					archive.doClick();
   				}
   			}
   		});
    	retrive.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			int rownum1=archTable.getSelectedRow();
    			String x=model3.getValueAt(rownum1,1).toString();
    			int ddd= JOptionPane.showConfirmDialog(archive,"Are you sure you want to retrieve?","Retrieve",JOptionPane.YES_NO_OPTION);
    			if(ddd==0){
    			
    				
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
    				String squery="select * from archive where StudentID='"+x+"'";
					Statement st = con.createStatement();
					ResultSet rs=st.executeQuery(squery);
					while(rs.next()){
					
    					String sstat1=rs.getString("Status");
    					int sstudid=rs.getInt("StudentID");
    					String sfn1=rs.getString("LastName");
    					String sln1=rs.getString("FirstName");
    					String smn1=rs.getString("MidName");
    					String sgen1=rs.getString("Sex");
    					String ssem1=rs.getString("Sem");
    					String scbyr1=rs.getString("SchoolYear");
    					String scb11=rs.getString("Course");
    					String scivil1=rs.getString("CivilStatus");
    					String bday11=rs.getString("Birthday");
    					String scstrand1=rs.getString("SHSStrand");
    					String slrn1=rs.getString("LRN");
    					String speradd1=rs.getString("Address");
    					String smobilenum1=rs.getString("MobileNum");
    					String semail1=rs.getString("Email");
    					String sAGE1=rs.getString("Age");
    					String sreligion1=rs.getString("Religion");
    					String snationality1=rs.getString("Nationality");
    					String spapa1=rs.getString("FatherName");
    					String smama1=rs.getString("MotherName");
    					String sbantay1=rs.getString("GuardianName");
    					String sw11=rs.getString("FatherOccu");
  						String sw21=rs.getString("MotherOccu");
    					String sw31=rs.getString("GuardianOccu");
    					String scn11=rs.getString("ContactNumber");
    					String scn21=rs.getString("ContactNum");
    					String scn31=rs.getString("ConNum");
    					String sschl11=rs.getString("ElemSchool");
    					String syr11=rs.getString("ElemYrGrad");
    					String sschl21=rs.getString("SeconSchool");
    					String syr21=rs.getString("SecYrGrad");
    					String sschl31=rs.getString("VocSchool");
    					String syr31=rs.getString("VocYrGrad");
    					String sschl41=rs.getString("ColSchool");
    					String syr41=rs.getString("ColYrGrad");
   			 			String req11=rs.getString("Form137");
    					String req21=rs.getString("Form138");
    					String req31=rs.getString("NSO");
    					String req41=rs.getString("Diploma");
    					String req51=rs.getString("GdMoral");
    					
    					try{	
    					Connection conn = DriverManager.getConnection(dburl,userdb,passdb);
    					String squery1 ="insert into studinfo (Status,StudentID, LastName, FirstName, MidName, Sex, Course, Sem, SchoolYear, Age,Birthday, LRN, Address, MobileNum, Email, SHSStrand, Religion, Nationality, CivilStatus, FatherName, FatherOccu, ContactNumber,MotherName, MotherOccu, ContactNum,GuardianName, GuardianOccu, ConNum, ElemSchool, ElemYrGrad, SeconSchool, SecYrGrad, VocSchool, VocYrGrad, ColSchool, ColYrGrad,Form138,Form137,NSO,Diploma, GdMoral) values ('"+sstat1+"','"+sstudid+"','"+sln1+"','"+sfn1+"','"+smn1+"','"+sgen1+"','"+scb11+"','"+ssem1+"','"+scbyr1+"','"+sAGE1+"','"+bday11+"','"+slrn1+"','"+speradd1+"','"+smobilenum1+"','"+semail1+"','"+scstrand1+"','"+sreligion1+"','"+snationality1+"','"+scivil1+"','"+spapa1+"','"+sw11+"','"+scn11+"','"+smama1+"','"+sw21+"','"+scn21+"','"+sbantay1+"','"+sw31+"','"+scn31+"','"+sschl11+"','"+syr11+"','"+sschl21+"','"+syr21+"','"+sschl31+"','"+syr31+"','"+sschl41+"','"+syr41+"','"+req11+"','"+req21+"','"+req31+"','"+req41+"','"+req51+"')";
						Statement st1 = conn.createStatement();
						int upd=st1.executeUpdate(squery1);
					
    				
    					st1.close();
    					conn.close();
    					}
    					catch(Exception ex){
    					JOptionPane.showMessageDialog(null,ex);
    					}
   
    				}
    				
    				JOptionPane.showMessageDialog(null, "add successful!");
    				rs.close();
    				st.close();
    				con.close();
    				
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			
    			
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
    				String squery=" delete from archive where StudentID='"+x+"'";
					Statement st = con.createStatement();
					int upd=st.executeUpdate(squery);
					
    				JOptionPane.showMessageDialog(null, "deleted successful!");
    				
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			String l3=model3.getValueAt(rownum1,0).toString();
    			String m3=model3.getValueAt(rownum1,1).toString();
    			String n3=model3.getValueAt(rownum1,2).toString();
    			String o3=model3.getValueAt(rownum1,3).toString();
    			String p3=model3.getValueAt(rownum1,4).toString();
    			String q3=model3.getValueAt(rownum1,5).toString();
    			String r3=model3.getValueAt(rownum1,6).toString();
    			String s3=model3.getValueAt(rownum1,7).toString();
    			String t3=model3.getValueAt(rownum1,8).toString();
    			String u3=model3.getValueAt(rownum1,9).toString();
    			String del1[]={l3,m3,n3,o3,p3,q3,r3,s3,t3,u3};
    			model2.addRow(del1);
    				model3.removeRow(rownum1);
    		}
    			
    		}
    	});
    	retrive.addKeyListener(new KeyAdapter(){
    	
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F6){
   					retrive.doClick();
   				}
   			}
   		});
   		
   		/**search.addActionListener(new ActionListener(){
   		
   			private void sear1ActionPerformed(java.awt.event.ActionEvent evt){                                            
    		TableRowSortermodel sorter = new TableRowSortermodel(((DefaultTableModel)enTable.getModel()));
    		sorter.setRowFilter(RowFilter.regexFilter(sear1.getText()));

    		enTable.setRowSorter(sorter);
			} 
   		});**/
   		
    	
    	//------------------------------------------------endOfEnrollmentStudentButton----------------------------------------//
    	//------------------------------------------------STUDENT-VIEW----------------------------------------//
    	
    	JLabel labelStudent = new JLabel("STUDENT INFORMATION");
    	JLabel vID=new JLabel("Student ID: ");
    	JLabel vCourse=new JLabel("Course: ");
    	JLabel vSem=new JLabel("Semester");
    	JLabel vSchYr=new JLabel("School Year: ");
    	JLabel vLname=new JLabel("Last Name: ");
    	JLabel vFname=new JLabel("First Name: ");
    	JLabel vMname=new JLabel("Middle Name: ");
    	JLabel vAge=new JLabel("Age: ");
    	JLabel vSex=new JLabel("Sex: ");
    	JLabel vadress=new JLabel("Address: ");
    	JLabel vCnum=new JLabel("Mobile Number: ");
    	JLabel vEmail=new JLabel("Email: ");
    	JLabel vBday=new JLabel("Date of Birth: ");
    	JLabel vReli=new JLabel("Religion: ");
    	JLabel vNat=new JLabel("Nationality: ");
    	JLabel vCStat=new JLabel("Civil Status: ");
    	JLabel vPapa=new JLabel("Father's Name: ");
    	JLabel vPaNum=new JLabel("Contact Number: ");
    	JLabel vMama=new JLabel("Mother's Name: ");
    	JLabel vMaNum=new JLabel("Contact Number: ");
    	JLabel vReq = new JLabel("REQUIREMENTS");
    	JPanel vPanel = new JPanel();
    	vPanel.setBorder(BorderFactory.createEtchedBorder());
    	JLabel vF137=new JLabel("Form137: ");
    	JLabel vF138=new JLabel("Form 138: ");
    	JLabel vNso=new JLabel("Nso/Psa: ");
    	JLabel vDip=new JLabel("Diploma: ");
    	JLabel vGmoral=new JLabel("Good Moral: ");
    	JLabel vInfo=new JLabel("GUARDIAN'S INFORMATION");
    	
    	labelStudent.setBounds(450,30,400,40);
    	vID.setBounds(50,100,250,40);
    	vCourse.setBounds(350,100,250,40);
    	vSem.setBounds(650,100,250,40);
    	vSchYr.setBounds(950,100,250,40);
    	vLname.setBounds(50,150,300,40);
    	vFname.setBounds(350,150,300,40);
    	vMname.setBounds(650,150,300,40);
    	vadress.setBounds(50,200,900,40);
    	vSex.setBounds(50,250,100,40);
    	vAge.setBounds(150,250,100,40);
    	vBday.setBounds(250,250,200,40);
    	vCnum.setBounds(50,300,200,40);
    	vEmail.setBounds(250,300,200,40);
    	vReli.setBounds(50,350,200,40);
    	vNat.setBounds(250,350,200,40);
    	vCStat.setBounds(450,350,200,40);
    	vInfo.setBounds(50,400,300,40);
    	vPapa.setBounds(50,450,400,40);
    	vPaNum.setBounds(50,500,300,40);
    	vMama.setBounds(50,550,400,40);
    	vMaNum.setBounds(50,600,400,40);
    	vReq.setBounds(875,265,200,40);
    	vPanel.setBounds(700,300,450,300);
    	vF137.setBounds(50,20,400,40);
    	vF138.setBounds(50,70,400,40);
    	vNso.setBounds(50,120,400,40);
    	vDip.setBounds(50,170,400,40);
    	vGmoral.setBounds(50,220,400,40);
    	vPapa.setBorder(BorderFactory.createEtchedBorder());
    	vPaNum.setBorder(BorderFactory.createEtchedBorder());
    	vMama.setBorder(BorderFactory.createEtchedBorder());
    	vMaNum.setBorder(BorderFactory.createEtchedBorder());
    	vCStat.setBorder(BorderFactory.createEtchedBorder());
    	vNat.setBorder(BorderFactory.createEtchedBorder());
    	vReli.setBorder(BorderFactory.createEtchedBorder());
    	vID.setBorder(BorderFactory.createEtchedBorder());
    	vCourse.setBorder(BorderFactory.createEtchedBorder());
    	vSem.setBorder(BorderFactory.createEtchedBorder());
    	vSchYr.setBorder(BorderFactory.createEtchedBorder());
    	vLname.setBorder(BorderFactory.createEtchedBorder());
    	vFname.setBorder(BorderFactory.createEtchedBorder());
    	vMname.setBorder(BorderFactory.createEtchedBorder());
    	vAge.setBorder(BorderFactory.createEtchedBorder());
    	vSex.setBorder(BorderFactory.createEtchedBorder());
    	vEmail.setBorder(BorderFactory.createEtchedBorder());
    	vadress.setBorder(BorderFactory.createEtchedBorder());
    	vCnum.setBorder(BorderFactory.createEtchedBorder());
    	vBday.setBorder(BorderFactory.createEtchedBorder());
    	vPanel.setBorder(BorderFactory.createEtchedBorder());
    	labelStudent.setFont(new Font("Modern No. 20", Font.BOLD,30));
    	vInfo.setFont(new Font("Modern No. 20", Font.BOLD,15));
    	vReq.setFont(new Font("Modern No. 20", Font.BOLD,15));
    	try{
   			viewStudent.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\greenBackground1.jpg")))));
   			}
   		catch(IOException e){
   			e.printStackTrace();
   			}
   			
    	vPanel.add(vF137);
    	vPanel.add(vF138);
    	vPanel.add(vNso);
    	vPanel.add(vDip);
    	vPanel.add(vGmoral);
    	viewStudent.add(vPanel);
    	viewStudent.add(vReq);
    	viewStudent.add(labelStudent);
    	viewStudent.add(vInfo);
    	viewStudent.add(vID);
    	viewStudent.add(vCourse);
    	viewStudent.add(vSem);
    	viewStudent.add(vSchYr);
    	viewStudent.add(vLname);
    	viewStudent.add(vFname);
    	viewStudent.add(vMname);
    	viewStudent.add(vAge);
    	viewStudent.add(vSex);
    	viewStudent.add(vadress);
    	viewStudent.add(vCnum);
    	viewStudent.add(vEmail);
    	viewStudent.add(vBday);
    	viewStudent.add(vReli);
    	viewStudent.add(vNat);
    	viewStudent.add(vCStat);
    	viewStudent.add(vPapa);
    	viewStudent.add(vPaNum);
    	viewStudent.add(vMama);
    	viewStudent.add(vMaNum);
    	
    	
    	vPanel.setLayout(null);
    	
    	view.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			viewStudent.setVisible(true);
    			int numr=enTable.getSelectedRow();
    			String x=model.getValueAt(numr,1).toString();
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="select StudentID,LastName,FirstName, MidName, Sex, Course, Sem, SchoolYear, Age, Address, MobileNum, Email, Birthday, Religion, Nationality, CivilStatus, FatherName, ContactNumber, MotherName, ContactNum, Form137, Form138, NSO, Diploma, GdMoral from enroll where StudentID='"+x+"'";
    				Statement st = con.createStatement();
    				ResultSet rs = st.executeQuery(squery);
    				
    				while(rs.next()){
    					int xID=rs.getInt("StudentID");
    					String xSem=rs.getString("Sem");
    					String xCourse=rs.getString("Course");
    					String xSchYr=rs.getString("SchoolYear");
    					String xLname=rs.getString("LastName");
    					String xFname=rs.getString("FirstName");
    					String xMname=rs.getString("MidName");
    					String xadress=rs.getString("Address");
    					String xSex=rs.getString("Sex");
    					String xAge=rs.getString("Age");
    					String xBday=rs.getString("Birthday");
    					String xCnum=rs.getString("MobileNum");
    					String xEmail=rs.getString("Email");
    					String xReli=rs.getString("Religion");
    					String xNat=rs.getString("Nationality");
    					String xCStat=rs.getString("CivilStatus");
    					String xPapa=rs.getString("FatherName");
    					String xPaNum=rs.getString("ContactNumber");
    					String xMama=rs.getString("MotherName");
    					String xMaNum=rs.getString("ContactNum");
    					String xF137=rs.getString("Form137");
    					String xF138=rs.getString("Form138");
    					String xNso=rs.getString("NSO");
    					String xDip=rs.getString("Diploma");
    					String xGmoral=rs.getString("GdMoral");
    						
    					vID.setText("Student ID:	"+" "+" "+String.valueOf(xID));
    					vSem.setText("Semester: "+" "+" "+xSem);
    					vSchYr.setText("School Year: "+" "+" "+xSchYr);
    					vCourse.setText("Course: "+" "+" "+xCourse);
    					vLname.setText("Last Name:	"+" "+" "+xLname);
    					vFname.setText("First Name:	"+" "+" "+xFname);
    					vMname.setText("Middle Name:	"+" "+" "+xMname);
    					vadress.setText("Address:	"+" "+" "+xadress);
    					vSex.setText("Sex:	"+" "+" "+xSex);
    					vAge.setText("Age:	"+" "+" "+xAge);
    					vBday.setText("Birthday:	"+" "+" "+xBday);
    					vCnum.setText("Contact Number:	"+" "+" "+xCnum);
    					vEmail.setText("Email:	"+" "+" "+xEmail);
    					vReli.setText("Religion:	"+" "+" "+xReli);
    					vNat.setText("Nationality:	"+" "+" "+xNat);
    					vCStat.setText("Civil Status:	"+" "+" "+xCStat);
    					vPapa.setText("Father's Name:	"+" "+" "+xPapa);
    					vPaNum.setText("Contact Number:	"+" "+" "+xPaNum);
    					vMama.setText("Mother's Name:	"+" "+" "+xMama);
    					vMaNum.setText("Contact Numbmer:	"+" "+" "+xMaNum);
    					vF137.setText("Form137:	"+" "+" "+xF137);
    					vF138.setText("Form138:	"+" "+" "+xF138);
    					vNso.setText("NSO:	"+" "+" "+xNso);
    					vDip.setText("Diploma:	"+" "+" "+xDip);
    					vGmoral.setText("Good Moral:	"+" "+" "+xGmoral);
    				}
    				
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    		}
    	});
    	
    	search.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			
    			viewStudent.setVisible(true);
    			String xsearch=sear.getText();
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="select StudentID,LastName,FirstName, MidName, Sex, Course, Sem, SchoolYear, Age, Address, MobileNum, Email, Birthday, Religion, Nationality, CivilStatus, FatherName, ContactNumber, MotherName, ContactNum, Form137, Form138, NSO, Diploma, GdMoral from enroll where StudentID='"+xsearch+"' or LastName='"+xsearch+"' or FirstName='"+xsearch+"'";
    				Statement st = con.createStatement();
    				ResultSet rs = st.executeQuery(squery);
    			
    				while(rs.next()){
    					int xID=rs.getInt("StudentID");
    					String xSem=rs.getString("Sem");
    					String xCourse=rs.getString("Course");
    					String xSchYr=rs.getString("SchoolYear");
    					String xLname=rs.getString("LastName");
    					String xFname=rs.getString("FirstName");
    					String xMname=rs.getString("MidName");
    					String xadress=rs.getString("Address");
    					String xSex=rs.getString("Sex");
    					String xAge=rs.getString("Age");
    					String xBday=rs.getString("Birthday");
    					String xCnum=rs.getString("MobileNum");
    					String xEmail=rs.getString("Email");
    					String xReli=rs.getString("Religion");
    					String xNat=rs.getString("Nationality");
    					String xCStat=rs.getString("CivilStatus");
    					String xPapa=rs.getString("FatherName");
    					String xPaNum=rs.getString("ContactNumber");
    					String xMama=rs.getString("MotherName");
    					String xMaNum=rs.getString("ContactNum");
    					String xF137=rs.getString("Form137");
    					String xF138=rs.getString("Form138");
    					String xNso=rs.getString("NSO");
    					String xDip=rs.getString("Diploma");
    					String xGmoral=rs.getString("GdMoral");
    				
    				
    				
    					vID.setText("Student ID:	"+" "+" "+String.valueOf(xID));
    					vSem.setText("Semester: "+" "+" "+xSem);
    					vSchYr.setText("School Year: "+" "+" "+xSchYr);
    					vCourse.setText("Course: "+" "+" "+xCourse);
    					vLname.setText("Last Name:	"+" "+" "+xLname);
    					vFname.setText("First Name:	"+" "+" "+xFname);
    					vMname.setText("Middle Name:	"+" "+" "+xMname);
    					vadress.setText("Address:	"+" "+" "+xadress);
    					vSex.setText("Sex:	"+" "+" "+xSex);
    					vAge.setText("Age:	"+" "+" "+xAge);
    					vBday.setText("Birthday:	"+" "+" "+xBday);
    					vCnum.setText("Contact Number:	"+" "+" "+xCnum);
    					vEmail.setText("Email:	"+" "+" "+xEmail);
    					vReli.setText("Religion:	"+" "+" "+xReli);
    					vNat.setText("Nationality:	"+" "+" "+xNat);
    					vCStat.setText("Civil Status:	"+" "+" "+xCStat);
    					vPapa.setText("Father's Name:	"+" "+" "+xPapa);
    					vPaNum.setText("Contact Number:	"+" "+" "+xPaNum);
    					vMama.setText("Mother's Name:	"+" "+" "+xMama);
    					vMaNum.setText("Contact Numbmer:	"+" "+" "+xMaNum);
    					vF137.setText("Form137:	"+" "+" "+xF137);
    					vF138.setText("Form138:	"+" "+" "+xF138);
    					vNso.setText("NSO:	"+" "+" "+xNso);
    					vDip.setText("Diploma:	"+" "+" "+xDip);
    					vGmoral.setText("Good Moral:	"+" "+" "+xGmoral);
    				}
    				
    				
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    
    		}
    	});
    	
    	search1.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			
    			viewStudent.setVisible(true);
    			String xsearch=sear1.getText();
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="select StudentID,LastName,FirstName, MidName, Sex, Course, Sem, SchoolYear, Age, Address, MobileNum, Email, Birthday, Religion, Nationality, CivilStatus, FatherName, ContactNumber, MotherName, ContactNum, Form137, Form138, NSO, Diploma, GdMoral from studinfo where StudentID='"+xsearch+"' or LastName='"+xsearch+"' or FirstName='"+xsearch+"'";
    				Statement st = con.createStatement();
    				ResultSet rs = st.executeQuery(squery);
   
    				while(rs.next()){
    					int xID=rs.getInt("StudentID");
    					String xSem=rs.getString("Sem");
    					String xCourse=rs.getString("Course");
    					String xSchYr=rs.getString("SchoolYear");
    					String xLname=rs.getString("LastName");
    					String xFname=rs.getString("FirstName");
    					String xMname=rs.getString("MidName");
    					String xadress=rs.getString("Address");
    					String xSex=rs.getString("Sex");
    					String xAge=rs.getString("Age");
    					String xBday=rs.getString("Birthday");
    					String xCnum=rs.getString("MobileNum");
    					String xEmail=rs.getString("Email");
    					String xReli=rs.getString("Religion");
    					String xNat=rs.getString("Nationality");
    					String xCStat=rs.getString("CivilStatus");
    					String xPapa=rs.getString("FatherName");
    					String xPaNum=rs.getString("ContactNumber");
    					String xMama=rs.getString("MotherName");
    					String xMaNum=rs.getString("ContactNum");
    					String xF137=rs.getString("Form137");
    					String xF138=rs.getString("Form138");
    					String xNso=rs.getString("NSO");
    					String xDip=rs.getString("Diploma");
    					String xGmoral=rs.getString("GdMoral");
    				
    				
    				
    					vID.setText("Student ID:	"+" "+" "+String.valueOf(xID));
    					vSem.setText("Semester: "+" "+" "+xSem);
    					vSchYr.setText("School Year: "+" "+" "+xSchYr);
    					vCourse.setText("Course: "+" "+" "+xCourse);
    					vLname.setText("Last Name:	"+" "+" "+xLname);
    					vFname.setText("First Name:	"+" "+" "+xFname);
    					vMname.setText("Middle Name:	"+" "+" "+xMname);
    					vadress.setText("Address:	"+" "+" "+xadress);
    					vSex.setText("Sex:	"+" "+" "+xSex);
    					vAge.setText("Age:	"+" "+" "+xAge);
    					vBday.setText("Birthday:	"+" "+" "+xBday);
    					vCnum.setText("Contact Number:	"+" "+" "+xCnum);
    					vEmail.setText("Email:	"+" "+" "+xEmail);
    					vReli.setText("Religion:	"+" "+" "+xReli);
    					vNat.setText("Nationality:	"+" "+" "+xNat);
    					vCStat.setText("Civil Status:	"+" "+" "+xCStat);
    					vPapa.setText("Father's Name:	"+" "+" "+xPapa);
    					vPaNum.setText("Contact Number:	"+" "+" "+xPaNum);
    					vMama.setText("Mother's Name:	"+" "+" "+xMama);
    					vMaNum.setText("Contact Numbmer:	"+" "+" "+xMaNum);
    					vF137.setText("Form137:	"+" "+" "+xF137);
    					vF138.setText("Form138:	"+" "+" "+xF138);
    					vNso.setText("NSO:	"+" "+" "+xNso);
    					vDip.setText("Diploma:	"+" "+" "+xDip);
    					vGmoral.setText("Good Moral:	"+" "+" "+xGmoral);
    				}
    				
    				
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    
    		}
    	});
    	
    	
    	//------------------------------------------------endOfSTUDENT-VIEW----------------------------------------//
    	
    	//-------------------------------------------------UPDATEButton------------------------------------------------------//
    	String choices1[]={"BSIT","BSCS","BSPSYC","BSEED","BSHRM","BSBM","ABJOURN","BSHM","BSOA","BENT"};
    	String schoolYr1[]={"2016-2017","2017-2018","2018-2019","2019-2020","2021-2022"};
    	String seme1[]={"1st Sem", "2nd Sem"};
    	
    	JLabel uplabelStudent = new JLabel("STUDENT INFORMATION");
    	JLabel upID=new JLabel("Student ID: ");
    	JLabel upLname=new JLabel("Last Name: ");
    	JLabel upFname=new JLabel("First Name: ");
    	JLabel upMname=new JLabel("Middle Name: ");
    	JLabel upAge=new JLabel("Age: ");
    	JLabel upSex=new JLabel("Sex: ");
    	JLabel upCourse = new JLabel("Course: ");
    	JLabel upSem = new JLabel("Semester: ");
    	JLabel upSchYr = new JLabel("School Year: ");
    	JLabel upadress=new JLabel("Address: ");
    	JLabel upCnum=new JLabel("Mobile Number: ");
    	JLabel upEmail=new JLabel("Email: ");
    	JLabel upBday=new JLabel("Date of Birth: ");
    	JLabel upReli=new JLabel("Religion: ");
    	JLabel upNat=new JLabel("Nationality: ");
    	JLabel upCStat=new JLabel("Civil Status: ");
    	JLabel upPapa=new JLabel("Father's Name: ");
    	JLabel upPaNum=new JLabel("Contact Number: ");
    	JLabel upMama=new JLabel("Mother's Name: ");
    	JLabel upMaNum=new JLabel("Contact Number: ");
    	JPanel upPanel = new JPanel();
    	upPanel.setBorder(BorderFactory.createEtchedBorder());
    	JLabel upF137=new JLabel("Form137: ");
    	JLabel upF138=new JLabel("Form 138: ");
    	JLabel upNso=new JLabel("Nso/Psa: ");
    	JLabel upDip=new JLabel("Diploma: ");
    	JLabel upGmoral=new JLabel("Good Moral: ");
    	JLabel upInfo=new JLabel("GUARDIAN'S INFORMATION");
    	JLabel upReq = new JLabel("REQUIREMENTS");
    	
    	JTextField uID=new JTextField();
    	JComboBox uCourse=new JComboBox(choices1);
    	JComboBox uSchYr=new JComboBox(schoolYr1);
    	JComboBox uSem=new JComboBox(seme1);
    	JTextField uLname=new JTextField();
    	JTextField uFname=new JTextField();
    	JTextField uMname=new JTextField();
    	JTextField uAge=new JTextField();
    	JTextField uSex=new JTextField();
    	JTextField uadress=new JTextField();
    	JTextField uCnum=new JTextField();
    	JTextField uEmail=new JTextField();;
    	JTextField uBday=new JTextField();
    	JTextField uReli=new JTextField();
    	JTextField uNat=new JTextField();
    	JTextField uCStat=new JTextField();
    	JTextField uPapa=new JTextField();
    	JTextField uPaNum=new JTextField();
    	JTextField uMama=new JTextField();
    	JTextField uMaNum=new JTextField();
    	JTextField uF137=new JTextField();
    	JTextField uF138=new JTextField();
    	JTextField uNso=new JTextField();
    	JTextField uDip=new JTextField();
    	JTextField uGmoral=new JTextField();
    	
    	upReq.setBounds(875,250,200,40);
    	uplabelStudent.setBounds(450,30,500,40);
    	upID.setBounds(50,100,100,40);
    	uID.setBounds(130,100,200,40);
    	upCourse.setBounds(360,100,100,40);
    	uCourse.setBounds(440,100,100,40);
    	upSchYr.setBounds(660,100,100,40);
    	uSchYr.setBounds(750,100,100,40);
    	upSem.setBounds(950,100,100,40);
    	uSem.setBounds(1030,100,100,40);
    	upLname.setBounds(50,150,100,40);
    	uLname.setBounds(130,150,200,40);
    	upFname.setBounds(360,150,100,40);
    	uFname.setBounds(440,150,200,40);
    	upMname.setBounds(660,150,100,40);
    	uMname.setBounds(750,150,200,40);
    	upadress.setBounds(50,200,100,40);
    	uadress.setBounds(130,200,820,40);
    	upSex.setBounds(50,250,50,40);
    	uSex.setBounds(90,250,100,40);
    	upAge.setBounds(230,250,50,40);
    	uAge.setBounds(270,250,100,40);
    	upBday.setBounds(420,250,100,40);
    	uBday.setBounds(510,250,150,40);
    	upCnum.setBounds(50,300,100,40);
    	uCnum.setBounds(150,300,150,40);
    	upEmail.setBounds(320,300,50,40);
    	uEmail.setBounds(370,300,150,40);
    	upReli.setBounds(50,350,80,40);
    	uReli.setBounds(110,350,100,40);
    	upNat.setBounds(250,350,80,40);
    	uNat.setBounds(320,350,130,40);
    	upCStat.setBounds(470,350,100,40);
    	uCStat.setBounds(550,350,110,40);
    	upInfo.setBounds(50,400,300,40);
    	upPapa.setBounds(50,450,100,40);
    	uPapa.setBounds(150,450,300,40);
    	upPaNum.setBounds(50,500,100,40);
    	uPaNum.setBounds(150,500,150,40);
    	upMama.setBounds(50,550,100,40);
    	uMama.setBounds(150,550,300,40);
    	upMaNum.setBounds(50,600,100,40);
    	uMaNum.setBounds(150,600,150,40);
    	upPanel.setBounds(700,290,450,300);
    	upF137.setBounds(50,20,100,40);
    	uF137.setBounds(150,20,200,40);
    	upF138.setBounds(50,70,100,40);
    	uF138.setBounds(150,70,200,40);
    	upNso.setBounds(50,120,100,40);
    	uNso.setBounds(150,120,200,40);
    	upDip.setBounds(50,170,100,40);
    	uDip.setBounds(150,170,200,40);
    	upGmoral.setBounds(50,220,100,40);
    	uGmoral.setBounds(150,220,200,40);
    	upsave.setBounds(1050,600,100,40);
    	uplabelStudent.setFont(new Font("Modern No. 20", Font.BOLD,30));
    	upInfo.setFont(new Font("Modern No. 20", Font.BOLD,15));
    	upReq.setFont(new Font("Modern No. 20", Font.BOLD,15));
    	
    	
    	
    	update.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			FUpdate.setVisible(true);
    			int numr=inTable.getSelectedRow();
    			String x=model2.getValueAt(numr,1).toString();
    				try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="select StudentID,LastName,FirstName, MidName, Sex,Course,Sem,SchoolYear, Age,Address, MobileNum, Email, Birthday, Religion, Nationality, CivilStatus, FatherName, ContactNumber, MotherName, ContactNum, Form137, Form138, NSO, Diploma, GdMoral from studinfo where StudentID='"+x+"'";
    				Statement st = con.createStatement();
    				ResultSet rs = st.executeQuery(squery);
    				
    				while(rs.next()){
    					int updID=rs.getInt("StudentID");
    					String updLname=rs.getString("LastName");
    					String updFname=rs.getString("FirstName");
    					String updMname=rs.getString("MidName");
    					String updadress=rs.getString("Address");
    					String updSex=rs.getString("Sex");
    					String updCourse=rs.getString("Course");
    					String updSeme=rs.getString("Sem");
    					String updSchoolYear=rs.getString("SchoolYear");
    					String updAge=rs.getString("Age");
    					String updBday=rs.getString("Birthday");
    					String updCnum=rs.getString("MobileNum");
    					String updEmail=rs.getString("Email");
    					String updReli=rs.getString("Religion");
    					String updNat=rs.getString("Nationality");
    					String updCStat=rs.getString("CivilStatus");
    					String updPapa=rs.getString("FatherName");
    					String updPaNum=rs.getString("ContactNumber");
    					String updMama=rs.getString("MotherName");
    					String updMaNum=rs.getString("ContactNum");
    					String updF137=rs.getString("Form137");
    					String updF138=rs.getString("Form138");
    					String updNso=rs.getString("NSO");
    					String updDip=rs.getString("Diploma");
    					String updGmoral=rs.getString("GdMoral");
    						
    					uID.setText(String.valueOf(updID));
    					uLname.setText(updLname);
    					uFname.setText(updFname);
    					uMname.setText(updMname);
    					uadress.setText(updadress);
    					uSex.setText(updSex);
    					uSchYr.setSelectedItem(updSchoolYear);
    					uSem.setSelectedItem(updSeme);
    					uCourse.setSelectedItem(updCourse);
    					uAge.setText(updAge);
    					uBday.setText(updBday);
    					uCnum.setText(updCnum);
    					uEmail.setText(updEmail);
    					uReli.setText(updReli);
    					uNat.setText(updNat);
    					uCStat.setText(updCStat);
    					uPapa.setText(updPapa);
    					uPaNum.setText(updPaNum);
    					uMama.setText(updMama);
    					uMaNum.setText(updMaNum);
    					uF137.setText(updF137);
    					uF138.setText(updF138);
    					uNso.setText(updNso);
    					uDip.setText(updDip);
    					uGmoral.setText(updGmoral);

    				}
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			    			
    		}
    	});
    	update.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F8){
   					update.doClick();
   				}
   			}
   		});
    	upsave.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			int numr=inTable.getSelectedRow();
    			String x=model2.getValueAt(numr,1).toString();
    			int upp1= JOptionPane.showConfirmDialog(null,"Are you sure you want to update?","Confirmation",JOptionPane.YES_NO_OPTION);
    			if(upp1==0){
    					String updID1=uID.getText();
    					String updLname1=uLname.getText();
    					String updFname1=uFname.getText();
    					String updMname1=uMname.getText();
    					String updadress1=uadress.getText();
    					String updSex1=uSex.getText();
    					String updCourse1=uCourse.getSelectedItem().toString();
    					String updSem1=uSem.getSelectedItem().toString();
    					String updSchyr1=uSchYr.getSelectedItem().toString();
    					String updAge1=uAge.getText();
    					String updBday1=uBday.getText();
    					String updCnum1=uCnum.getText();
    					String updEmail1=uEmail.getText();
    					String updReli1=uReli.getText();
    					String updNat1=uNat.getText();
    					String updCStat1=uCStat.getText();
    					String updPapa1=uPapa.getText();
    					String updPaNum1=uPaNum.getText();
    					String updMama1=uMama.getText();
    					String updMaNum1=uMaNum.getText();
    					String updF1371=uF137.getText();
    					String updF1381=uF138.getText();
    					String updNso1=uNso.getText();
    					String updDip1=uDip.getText();
    					String updGmoral1=uGmoral.getText();
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="UPDATE studinfo SET LastName='"+updLname1+"',FirstName='"+updFname1+"', MidName='"+updMname1+"', Sex='"+updSex1+"',Course='"+updCourse1+"',Sem='"+updSem1+"',SchoolYear='"+updSchyr1+"', Age='"+updAge1+"',Address='"+updadress1+"', MobileNum='"+updCnum1+"', Email='"+updEmail1+"', Birthday='"+updBday1+"', Religion='"+updReli1+"', Nationality='"+updNat1+"', CivilStatus='"+updCStat1+"', FatherName='"+updPapa1+"', ContactNumber='"+updPaNum1+"', MotherName='"+updMama1+"', ContactNum='"+updMaNum1+"', Form137='"+updF1371+"', Form138='"+updF1381+"', NSO='"+updNso1+"', Diploma='"+updDip1+"', GdMoral='"+updGmoral1+"' WHERE StudentID='"+x+"'";
    				Statement st = con.createStatement();
    				int rs = st.executeUpdate(squery);
    				
    					
    						
    				
    				JOptionPane.showMessageDialog(null, "Update successful!");
    				
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			String a1=uLname.getText();
    			String a2=uFname.getText();
    			String a3=uMname.getText();
    			String a4=uSex.getText();
    			String a5=uCourse.getSelectedItem().toString();
    			String a6=uSem.getSelectedItem().toString();
    			String a7=uSchYr.getSelectedItem().toString();
    			String a8=uAge.getText();

    			
    			model2.setValueAt(a1,numr,2);
    			model2.setValueAt(a2,numr,3);
    			model2.setValueAt(a3,numr,4);
    			model2.setValueAt(a4,numr,5);
    			model2.setValueAt(a5,numr,6);
    			model2.setValueAt(a6,numr,7);
    			model2.setValueAt(a7,numr,8);
    			model2.setValueAt(a8,numr,9);
    		
    			FUpdate.setVisible(false);
    			}
    		}
    	});
    	upsave.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F11){
   					upsave.doClick();
   				}
   			}
   		});
   		
   		
   		try{
   			FUpdate.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\greenBackground1.jpg")))));
   			}
   		catch(IOException e){
   			e.printStackTrace();
   			}
   			
   		upPanel.add(upF137);
    	upPanel.add(upF138);
    	upPanel.add(upNso);
    	upPanel.add(upDip);
    	upPanel.add(upGmoral);
    	upPanel.add(uF137);
    	upPanel.add(uF138);
    	upPanel.add(uNso);
    	upPanel.add(uDip);
    	upPanel.add(uGmoral);
    	FUpdate.add(uplabelStudent);
    	FUpdate.add(upReq);
    	FUpdate.add(uID);
    	FUpdate.add(upID);
    	FUpdate.add(uLname);
    	FUpdate.add(upLname);
    	FUpdate.add(uFname);
    	FUpdate.add(upFname);
    	FUpdate.add(uMname);
    	FUpdate.add(upMname);
    	FUpdate.add(uAge);
    	FUpdate.add(upAge);
    	FUpdate.add(uSex);
    	FUpdate.add(upSex);
    	FUpdate.add(upPanel);
    	FUpdate.add(uadress);
    	FUpdate.add(upadress);
    	FUpdate.add(uCnum);
    	FUpdate.add(upCnum);
    	FUpdate.add(uEmail);
    	FUpdate.add(upEmail);
    	FUpdate.add(uBday);
    	FUpdate.add(upBday);
    	FUpdate.add(uReli);
    	FUpdate.add(upReli);
    	FUpdate.add(uNat);
    	FUpdate.add(upInfo);
    	FUpdate.add(upNat);
    	FUpdate.add(uCStat);
    	FUpdate.add(upCStat);
    	FUpdate.add(uPapa);
    	FUpdate.add(upPapa);
    	FUpdate.add(uPaNum);
    	FUpdate.add(upPaNum);
    	FUpdate.add(uMama);
    	FUpdate.add(upMama);
    	FUpdate.add(uMaNum);
    	FUpdate.add(upMaNum);
    	FUpdate.add(upsave);
    	FUpdate.add(uCourse);
    	FUpdate.add(upCourse);
    	FUpdate.add(uSchYr);
    	FUpdate.add(upSchYr);
    	FUpdate.add(uSem);
    	FUpdate.add(upSem);
   			
    	upPanel.setLayout(null);
    	
    	uID.setEnabled(false);
    	//----------------------------------------------------endOfUPDATEButtton--------------------------------------------//
    	
    	//--------------------------------------------------enUpdate-------------------------------------------------------//
    	String choices[]={"BSIT","BSCS","BSPSYC","BSEED","BSHRM","BSBM","ABJOURN","BSHM","BSOA","BENT"};
    	String schoolYr[]={"2016-2017","2017-2018","2018-2019","2019-2020","2021-2022"};
    	String seme[]={"1st Sem", "2nd Sem"};
    	
    	JLabel uplabelStudent1 = new JLabel("STUDENT INFORMATION");
    	JLabel upID1=new JLabel("Student ID: ");
    	JLabel upCourse1 = new JLabel("Course: ");
    	JLabel upSem1 = new JLabel("Semester: ");
    	JLabel upSchYr1 = new JLabel("School Year: ");
    	JLabel upLname1=new JLabel("Last Name: ");
    	JLabel upFname1=new JLabel("First Name: ");
    	JLabel upMname1=new JLabel("Middle Name: ");
    	JLabel upAge1=new JLabel("Age: ");
    	JLabel upSex1=new JLabel("Sex: ");
    	JLabel upadress1=new JLabel("Address: ");
    	JLabel upCnum1=new JLabel("Mobile Number: ");
    	JLabel upEmail1=new JLabel("Email: ");
    	JLabel upBday1=new JLabel("Date of Birth: ");
    	JLabel upReli1=new JLabel("Religion: ");
    	JLabel upNat1=new JLabel("Nationality: ");
    	JLabel upCStat1=new JLabel("Civil Status: ");
    	JLabel upPapa1=new JLabel("Father's Name: ");
    	JLabel upPaNum1=new JLabel("Contact Number: ");
    	JLabel upMama1=new JLabel("Mother's Name: ");
    	JLabel upMaNum1=new JLabel("Contact Number: ");
    	JPanel upPanel1 = new JPanel();
    	upPanel1.setBorder(BorderFactory.createEtchedBorder());
    	JLabel upF1371=new JLabel("Form137: ");
    	JLabel upF1381=new JLabel("Form 138: ");
    	JLabel upNso1=new JLabel("Nso/Psa: ");
    	JLabel upDip1=new JLabel("Diploma: ");
    	JLabel upGmoral1=new JLabel("Good Moral: ");
    	JLabel upInfo1=new JLabel("GUARDIAN'S INFORMATION");
    	JLabel upReq1=new JLabel("REQUIREMENTS");
    	JButton upsave1 = new JButton("Save");
    	
    	JTextField uID1=new JTextField();
    	JComboBox uCourse1=new JComboBox(choices);
    	JComboBox uSchYr1=new JComboBox(schoolYr);
    	JComboBox uSem1=new JComboBox(seme);
    	JTextField uLname1=new JTextField();
    	JTextField uFname1=new JTextField();
    	JTextField uMname1=new JTextField();
    	JTextField uAge1=new JTextField();
    	JTextField uSex1=new JTextField();
    	JTextField uadress1=new JTextField();
    	JTextField uCnum1=new JTextField();
    	JTextField uEmail1=new JTextField();;
    	JTextField uBday1=new JTextField();
    	JTextField uReli1=new JTextField();
    	JTextField uNat1=new JTextField();
    	JTextField uCStat1=new JTextField();
    	JTextField uPapa1=new JTextField();
    	JTextField uPaNum1=new JTextField();
    	JTextField uMama1=new JTextField();
    	JTextField uMaNum1=new JTextField();
    	JTextField uF1371=new JTextField();
    	JTextField uF1381=new JTextField();
    	JTextField uNso1=new JTextField();
    	JTextField uDip1=new JTextField();
    	JTextField uGmoral1=new JTextField();
    	
    	uplabelStudent1.setBounds(450,30,500,40);
    	upID1.setBounds(50,100,100,40);
    	uID1.setBounds(130,100,200,40);
    	upLname1.setBounds(50,150,100,40);
    	uLname1.setBounds(130,150,200,40);
    	upFname1.setBounds(360,150,100,40);
    	uFname1.setBounds(440,150,200,40);
    	upCourse1.setBounds(360,100,100,40);
    	uCourse1.setBounds(440,100,100,40);
    	upSchYr1.setBounds(660,100,100,40);
    	uSchYr1.setBounds(750,100,100,40);
    	upSem1.setBounds(950,100,100,40);
    	uSem1.setBounds(1030,100,100,40);
    	upMname1.setBounds(660,150,100,40);
    	uMname1.setBounds(750,150,200,40);
    	upadress1.setBounds(50,200,100,40);
    	uadress1.setBounds(130,200,820,40);
    	upSex1.setBounds(50,250,50,40);
    	uSex1.setBounds(90,250,100,40);
    	upAge1.setBounds(230,250,50,40);
    	uAge1.setBounds(270,250,100,40);
    	upBday1.setBounds(420,250,100,40);
    	uBday1.setBounds(510,250,150,40);
    	upCnum1.setBounds(50,300,100,40);
    	uCnum1.setBounds(150,300,150,40);
    	upEmail1.setBounds(320,300,50,40);
    	uEmail1.setBounds(370,300,150,40);
    	upReli1.setBounds(50,350,80,40);
    	uReli1.setBounds(110,350,100,40);
    	upNat1.setBounds(250,350,80,40);
    	uNat1.setBounds(320,350,130,40);
    	upCStat1.setBounds(470,350,100,40);
    	uCStat1.setBounds(550,350,110,40);
    	upInfo1.setBounds(50,400,300,40);
    	upPapa1.setBounds(50,450,100,40);
    	uPapa1.setBounds(150,450,300,40);
    	upPaNum1.setBounds(50,500,100,40);
    	uPaNum1.setBounds(150,500,150,40);
    	upMama1.setBounds(50,550,100,40);
    	uMama1.setBounds(150,550,300,40);
    	upMaNum1.setBounds(50,600,100,40);
    	uMaNum1.setBounds(150,600,150,40);
    	upReq1.setBounds(875,250,200,40);
    	upPanel1.setBounds(700,280,450,300);
    	upF1371.setBounds(50,20,100,40);
    	uF1371.setBounds(150,20,200,40);
    	upF1381.setBounds(50,70,100,40);
    	uF1381.setBounds(150,70,200,40);
    	upNso1.setBounds(50,120,100,40);
    	uNso1.setBounds(150,120,200,40);
    	upDip1.setBounds(50,170,100,40);
    	uDip1.setBounds(150,170,200,40);
    	upGmoral1.setBounds(50,220,100,40);
    	uGmoral1.setBounds(150,220,200,40);
    	upsave1.setBounds(1050,600,100,40);
    	uplabelStudent1.setFont(new Font("Modern No. 20", Font.BOLD,30));
    	upInfo1.setFont(new Font("Modern No. 20", Font.BOLD,15));
    	upReq1.setFont(new Font("Modern No. 20", Font.BOLD,15));
    	
    	enUpdate.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			FUpdate1.setVisible(true);
    			int numr=enTable.getSelectedRow();
    			String x=model.getValueAt(numr,1).toString();
    				try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="select StudentID,LastName,FirstName, MidName, Sex, Course, Sem, SchoolYear, Age,Address, MobileNum, Email, Birthday, Religion, Nationality, CivilStatus, FatherName, ContactNumber, MotherName, ContactNum, Form137, Form138, NSO, Diploma, GdMoral from enroll where StudentID='"+x+"'";
    				Statement st = con.createStatement();
    				ResultSet rs = st.executeQuery(squery);
    				
    				while(rs.next()){
    					int updID1=rs.getInt("StudentID");
    					String updLname1=rs.getString("LastName");
    					String updFname1=rs.getString("FirstName");
    					String updMname1=rs.getString("MidName");
    					String updadress1=rs.getString("Address");
    					String updSex1=rs.getString("Sex");
    					String updCourse1=rs.getString("Course");
    					String updSeme1=rs.getString("Sem");
    					String updSchoolYear1=rs.getString("SchoolYear");
    					String updAge1=rs.getString("Age");
    					String updBday1=rs.getString("Birthday");
    					String updCnum1=rs.getString("MobileNum");
    					String updEmail1=rs.getString("Email");
    					String updReli1=rs.getString("Religion");
    					String updNat1=rs.getString("Nationality");
    					String updCStat1=rs.getString("CivilStatus");
    					String updPapa1=rs.getString("FatherName");
    					String updPaNum1=rs.getString("ContactNumber");
    					String updMama1=rs.getString("MotherName");
    					String updMaNum1=rs.getString("ContactNum");
    					String updF1371=rs.getString("Form137");
    					String updF1381=rs.getString("Form138");
    					String updNso1=rs.getString("NSO");
    					String updDip1=rs.getString("Diploma");
    					String updGmoral1=rs.getString("GdMoral");
    						
    					uID1.setText(String.valueOf(updID1));
    					uSchYr1.setSelectedItem(updSchoolYear1);
    					uSem1.setSelectedItem(updSeme1);
    					uCourse1.setSelectedItem(updCourse1);
    					uLname1.setText(updLname1);
    					uFname1.setText(updFname1);
    					uMname1.setText(updMname1);
    					uadress1.setText(updadress1);
    					uSex1.setText(updSex1);
    					uAge1.setText(updAge1);
    					uBday1.setText(updBday1);
    					uCnum1.setText(updCnum1);
    					uEmail1.setText(updEmail1);
    					uReli1.setText(updReli1);
    					uNat1.setText(updNat1);
    					uCStat1.setText(updCStat1);
    					uPapa1.setText(updPapa1);
    					uPaNum1.setText(updPaNum1);
    					uMama1.setText(updMama1);
    					uMaNum1.setText(updMaNum1);
    					uF1371.setText(updF1371);
    					uF1381.setText(updF1381);
    					uNso1.setText(updNso1);
    					uDip1.setText(updDip1);
    					uGmoral1.setText(updGmoral1);

    				}
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			    			
    		}
    	});
    	enUpdate.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F8){
   					enUpdate.doClick();
   				}
   			}
   		});
    	upsave1.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			int numr=enTable.getSelectedRow();
    			String x=model.getValueAt(numr,1).toString();
    			int upp1= JOptionPane.showConfirmDialog(null,"Are you sure you want to update?","Confirmation",JOptionPane.YES_NO_OPTION);
    			if(upp1==0){
    					String updID11=uID1.getText();
    					String updLname11=uLname1.getText();
    					String updFname11=uFname1.getText();
    					String updMname11=uMname1.getText();
    					String updadress11=uadress1.getText();
    					String updSex11=uSex1.getText();
    					String updCourse11=uCourse1.getSelectedItem().toString();
    					String updSem11=uSem1.getSelectedItem().toString();
    					String updSchyr11=uSchYr1.getSelectedItem().toString();
    					String updAge11=uAge1.getText();
    					String updBday11=uBday1.getText();
    					String updCnum11=uCnum1.getText();
    					String updEmail11=uEmail1.getText();
    					String updReli11=uReli1.getText();
    					String updNat11=uNat1.getText();
    					String updCStat11=uCStat1.getText();
    					String updPapa11=uPapa1.getText();
    					String updPaNum11=uPaNum1.getText();
    					String updMama11=uMama1.getText();
    					String updMaNum11=uMaNum1.getText();
    					String updF13711=uF1371.getText();
    					String updF13811=uF1381.getText();
    					String updNso11=uNso1.getText();
    					String updDip11=uDip1.getText();
    					String updGmoral11=uGmoral1.getText();
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="UPDATE enroll SET LastName='"+updLname11+"',FirstName='"+updFname11+"', MidName='"+updMname11+"', Sex='"+updSex11+"',Course='"+updCourse11+"',Sem='"+updSem11+"',SchoolYear='"+updSchyr11+"', Age='"+updAge11+"',Address='"+updadress11+"', MobileNum='"+updCnum11+"', Email='"+updEmail11+"', Birthday='"+updBday11+"', Religion='"+updReli11+"', Nationality='"+updNat11+"', CivilStatus='"+updCStat11+"', FatherName='"+updPapa11+"', ContactNumber='"+updPaNum11+"', MotherName='"+updMama11+"', ContactNum='"+updMaNum11+"', Form137='"+updF13711+"', Form138='"+updF13811+"', NSO='"+updNso11+"', Diploma='"+updDip11+"', GdMoral='"+updGmoral11+"' WHERE StudentID='"+x+"'";
    				Statement st = con.createStatement();
    				int rs = st.executeUpdate(squery);
    				
    					
    						
    				
    				JOptionPane.showMessageDialog(null, "Update successful!");
    				
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			String a1=uLname1.getText();
    			String a2=uFname1.getText();
    			String a3=uMname1.getText();
    			String a4=uSex1.getText();
    			String a5=uCourse1.getSelectedItem().toString();
    			String a6=uSem1.getSelectedItem().toString();
    			String a7=uSchYr1.getSelectedItem().toString();
    			String a8=uAge1.getText();

    			
    			model.setValueAt(a1,numr,2);
    			model.setValueAt(a2,numr,3);
    			model.setValueAt(a3,numr,4);
    			model.setValueAt(a4,numr,5);
    			model.setValueAt(a5,numr,6);
    			model.setValueAt(a6,numr,7);
    			model.setValueAt(a7,numr,8);
    			model.setValueAt(a8,numr,9);
    			
    			FUpdate1.setVisible(false);
    			}
    		}
    	});
    	upsave1.addKeyListener(new KeyAdapter(){
   			public void keyPressed(KeyEvent e){
   				if(e.getKeyCode()==KeyEvent.VK_F11){
   					upsave1.doClick();
   				}
   			}
   		});
   		
   		
   		try{
   			FUpdate1.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\natalie\\Documents\\JCreator Pro\\MyProjects\\System\\pics\\greenBackground1.jpg")))));
   			}
   		catch(IOException e){
   			e.printStackTrace();
   			}
   			
   		upPanel1.add(upF1371);
    	upPanel1.add(upF1381);
    	upPanel1.add(upNso1);
    	upPanel1.add(upDip1);
    	upPanel1.add(upGmoral1);
    	upPanel1.add(uF1371);
    	upPanel1.add(uF1381);
    	upPanel1.add(uNso1);
    	upPanel1.add(uDip1);
    	upPanel1.add(uGmoral1);
    	FUpdate1.add(uplabelStudent1);
    	FUpdate1.add(uID1);
    	FUpdate1.add(upID1);
    	FUpdate1.add(uLname1);
    	FUpdate1.add(upLname1);
    	FUpdate1.add(uFname1);
    	FUpdate1.add(upFname1);
    	FUpdate1.add(uMname1);
    	FUpdate1.add(upMname1);
    	FUpdate1.add(uAge1);
    	FUpdate1.add(upAge1);
    	FUpdate1.add(uSex1);
    	FUpdate1.add(upSex1);
    	FUpdate1.add(upReq1);
    	FUpdate1.add(upPanel1);
    	FUpdate1.add(uadress1);
    	FUpdate1.add(upadress1);
    	FUpdate1.add(uCnum1);
    	FUpdate1.add(upCnum1);
    	FUpdate1.add(uEmail1);
    	FUpdate1.add(upEmail1);
    	FUpdate1.add(uBday1);
    	FUpdate1.add(upBday1);
    	FUpdate1.add(uReli1);
    	FUpdate1.add(upReli1);
    	FUpdate1.add(uNat1);
    	FUpdate1.add(upInfo1);
    	FUpdate1.add(upNat1);
    	FUpdate1.add(uCStat1);
    	FUpdate1.add(upCStat1);
    	FUpdate1.add(uPapa1);
    	FUpdate1.add(upPapa1);
    	FUpdate1.add(uPaNum1);
    	FUpdate1.add(upPaNum1);
    	FUpdate1.add(uMama1);
    	FUpdate1.add(upMama1);
    	FUpdate1.add(uMaNum1);
    	FUpdate1.add(upMaNum1);
    	FUpdate1.add(upsave1);
    	FUpdate1.add(uCourse1);
    	FUpdate1.add(upCourse1);
    	FUpdate1.add(uSchYr1);
    	FUpdate1.add(upSchYr1);
    	FUpdate1.add(uSem1);
    	FUpdate1.add(upSem1);
    	
   			
    	upPanel1.setLayout(null);
    	
    	uID1.setEnabled(false);
    	
    	
    	//--------------------------------------------------endOfenUpdate--------------------------------------------------//
    	
    	//------------------------------------------------------ReportPanel------------------------------------------------//
    	
    	it.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			
    			crs.setText("Bachelor of Science in Information Technology");
    			
    			String y=year1.getSelectedItem().toString();
    			int total=0;
    			int total1=0;
    			String x="Dropped";
    			String y1="Enrolled";
    			String course="BSIT";
    			String sm="1st sem";
    			String sm1="2nd sem";
    			
    			//1stsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//2ndsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp1.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//1stsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			//2ndsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum1.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    		}
    	});
    	
    		cs.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			
    			crs.setText("Bachelor of Science in Computer Science");
    			
    			String y=year1.getSelectedItem().toString();
    			int total=0;
    			int total1=0;
    			String x="Dropped";
    			String y1="Enrolled";
    			String course="BSCS";
    			String sm="1st sem";
    			String sm1="2nd sem";
    			
    			//1stsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//2ndsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp1.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//1stsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			//2ndsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum1.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    		}
    	});
    	
    		psyc.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			
    			crs.setText("Bachelor of Science in Psychology");
    			
    			String y=year1.getSelectedItem().toString();
    			int total=0;
    			int total1=0;
    			String x="Dropped";
    			String y1="Enrolled";
    			String course="BSPSYC";
    			String sm="1st sem";
    			String sm1="2nd sem";
    			
    			//1stsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//2ndsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp1.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//1stsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			//2ndsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum1.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    		}
    	});
    	
    		ee.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			
    			crs.setText("Bachelor of Science in Education");
    			
    			String y=year1.getSelectedItem().toString();
    			int total=0;
    			int total1=0;
    			String x="Dropped";
    			String y1="Enrolled";
    			String course="BSEED";
    			String sm="1st sem";
    			String sm1="2nd sem";
    			
    			//1stsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//2ndsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp1.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//1stsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			//2ndsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum1.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    		}
    	});
    	
    		bsem.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			
    			crs.setText("Bachelor of Hotel & Restaurant Management");
    			
    			String y=year1.getSelectedItem().toString();
    			int total=0;
    			int total1=0;
    			String x="Dropped";
    			String y1="Enrolled";
    			String course="BSHRM";
    			String sm="1st sem";
    			String sm1="2nd sem";
    			
    			//1stsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//2ndsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp1.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//1stsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			//2ndsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum1.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    		}
    	});
    		bm.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			
    			crs.setText("Bachelor of Science in Business Management");
    			
    			String y=year1.getSelectedItem().toString();
    			int total=0;
    			int total1=0;
    			String x="Dropped";
    			String y1="Enrolled";
    			String course="BSBM";
    			String sm="1st sem";
    			String sm1="2nd sem";
    			
    			//1stsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//2ndsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp1.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//1stsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			//2ndsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum1.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    		}
    	});
    	
    		journ.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			
    			crs.setText("Bachelor of Arts in Journalism");
    			
    			String y=year1.getSelectedItem().toString();
    			int total=0;
    			int total1=0;
    			String x="Dropped";
    			String y1="Enrolled";
    			String course="ABJOURN";
    			String sm="1st sem";
    			String sm1="2nd sem";
    			
    			//1stsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//2ndsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp1.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//1stsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			//2ndsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum1.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    		}
    	});
    	
    		oa.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			
    			crs.setText("Bachelor of Science in Office Administration");
    			
    			String y=year1.getSelectedItem().toString();
    			int total=0;
    			int total1=0;
    			String x="Dropped";
    			String y1="Enrolled";
    			String course="BSOA";
    			String sm="1st sem";
    			String sm1="2nd sem";
    			
    			//1stsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//2ndsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp1.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//1stsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			//2ndsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum1.setText("Number of Enrollees: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    		}
    	});
    	
    		hm.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			
    			crs.setText("Bachelor of Hospitality Management");
    			
    			String y=year1.getSelectedItem().toString();
    			int total=0;
    			int total1=0;
    			String x="Dropped";
    			String y1="Enrolled";
    			String course="BSHM";
    			String sm="1st sem";
    			String sm1="2nd sem";
    			
    			//1stsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp.setText("Number of Dropped: "+String.valueOf(total));

    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//2ndsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp1.setText("Number of Dropped: "+String.valueOf(total));
    	
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//1stsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum.setText("Number of Enrollees: "+String.valueOf(total));
    	
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			//2ndsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum1.setText("Number of Enrollees: "+String.valueOf(total));
    	
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    		}
    	});
    	
    		bent.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			
    			crs.setText("Bachelor of Entrepreneurship");
    			
    			String y=year1.getSelectedItem().toString();
    			int total=0;
    			int total1=0;
    			String x="Dropped";
    			String y1="Enrolled";
    			String course="BENT";
    			String sm="1st sem";
    			String sm1="2nd sem";
    			
    			//1stsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp.setText("Number of Dropped: "+String.valueOf(total));
    	
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//2ndsemDropped
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*) FROM enroll WHERE Status='"+x+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("count(*)");
    				}
    				drp1.setText("Number of Dropped: "+String.valueOf(total));
    	
    			//	JOptionPane.showMessageDialog(null, "successful!");
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    			//1stsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum.setText("Number of Enrollees: "+String.valueOf(total));
    	
    			//	JOptionPane.showMessageDialog(null, "successful!");
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			//2ndsemEnrollees
    			try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
					String squery ="SELECT COUNT(*)AS TOTAL FROM enroll WHERE Status='"+y1+"' and SchoolYear='"+y+"' and Course='"+course+"' and Sem='"+sm1+"'";
    				Statement st = con.createStatement();
    				ResultSet rs= st.executeQuery(squery);
    				while(rs.next()){
    					
    					total=rs.getInt("TOTAL");
    				}
    				tnum1.setText("Number of Enrollees: "+String.valueOf(total));
    	
    			//	JOptionPane.showMessageDialog(null, "successful!");
    				rs.close();
    				st.close();
    				con.close();
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    			
    		}
    	});
    	//-----------------------------------------------------endOfReportPanel-------------------------------------------//
    	
    	//------------------------------------------------------DispalyTable------------------------------------------------//
    	//EnrollmentTable
    	try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
    				String squery="select * from enroll";
					Statement st = con.createStatement();
					ResultSet rs=st.executeQuery(squery);
					while(rs.next()){
					
    					String sstat1=rs.getString("Status");
    					int sstudid=rs.getInt("StudentID");
    					String sln1=rs.getString("LastName");
    					String sfn1=rs.getString("FirstName");
    					String smn1=rs.getString("MidName");
    					String sgen1=rs.getString("Sex");
    					String ssem1=rs.getString("Sem");
    					String scbyr1=rs.getString("SchoolYear");
    					String scb11=rs.getString("Course");
    					String sAGE1=rs.getString("Age");
    					String iddnum=String.valueOf(sstudid);
    					String addnew[]={sstat1,iddnum,sln1,sfn1,smn1,sgen1,scb11,ssem1,scbyr1,sAGE1};
    					model.addRow(addnew);
    				}
    				rs.close();
    				st.close();
    				con.close();
    				
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    		//StudentInfoTable
    		try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
    				String squery="select * from studinfo";
					Statement st = con.createStatement();
					ResultSet rs=st.executeQuery(squery);
					while(rs.next()){
					
    					String sstat=rs.getString("Status");
    					int sstudid1=rs.getInt("StudentID");
    					String sln=rs.getString("LastName");
    					String sfn=rs.getString("FirstName");
    					String smn=rs.getString("MidName");
    					String sgen=rs.getString("Sex");
    					String ssem=rs.getString("Sem");
    					String scbyr=rs.getString("SchoolYear");
    					String scb1=rs.getString("Course");
    					String sAGE=rs.getString("Age");
    					String iddnum1=String.valueOf(sstudid1);
    					String addnew1[]={sstat,iddnum1,sln,sfn,smn,sgen,scb1,ssem,scbyr,sAGE};
    					model2.addRow(addnew1);
    				}
    				rs.close();
    				st.close();
    				con.close();
    				
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    		//StudentInfoTable
    		try{	
    				Connection con = DriverManager.getConnection(dburl,userdb,passdb);
    				String squery="select * from archive";
					Statement st = con.createStatement();
					ResultSet rs=st.executeQuery(squery);
					while(rs.next()){
					
    					String sstat2=rs.getString("Status");
    					int sstudid12=rs.getInt("StudentID");
    					String sln2=rs.getString("LastName");
    					String sfn2=rs.getString("FirstName");
    					String smn2=rs.getString("MidName");
    					String sgen2=rs.getString("Sex");
    					String ssem2=rs.getString("Sem");
    					String scbyr2=rs.getString("SchoolYear");
    					String scb12=rs.getString("Course");
    					String sAGE2=rs.getString("Age");
    					String iddnum12=String.valueOf(sstudid12);
    					String addnew2[]={sstat2,iddnum12,sln2,sfn2,smn2,sgen2,scb12,ssem2,scbyr2,sAGE2};
    					model3.addRow(addnew2);
    				}
    				rs.close();
    				st.close();
    				con.close();
    				
    			}
    			catch(Exception ex){
    				JOptionPane.showMessageDialog(null,ex);
    			}
    	//-----------------------------------------------------endofDiplayTable--------------------------------------------//
    	
    	
    	//----------------------------------------------Lastpart------------------------------------------------------//
    	
    	//framsetB
    	login.setBounds(10,10,1350,700);
    	adm.setBounds(10,10,1350,700);
    	fmain.setBounds(10,10,1350,700);
    	terms.setBounds(400,40,600,650);
    	admin.setBounds(10,10,1350,700);
    	viewStudent.setBounds(50,10,1250,700);
    	FUpdate.setBounds(50,10,1250,700);
    	FUpdate1.setBounds(50,10,1250,700);
    	//Layout
    	admin.setLayout(null);
    	terms.setLayout(null);
    	FUpdate.setLayout(null);
    	FUpdate1.setLayout(null);
    	fmain.setLayout(null);
    	viewStudent.setLayout(null);
    	adm.setLayout(null);
    	login.setLayout(null);
    	adm.setVisible(false);
    	fmain.setVisible(true);
    	
    	//bg colors
    	
    	
    	sem1.setOpaque(false);
    	sem2.setOpaque(false);
    	jpin.setOpaque(false);
  		jpen.setOpaque(false);
  		jpreg.setOpaque(false);
  		jparch.setOpaque(false);
  		jprep.setOpaque(false);
  		jphome.setOpaque(false);
  		jp1.setOpaque(false);
  		jp2.setOpaque(false);
  		clockpane.setOpaque(false);
  		logp.setBackground(beige);
  		archTable.setBackground(lightGreen1);
    	inTable.setBackground(bgGreen);
    	enTable.setBackground(bgGreen);
    	stud.setBackground(bgGreen);
    	Admin.setBackground(bgGreen);
    	nextEx3.setBackground(bgGreen);
    	backAd3.setBackground(bgGreen);
    	backAd4.setBackground(bgGreen);
    	nnext.setBackground(bgGreen);
    	bck.setBackground(bgGreen);
    	log.setBackground(bgGreen);
    	cancel.setBackground(bgGreen);
    	pending.setBackground(bgGreen);
    	approve.setBackground(bgGreen);
    	dropped.setBackground(bgGreen);
    	newstud.setBackground(bgGreen);
    	search.setBackground(bgGreen);
    	view.setBackground(bgGreen);
    	search1.setBackground(bgGreen);
    	archive.setBackground(bgGreen);
    	update.setBackground(bgGreen);
    	search2.setBackground(bgGreen);
    	print.setBackground(bgGreen);
    	upsave.setBackground(bgGreen);
    	retrive.setBackground(bgGreen);
    	subEx.setBackground(bgGreen);
    	resOk.setBackground(bgGreen);
    	tcNext.setBackground(bgGreen);
    	tcBack.setBackground(bgGreen);
    	enUpdate.setBackground(bgGreen);
    	
    }
    public static void video() throws IOException {
        
        Desktop.getDesktop().open(new File("C:\\Users\\natalie\\Desktop\\cvsuTour.mp4"));
        
        }
        
     public static void schedForm() throws IOException {
        
        Desktop.getDesktop().open(new File("COURSES SCHEDULE.PDF"));
        
        }
}
