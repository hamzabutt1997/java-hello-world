public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("        Hello World from Jenkins!        ");
        System.out.println("        Built with Docker Pipeline       ");
        System.out.println("        Developer: Hamza Shafiq          ");
        System.out.println("        Version: 1.0                     ");
        System.out.println("=========================================");
    }
}
```
```
Ctrl+S to save
      ↓
SourceTree → Stage → Commit → Push
      ↓
Jenkins → Build Now!
```

---

## Good News Though! 🎉
```
✅ Docker image pulled successfully
✅ Container created successfully
✅ Checkout stage worked
✅ Compile stage started

Only HelloWorld.java has wrong content!
One fix and pipeline will pass! 💪