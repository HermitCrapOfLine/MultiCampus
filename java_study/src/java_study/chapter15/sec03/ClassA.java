package java_study.chapter15.sec03;

import java.io.Serializable;

public class ClassA implements Serializable {
	int field1;
	ClassB field2 = new ClassB();

	// 아래는 직렬화에서 제외
	static int field3;
	transient int field4;
}
