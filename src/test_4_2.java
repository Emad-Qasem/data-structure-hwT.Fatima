  public class test_4_2 {
    public static void main(String[] args)
    {
        LinkedList emad = new LinkedList();

		/* Use push() function to construct
		the below list 4 -> 5 -> 6 -> 7 -> 8 */
        emad.push(8);
        emad.push(7);
        emad.push(6);
        emad.push(5);
        emad.push(4);
        System.out.println(emad.findSecondLastNode(emad.start));
    }
}
