package FilePermission;

import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

public class File {
    private static void permission() throws IOException {
        String srg = "C:\\EdurekaIO\\java.txt";
        FilePermission file1 = new FilePermission("C:\\EdurekaIO\\-", "read");
        PermissionCollection permission = file1.newPermissionCollection();
        permission.add(file1);
        FilePermission file2 = new FilePermission(srg, "write");
        permission.add(file2);
        if(permission.implies(new FilePermission(srg, "read,write")))
            System.out.println("Read, Write permission granted to specific path at "+srg);
        else System.out.println("No permission granted to the specific path at "+srg);
    }

    public static void main(String[] args) throws IOException {
        permission();
    }
}
