package oct13102024;

public class DefaultConstructor {

    private String cat_name;
    private String cat_type;
    private int cate_num;

    public DefaultConstructor()
    {
       // super();
    }
    public int getCatNumer()
    {
        return cate_num;
    }

    public int setCatNumer(int cate_num)
    {
       return this.cate_num = cate_num;
    }
}
