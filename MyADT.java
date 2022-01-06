import java.util.*;

public class MyADT {
	
	public class X {
		int value;
		int key;
		public X(int value,int key) {
			this.value=value;
			this.key=key;
		}
	}
	
	Set<X> Data1;
	Set<X> Data2;
	
	public MyADT() {
		Data1=new HashSet<X>();
		Data2=new HashSet<X>();
	}
	
	public void add1(int v) {
		if(Data1.isEmpty())
			Data1.add(new X(v,0));
		else {
			Iterator<X> i=Data1.iterator();
			int max=i.next().key;
			while(i.hasNext()) {
				int ikey=i.next().key;
				if(max<ikey)
					max=ikey;
			}
			Data1.add(new X(v,max+1));
		}
	}
	
	public void add2(int v) {
		if(Data2.isEmpty())
			Data2.add(new X(v,0));
		else {
			Iterator<X> i=Data2.iterator();
			int max=i.next().key;
			while(i.hasNext()) {
				int ikey=i.next().key;
				if(max<ikey)
					max=ikey;
			}
			Data2.add(new X(v,max+1));
		}
	}
	
	public int remove() {
		Set<X> x;
		if(Data1.isEmpty())
			x=Data2;
		else
			x=Data1;
		Iterator<X> i=x.iterator();
		X min=i.next();
		while(i.hasNext()) {
			X ikey=i.next();
			if(min.key>ikey.key)
				min=ikey;
		}
		x.remove(min);
		return min.value;
	}
}
