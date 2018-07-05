package DymasticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public final class ProxySubject extends Proxy   
    implements Subject   
{   
    private static Method m1;   
    private static Method m0;   
    private static Method m3;   
    private static Method m2;   
    public ProxySubject(InvocationHandler invocationhandler)   
    {   
        super(invocationhandler);   
    }     
    
    public final void doSomething()   
    {   
        try  
        {   
            super.h.invoke(this, m3, null);   
            return;   
        }   
        catch(Error _ex) { }   
        catch(Throwable throwable)   
        {   
            throw new UndeclaredThrowableException(throwable);   
        }   
    }   
   
    static    
    {   
        try  
        {   
            m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[] {   
                Class.forName("java.lang.Object")   
            });   
            m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);   
            m3 = Class.forName("Subject").getMethod("doSomething", new Class[0]);   
            m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);   
        }   
        catch(NoSuchMethodException nosuchmethodexception)   
        {   
            throw new NoSuchMethodError(nosuchmethodexception.getMessage());   
        }   
        catch(ClassNotFoundException classnotfoundexception)   
        {   
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());   
        }   
    }   
}