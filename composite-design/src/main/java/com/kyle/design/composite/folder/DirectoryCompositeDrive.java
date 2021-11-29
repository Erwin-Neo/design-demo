package com.kyle.design.composite.folder;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class DirectoryCompositeDrive {

    public static void main(String[] args) {

        File qq = new File("QQ.exe");
        File wx = new File("WeChat.exe");

        Folder office = new Folder("Work Tools",2);

        File word = new File("Word.exe");
        File ppt = new File("PowerPoint.exe");
        File excel = new File("Excel.exe");

        office.add(word);
        office.add(ppt);
        office.add(excel);

        Folder wps = new Folder("Office",3);
        wps.add(new File("WPS.exe"));
        office.add(wps);

        Folder root = new Folder("Root",1);
        root.add(qq);
        root.add(wx);
        root.add(office);

        root.show();
    }
}
