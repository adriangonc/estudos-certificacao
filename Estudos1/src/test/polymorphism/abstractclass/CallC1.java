package test.polymorphism.abstractclass;

public class CallC1 {
	public static void main(String qualquerCoisa[]) {
		SubClassC1 ab = (SubClassC1) (AbSubClassC1) new SubClassC1();
		ab.x();
	}
}
