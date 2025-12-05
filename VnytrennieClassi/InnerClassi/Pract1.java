package VnytrennieClassi.InnerClassi;

public class Pract1 {
    
    // Доступен только внутри самого Pract1
    private class PrivateInner {
        
    }
    
    
    // Доступен внутри Pract1 и в любом другом классе в том же пакете
    //  VnytrennieClassi.InnerClassi.
    class DefaultInner {
        
    }

    
    // Доступен внутри Pract1, в классах того же пакета, 
    // и в подклассах (даже если они  в другом пакете).
    protected class ProtectedInner {
        
    }

    
    // Доступен везде, где доступен Pract1
    public class PublicInner {
        
    }

    
}
