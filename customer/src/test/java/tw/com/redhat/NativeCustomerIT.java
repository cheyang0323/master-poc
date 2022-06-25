package tw.com.redhat;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeCustomerIT extends CustomerTest {

    // Execute the same tests but in native mode.
}