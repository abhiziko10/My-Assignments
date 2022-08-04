package DAY_13_CORE_JAVA;

public class StringBufferDemo {
    public static void main(String[] args) {
        String name="Coditas";
        StringBuffer stringBuffer=new StringBuffer("Coditas");
        //concat
        name.concat("ELTP");
        System.out.println(name);

        stringBuffer.append("ELTP");
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        stringBuffer.insert(3,"Fun");
        System.out.println(stringBuffer);
        //System.out.println("Default Capacity" +stringBuffer.capacity());

        StringBuffer interns=new StringBuffer();

        StringBuffer interns_new=new StringBuffer("BATCH2");

        System.out.println("Default Capacity " +interns.capacity());

        System.out.println("default capacity " +interns_new.capacity());

        interns_new.ensureCapacity(51);

        System.out.println("Inters new capacity "+interns_new.capacity());;
    }
}
