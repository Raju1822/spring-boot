package nitrrproject.cse.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appraisal")

public class Appraisal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "a1")
	private String a1;

    @Column(name = "a2")
	private String a2;

	@Column(name = "b1")
	private String b1;

    @Column(name = "b2")
	private String b2;

    @Column(name = "b3")
	private String b3;

    @Column(name = "b4")
	private String b4;

    @Column(name = "b5")
	private String b5;

    @Column(name = "b6")
	private String b6;

    @Column(name = "b7")
	private String b7;

    @Column(name = "c1")
	private String c1;

    @Column(name = "c2")
	private String c2;

    @Column(name = "c3")
	private String c3;

    @Column(name = "c4")
	private String c4;

    @Column(name = "c5")
	private String c5;

    @Column(name = "c6")
	private String c6;

    @Column(name = "c7")
	private String c7;

    @Column(name = "d1")
	private String d1;

    @Column(name = "d2")
	private String d2;

    @Column(name = "d3")
	private String d3;

    @Column(name = "d4")
	private String d4;

    @Column(name = "d5")
	private String d5;

    @Column(name = "d6")
	private String d6;

    @Column(name = "d7")
	private String d7;

    @Column(name = "d8")
	private String d8;

    @Column(name = "d9")
	private String d9;

    @Column(name = "d10")
	private String d10;

    @Column(name = "d11")
	private String d11;

    @Column(name = "d12")
	private String d12;

    @Column(name = "d13")
	private String d13;

    @Column(name = "d14")
	private String d14;

    @Column(name = "d15")
	private String d15;

    @Column(name = "d16")
	private String d16;

    @Column(name = "d17")
	private String d17;

    @Column(name = "d18")
	private String d18;

    @Column(name = "d19")
	private String d19;

    @Column(name = "d20")
	private String d20;

    @Column(name = "d21")
	private String d21;

    @Column(name = "d22")
	private String d22;

    @Column(name = "d23")
	private String d23;

    @Column(name = "d24")
	private String d24;

    @Column(name = "d25")
	private String d25;

    @Column(name = "d26")
	private String d26;

    @Column(name = "d27")
	private String d27;

    @Column(name = "d28")
	private String d28;

    @Column(name = "d29")
	private String d29;

    @Column(name = "d30")
	private String d30;

    @Column(name = "d31")
	private String d31;

    @Column(name = "d32")
	private String d32;

    @Column(name = "d33")
	private String d33;

    @Column(name = "d34")
	private String d34;

    @Column(name = "d35")
	private String d35;

    @Column(name = "d36")
	private String d36;

    @Column(name = "d37")
	private String d37;

    @Column(name = "d38")
	private String d38;

    @Column(name = "d39")
	private String d39;

    @Column(name = "d40")
	private String d40;

    @Column(name = "d41")
	private String d41;

    @Column(name = "d42")
	private String d42;

    @Column(name = "d43")
	private String d43;

    @Column(name = "d44")
	private String d44;

    @Column(name = "d45")
	private String d45;

    @Column(name = "d46")
	private String d46;

    @Column(name = "e1")
	private String e1;

    @Column(name = "e2")
	private String e2;

    @Column(name = "e3")
	private String e3;

    @Column(name = "e4")
	private String e4;

    @Column(name = "e5")
	private String e5;

    @Column(name = "e6")
	private String e6;

    @Column(name = "e7")
	private String e7;

    @Column(name = "e8")
	private String e8;

    @Column(name = "e9")
	private String e9;

    @Column(name = "e10")
	private String e10;

    @Column(name = "e11")
	private String e11;

    @Column(name = "e12")
	private String e12;

    @Column(name = "f1")
	private String f1;

    @Column(name = "f2")
	private String f2;

    @Column(name = "f3")
	private String f3;

    @Column(name = "f4")
	private String f4;

    @Column(name = "f5")
	private String f5;

    @Column(name = "f6")
	private String f6;

    @Column(name = "f7")
	private String f7;

    @Column(name = "f8")
	private String f8;

    @Column(name = "f9")
	private String f9;

    @Column(name = "f10")
	private String f10;

    @Column(name = "f11")
	private String f11;



  public Appraisal(){

  }

	public Appraisal(String a1, String a2, String b1, String b2, String b3, String b4, String b5, String b6, String b7, String c1, String c2, String c3, String c4, String c5, String c6, String c7,String d1, String d2, String d3, String d4, String d5, String d6, String d7, String d8, String d9,String d10, String d11, String d12, String d13, String d14, String d15, String d16, String d17, String d18, String d19,String d20,String d21, String d22, String d23, String d24, String d25, String d26, String d27, String d28, String d29,String d30,String d31, String d32, String d33, String d34, String d35, String d36, String d37, String d38, String d39,String d40,String d41, String d42, String d43, String d44, String d45, String d46,String e1, String e2, String e3, String e4, String e5, String e6, String e7, String e8, String e9,String e10, String e11, String e12,String f1, String f2, String f3, String f4, String f5, String f6, String f7, String f8, String f9,String f10, String f11) {
		super();
		this.a1 = a1;
        this.a2 = a2;
        this.b1=b1;
        this.b2=b2;
        this.b3=b3;
        this.b4=b4;
        this.b5=b5;
        this.b6=b6;
        this.b7=b7;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.c4=c4;
        this.c5=c5;
        this.c6=c6;
        this.c7=c7;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.d4=d4;
        this.d5=d5;
        this.d6=d6;
        this.d7=d7;
        this.d8=d8;
        this.d9=d9;
        this.d10=d10;
        this.d11=d11;
        this.d12=d12;
        this.d13=d13;
        this.d14=d14;
        this.d15=d15;
        this.d16=d16;
        this.d17=d17;
        this.d18=d18;
        this.d19=d19;
        this.d20=d20;
        this.d21=d21;
        this.d22=d22;
        this.d23=d23;
        this.d24=d24;
        this.d25=d25;
        this.d26=d26;
        this.d27=d27;
        this.d28=d28;
        this.d29=d29;
        this.d30=d30;
        this.d31=d31;
        this.d32=d32;
        this.d33=d33;
        this.d34=d34;
        this.d35=d35;
        this.d36=d36;
        this.d37=d37;
        this.d38=d38;
        this.d39=d39;
        this.d40=d40;
        this.d41=d41;
        this.d42=d42;
        this.d43=d43;
        this.d44=d44;
        this.d45=d45;
        this.d46=d46;
        this.e1=e1;
        this.e2=e2;
        this.e3=e3;
        this.e4=e4;
        this.e5=e5;
        this.e6=e6;
        this.e7=e7;
        this.e8=e8;
        this.e9=e9;
        this.e10=e10;
        this.e11=e11;
        this.e12=e12;
        this.f1=f1;
        this.f2=f2;
        this.f3=f3;
        this.f4=f4;
        this.f5=f5;
        this.f6=f6;
        this.f7=f7;
        this.f8=f8;
        this.f9=f9;
        this.f10=f10;
        this.f11=f11;



	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String geta1() {
		return a1;
	}
	public void seta1(String a1) {
		this.a1 = a1;
	}
    public String geta2() {
		return a2;
	}
	public void seta2(String a2) {
		this.a2 = a2;
	}

    public String getb1() {
		return b1;
	}
	public void setb1(String b1) {
		this.b1 = b1;
	}
    public String getb2() {
		return b2;
	}
	public void setb2(String b2) {
		this.b2 = b2;
	}
    public String getb3() {
		return b3;
	}
	public void setb3(String b3) {
		this.b3 = b3;
	}
    public String getb4() {
		return b4;
	}
	public void setb4(String b4) {
		this.b4 = b4;
	}
    public String getb5() {
		return b5;
	}
	public void setb5(String b5) {
		this.b5 = b5;
	}
    public String getb6() {
		return b6;
	}
	public void setb6(String b6) {
		this.b6 = b6;
	}
    public String getb7() {
		return b7;
	}
	public void setb7(String b7) {
		this.b7 = b7;
	}


    public String getc1() {
		return c1;
	}
	public void setc1(String c1) {
		this.c1 = c1;
	}
    public String getc2() {
		return c2;
	}
	public void setc2(String c2) {
		this.c2 = c2;
	}
    public String getc3() {
		return c3;
	}
	public void setc3(String c3) {
		this.c3 = c3;
	}
    public String getc4() {
		return c4;
	}
	public void setc4(String c4) {
		this.c4 = c4;
	}
    public String getc5() {
		return c5;
	}
	public void setc5(String c5) {
		this.c5 = c5;
	}
    public String getc6() {
		return c6;
	}
	public void setc6(String c6) {
		this.c6 = c6;
	}
    public String getc7() {
		return c7;
	}
	public void setc7(String c7) {
		this.c7 = c7;
	}

    public String getd1() {
		return d1;
	}
	public void setd1(String d1) {
		this.d1 = d1;
	}
    public String getd2() {
		return d2;
	}
	public void setd2(String d2) {
		this.d2 = d2;
	}
    public String getd3() {
		return d3;
	}
	public void setd3(String d3) {
		this.d3 = d3;
	}
    public String getd4() {
		return d4;
	}
	public void setd4(String d4) {
		this.d4 = d4;
	}
    public String getd5() {
		return d5;
	}
	public void setd5(String d5) {
		this.d5 = d5;
	}
    public String getd6() {
		return d6;
	}
	public void setd6(String d6) {
		this.d6 = d6;
	}
    public String getd7() {
		return d7;
	}
	public void setd7(String d7) {
		this.d7 = d7;
	}
    public String getd8() {
		return d8;
	}
	public void setd8(String d8) {
		this.d8 = d8;
	}
    public String getd9() {
		return d9;
	}
	public void setd9(String d9) {
		this.d9 = d9;
	}
    public String getd10() {
		return d10;
	}
	public void setd10(String d10) {
		this.d10 = d10;
	}
    public String getd11() {
		return d11;
	}
	public void setd11(String d11) {
		this.d11 = d11;
	}
    public String getd12() {
		return d12;
	}
	public void setd12(String d12) {
		this.d12 = d12;
	}
    public String getd13() {
		return d13;
	}
	public void setd13(String d13) {
		this.d13 = d13;
	}
    public String getd14() {
		return d14;
	}
	public void setd14(String d14) {
		this.d14 = d14;
	}
    public String getd15() {
		return d5;
	}
	public void setd15(String d15) {
		this.d15 = d15;
	}
    public String getd16() {
		return d16;
	}
	public void setd16(String d16) {
		this.d16 = d16;
	}
    public String getd17() {
		return d17;
	}
	public void setd17(String d17) {
		this.d17 = d17;
	}
    public String getd18() {
		return d18;
	}
	public void setd18(String d18) {
		this.d18 = d18;
	}
    public String getd19() {
		return d19;
	}
	public void setd19(String d19) {
		this.d19 = d19;
	}
    public String getd20() {
		return d20;
	}
	public void setd20(String d20) {
		this.d20 = d20;
	}
    public String getd21() {
		return d21;
	}
	public void setd21(String d21) {
		this.d21 = d21;
	}
    public String getd22() {
		return d22;
	}
	public void setd22(String d22) {
		this.d22 = d22;
	}
    public String getd23() {
		return d23;
	}
	public void setd23(String d23) {
		this.d23 = d23;
	}
    public String getd24() {
		return d24;
	}
	public void setd24(String d24) {
		this.d24 = d24;
	}
    public String getd25() {
		return d25;
	}
	public void setd25(String d25) {
		this.d25 = d25;
	}
    public String getd26() {
		return d26;
	}
	public void set2d6(String d26) {
		this.d26 = d26;
	}
    public String getd27() {
		return d27;
	}
	public void setd27(String d27) {
		this.d27 = d27;
	}
    public String getd28() {
		return d28;
	}
	public void setd28(String d28) {
		this.d28 = d28;
	}
    public String getd29() {
		return d29;
	}
	public void setd29(String d29) {
		this.d29 = d29;
	}
    public String getd30() {
		return d30;
	}
	public void setd30(String d30) {
		this.d30 = d30;
	}
    public String getd31() {
		return d31;
	}
	public void setd31(String d31) {
		this.d31 = d31;
	}
    public String getd32() {
		return d32;
	}
	public void setd32(String d32) {
		this.d32 = d32;
	}
    public String getd33() {
		return d33;
	}
	public void setd33(String d33) {
		this.d33 = d33;
	}
    public String getd34() {
		return d34;
	}
	public void setd34(String d34) {
		this.d34 = d34;
	}
    public String getd35() {
		return d35;
	}
	public void setd35(String d35) {
		this.d35 = d35;
	}
    public String getd36() {
		return d36;
	}
	public void setd36(String d36) {
		this.d36 = d36;
	}
    public String getd37() {
		return d37;
	}
	public void setd37(String d37) {
		this.d37 = d37;
	}
    public String getd38() {
		return d38;
	}
	public void setd38(String d38) {
		this.d38 = d38;
	}
    public String getd39() {
		return d39;
	}
	public void setd39(String d39) {
		this.d39 = d39;
	}
    public String getd40() {
		return d10;
	}
	public void setd40(String d40) {
		this.d40 = d40;
	}
    public String getd41() {
		return d41;
	}
	public void setd41(String d41) {
		this.d41 = d41;
	}
    public String getd42() {
		return d42;
	}
	public void setd42(String d42) {
		this.d42 = d42;
	}
    public String getd43() {
		return d43;
	}
	public void setd43(String d43) {
		this.d43 = d43;
	}
    public String getd44() {
		return d44;
	}
	public void setd44(String d44) {
		this.d44 = d44;
	}
    public String getd45() {
		return d45;
	}
	public void setd45(String d45) {
		this.d45 = d45;
	}
    public String getd46() {
		return d46;
	}
	public void setd46(String d46) {
		this.d46 = d46;
	}


    public String gete1() {
		return e1;
	}
	public void sete1(String e1) {
		this.e1 = e1;
	}
    public String gete2() {
		return e2;
	}
	public void sete2(String e2) {
		this.e2 = e2;
	}
    public String gete3() {
		return e3;
	}
	public void sete3(String e3) {
		this.e3 = e3;
	}
    public String gete4() {
		return e4;
	}
	public void sete4(String e4) {
		this.e4 = e4;
	}
    public String gete5() {
		return e5;
	}
	public void sete5(String e5) {
		this.e5 = e5;
	}
    public String gete6() {
		return e6;
	}
	public void sete6(String e6) {
		this.e6 = e6;
	}
    public String gete7() {
		return e7;
	}
	public void sete7(String e7) {
		this.e7 = e7;
	}
    public String gete8() {
		return e8;
	}
	public void sete8(String e8) {
		this.e8 = e8;
	}
    public String gete9() {
		return e9;
	}
	public void sete9(String e9) {
		this.e9 = e9;
	}
    public String gete10() {
		return e10;
	}
	public void sete10(String e10) {
		this.e10 = e10;
	}
    public String gete11() {
		return e11;
	}
	public void sete11(String e11) {
		this.e11 = e11;
	}
    public String gete12() {
		return e12;
	}
    public String getf1() {
		return f1;
	}
	public void setf1(String f1) {
		this.f1 = f1;
	}
    public String getf2() {
		return f2;
	}
	public void setf2(String f2) {
		this.f2 = f2;
	}
    public String getf3() {
		return f3;
	}
	public void setf3(String f3) {
		this.f3 = f3;
	}
    public String getf4() {
		return f4;
	}
	public void setf4(String f4) {
		this.f4 = f4;
	}
    public String getf5() {
		return f5;
	}
	public void setf5(String f5) {
		this.f5 = f5;
	}
    public String getf6() {
		return f6;
	}
	public void setf6(String f6) {
		this.f6 = f6;
	}
    public String getf7() {
		return f7;
	}
	public void setf7(String f7) {
		this.f7 = f7;
	}
    public String getf8() {
		return f8;
	}
	public void setf8(String f8) {
		this.f8 = f8;
	}
    public String getf9() {
		return f9;
	}
	public void setf9(String f9) {
		this.f9 = f9;
	}
    public String getf10() {
		return f10;
	}
	public void setf10(String f10) {
		this.f10 = f10;
	}
    public String getf11() {
		return f11;
	}
	public void setf11(String f11) {
		this.f11 = f11;
	}

}
