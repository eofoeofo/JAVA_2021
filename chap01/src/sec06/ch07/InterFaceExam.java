package sec06.ch07;

public class InterFaceExam {
	public static void main(String[] args) {
//		LGTv tv1 = new LGTv();
//		RemoteControl rc = tv1;
//		rc.volumeUp();
//		tv1.volumeUp();
//		rc.volumeDown();
//		rc.chkVolume();
		
		RemoteControl rc1 = new LGTv();
		RemoteControl rc2 = new SamsungTv();
		
		rc1.volumeUp();
		rc2.volumeUp();
		
		rc1.chkVolume();
		rc2.chkVolume();
		
	}
}
