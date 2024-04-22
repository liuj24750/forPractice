package 简单代码练习;
public class Test3181 {
	public static void main(String []args) {
		int []score= {72,89,65,58,87,91,53,82,71,93,76,68};
		int A=0;
		int B=0;
		int C=0;
		int D=0;
		int E=0;
		for(int i=0;i<score.length;i++) {
			if(score[i]>=90) {
				A=A+1;
			}else if(score[i]>=80&&score[i]<90) {
				B=B+1;
			}else if(score[i]>=70&&score[i]<80) {
				C=C+1;
			}else if(score[i]>=60&&score[i]<70) {
				D=D+1;
			}else if(score[i]<60) {
				E=E+1;
			}
		}
		System.out.println("有"+A+"人成绩为A"+"\t"+"有"+B+"人成绩为B"+"\t"+"有"+C+"人成绩为C"+"\t"+"有"+D+"人成绩为D"+"\t"+"有"+E+"人成绩为E,准备挨打");
			int []evaluate= {A,B,C,D,E};
		    for(int i=0;i<evaluate.length;i++) {
		    	System.out.println(evaluate[i]);
		    }
	}
}
