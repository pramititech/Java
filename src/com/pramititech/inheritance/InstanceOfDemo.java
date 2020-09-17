package com.pramititech.inheritance;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class InstanceOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Parent Reference and Parent Object
		InstanceDemoParent ref1=new InstanceDemoParent();
		//Child Reference and Child Object
				InstanceDemoChild ref2=new InstanceDemoChild();
				
				//Parent Reference and Child Object
				InstanceDemoParent ref3=new InstanceDemoChild();
				
				System.out.println(ref1 instanceof InstanceDemoParent );
				System.out.println(ref1 instanceof InstanceDemoChild );
				
				System.out.println(ref2 instanceof InstanceDemoParent );
				System.out.println(ref2 instanceof InstanceDemoChild );
				
				System.out.println(ref3 instanceof InstanceDemoParent );
				System.out.println(ref3 instanceof InstanceDemoChild );
		
	}

}
