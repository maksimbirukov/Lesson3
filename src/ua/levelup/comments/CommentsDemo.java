package ua.levelup.comments;

//    @see #field
//    @see #Constructor(Type, Type...)
//    @see #Constructor(Type id, Type id...)
//    @see #method(Type, Type,...)
//    @see #method(Type id, Type, id...)
//    @see Class
//    @see Class#field
//    @see Class#Constructor(Type, Type...)
//    @see Class#Constructor(Type id, Type id)
//    @see Class#method(Type, Type,...)
//    @see Class#method(Type id, Type id,...)
//    @see package.Class
//    @see package.Class#field
//    @see package.Class#Constructor(Type, Type...)
//    @see package.Class#Constructor(Type id, Type id)
//    @see package.Class#method(Type, Type,...)
//    @see package.Class#method(Type id, Type, id)
//    @see package


import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * @author maximbirukov
 * @version 1.1
 * @since 1.0
 */

// This is single line comment
/*
Multiline comment
 *bfgfgsf
 *sfdgsfgs
 *sdfgsfgs
 *dsfgsfg

 */
public class CommentsDemo {

    /**
     * @serial serialVersionUID
     */
    public static final long serialVersionUID = 1762844075018022260L;

    private final long param1;
    private final long param2;

    public CommentsDemo(long param1, int param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    /**
     * Default constructor
     *
     * @see #CommentsDemo(long, int)
     */
    public CommentsDemo() {
        this(0, 0);
    }


    /**
     * @return #param1
     * @param i vdvvzvv
     * @throws IllegalArgumentException in case of #param1 is less than 0
     */
    @Deprecated
    public long getParam1(int i) throws IllegalArgumentException {
        if(param1 < 0) {
            throw new IllegalArgumentException("please check param1");
        }
        return param1;
    }
}
