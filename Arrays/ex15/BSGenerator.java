package ex15;

import arrays.BerylliumSphere;
import net.mindview.util.Generator;

public class BSGenerator implements Generator<BerylliumSphere>{

	@Override
	public BerylliumSphere next() {
		BerylliumSphere bs = new BerylliumSphere();
		return bs;
	}
	
}