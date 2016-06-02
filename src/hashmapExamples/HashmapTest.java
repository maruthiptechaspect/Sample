/*  A HashMap contains values based on the key.
 *  It implements the Map interface and extends AbstractMap class.
 *  It contains only unique elements.
 *  It may have one null key and multiple null values.
 *  It maintains no order.
 */

package hashmapExamples;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
