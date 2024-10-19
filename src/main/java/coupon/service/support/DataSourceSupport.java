package coupon.service.support;

import java.util.function.Supplier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DataSourceSupport {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public <T> T executeOnWriter(Supplier<T> supplier) {
        return supplier.get();
    }
}