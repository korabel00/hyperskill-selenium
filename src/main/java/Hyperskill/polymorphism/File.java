package Hyperskill.polymorphism;

class File {

    protected String fullName;

    // constructor with a single parameter
    public File(String fullName) {
        this.fullName = fullName;
    }
    // getters and setters

    public void printFileInfo() {
        String info = this.getFileInfo(); // here is polymorphic behavior!!!
        System.out.println(info);
    }

    protected String getFileInfo() {
        return "File: " + fullName;
    }
}

class ImageFile extends File {

    protected int width;
    protected int height;

    // constructor

    public ImageFile(String fullName, int width, int height) {
        super(fullName);
        this.width = width;
        this.height = height;
    }

    // getters and setters

    @Override
    protected String getFileInfo() {
        return String.format("Image: %s, width: %d, height: %d", fullName, height, width);
    }
}

class Run {
    public static void main(String[] args) {
        File img = new ImageFile("/path/to/file/img.png", 640, 480); // assigning an object
        File file = new File("rger"); // assigning an object
        //Now, when we call the method printFileInfo, it invokes the overridden version of the method getFileInfo.
        img.printFileInfo(); // It prints "Image: /path/to/file/img.png, width: 480, height: 640"
        file.printFileInfo();
    }
}