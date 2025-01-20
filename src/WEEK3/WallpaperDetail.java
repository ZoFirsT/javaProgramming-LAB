package WEEK3; // กำหนด package ชื่อ WEEK3

import java.util.Scanner; // import Scanner class สำหรับรับข้อมูลจากผู้ใช้

// คลาส WallPaperUnit สำหรับเก็บข้อมูลวอลเปเปอร์แต่ละชิ้น โดยมีการ encapsulation ด้วย private fields
class WallPaperUnit {
    // ตัวแปร private สำหรับเก็บชื่อและความยาว เพื่อป้องกันการเข้าถึงโดยตรงจากภายนอก
    private String name;    // เก็บชื่อรูปแบบของวอลเปเปอร์
    private double length; // เก็บความยาวของวอลเปเปอร์เป็นเลขทศนิยม

    // เมธอด getter สำหรับดึงค่าชื่อ ตามหลัก encapsulation
    public String getName() {
        return name; // ส่งคืนค่าชื่อวอลเปเปอร์
    }

    // เมธอด getter สำหรับดึงค่าความยาว ตามหลัก encapsulation
    public double getLength() {
        return length; // ส่งคืนค่าความยาววอลเปเปอร์
    }

    // เมธอด setter สำหรับกำหนดค่าชื่อ ตามหลัก encapsulation
    public void setName(String name) {
        this.name = name; // กำหนดค่าชื่อให้กับ field name
    }

    // เมธอด setter สำหรับกำหนดค่าความยาว ตามหลัก encapsulation
    public void setLength(double length) {
        this.length = length; // กำหนดค่าความยาวให้กับ field length
    }
}

// คลาสหลักสำหรับแสดงรายละเอียดและจัดการระบบวอลเปเปอร์
public class WallpaperDetail {
    public static void main(String[] args) {
        // สร้าง Scanner object สำหรับรับค่าจากผู้ใช้ผ่าน System.in
        Scanner in = new Scanner(System.in);

        // Challenge Bonus: สร้างและแสดงข้อมูลวอลเปเปอร์ตัวอย่างเพื่อทดสอบการทำงานของคลาส WallPaperUnit
        WallPaperUnit wallpaper1 = new WallPaperUnit(); // สร้าง object ใหม่
        wallpaper1.setName("Classic Pattern"); // กำหนดชื่อวอลเปเปอร์
        wallpaper1.setLength(5.5); // กำหนดความยาว 5.5 หน่วย

        // แสดงข้อมูลวอลเปเปอร์ตัวอย่างที่สร้างขึ้น
        System.out.println("Wallpaper Name: " + wallpaper1.getName()); // แสดงชื่อ
        System.out.println("Wallpaper Length: " + wallpaper1.getLength()); // แสดงความยาว

        // Task 1: แสดงลวดลาย 3 แบบยอดนิยมที่มีให้เลือก
        System.out.println("=== Welcome to Customized Wallpaper System ==="); // แสดงข้อความต้อนรับ
        System.out.println("We have 3 popular styles here:"); // แจ้งจำนวนลวดลายที่มี
        
        // แสดงลวดลายที่ 1: ตัวเลขเรียงแบบสามเหลี่ยม โดยแต่ละแถวจะเพิ่มจำนวนตัวเลขขึ้นเรื่อยๆ
        System.out.println("=== Style 1 ==="); // หัวข้อลวดลายที่ 1
        int n = 5; // กำหนดขนาดตัวอย่างเป็น 5x5
        for(int row = 1; row <= n; row++) { // วนลูปแถว
            for(int col = 1; col <= row; col++) { // วนลูปหลักตามจำนวนแถว
                System.out.print(col + " "); // พิมพ์ตัวเลขตามลำดับพร้อมเว้นวรรค
            }
            System.out.println(); // ขึ้นบรรทัดใหม่เมื่อจบแต่ละแถว
        }

        // แสดงลวดลายที่ 2: ขีดเฉียงขึ้น โดยใช้สัญลักษณ์ _ และเว้นวรรค
        System.out.println("=== Style 2 ==="); // หัวข้อลวดลายที่ 2
        for(int row = 1; row <= n; row++) { // วนลูปแถว
            for(int col = 1; col <= n; col++) { // วนลูปหลัก
                if(col >= row) { // ถ้าตำแหน่งหลักมากกว่าหรือเท่ากับแถว
                    System.out.print("_"); // พิมพ์เครื่องหมาย _
                } else { // ถ้าไม่ใช่
                    System.out.print(" "); // เว้นวรรค
                }
                System.out.print(" "); // เว้นวรรคระหว่างสัญลักษณ์
            }
            System.out.println(); // ขึ้นบรรทัดใหม่
        }

        // แสดงลวดลายที่ 3: ตัวเลขและขีดผสม โดยแสดงตัวเลขในส่วนสามเหลี่ยมด้านซ้าย และขีดในส่วนที่เหลือ
        System.out.println("=== Style 3 ==="); // หัวข้อลวดลายที่ 3
        for(int row = 1; row <= n; row++) { // วนลูปแถว
            for(int col = 1; col <= n; col++) { // วนลูปหลัก
                if(col <= row) { // ถ้าตำแหน่งหลักน้อยกว่าหรือเท่ากับแถว
                    System.out.print(col + " "); // พิมพ์ตัวเลขตามลำดับ
                } else { // ถ้าไม่ใช่
                    System.out.print("_ "); // พิมพ์เครื่องหมาย _
                }
            }
            System.out.println(); // ขึ้นบรรทัดใหม่
        }

        // Task 2: รับค่าจากผู้ใช้และแสดงลวดลายตามที่เลือก พร้อมคำนวณราคา
        boolean stopProgram = false; // ตัวแปรควบคุมการทำงานของโปรแกรม
        int totalBill = 0; // ตัวแปรเก็บยอดรวมค่าใช้จ่าย
        
        // วนลูปรับค่าจนกว่าผู้ใช้จะเลือกออกจากโปรแกรม
        while (!stopProgram) {
            System.out.print("Please choose your style: "); // ขอให้ผู้ใช้เลือกลวดลาย
            int style = in.nextInt(); // รับค่าหมายเลขลวดลาย
            
            // ถ้าผู้ใช้ป้อน -1 ให้ออกจากโปรแกรม
            if (style == -1) {
                System.out.println("Bye"); // แสดงข้อความลาก่อน
                break; // ออกจากลูป
            }
            
            // รับค่าขนาดและสัญลักษณ์จากผู้ใช้
            System.out.print("Size: "); // ขอให้ผู้ใช้ระบุขนาด
            int size = in.nextInt(); // รับค่าขนาด
            System.out.print("Symbol: "); // ขอให้ผู้ใช้ระบุสัญลักษณ์
            char symbol = in.next().charAt(0); // รับค่าสัญลักษณ์ตัวแรก

            // แสดงลวดลายตามสไตล์ที่เลือก
            if (style == 1) {
                // สไตล์ 1: ตัวเลขเรียงแบบสามเหลี่ยม ตามขนาดที่ผู้ใช้กำหนด
                for (int row = 1; row <= size; row++) { // วนลูปแถว
                    for (int col = 1; col <= row; col++) { // วนลูปหลัก
                        System.out.print(col + " "); // พิมพ์ตัวเลขตามลำดับ
                    }
                    System.out.println(); // ขึ้นบรรทัดใหม่
                }
            } else if (style == 2) {
                // สไตล์ 2: สัญลักษณ์เฉียงขึ้น ใช้สัญลักษณ์ที่ผู้ใช้กำหนด
                for (int row = 1; row <= size; row++) { // วนลูปแถว
                    for (int col = 1; col <= size; col++) { // วนลูปหลัก
                        if (col >= row) { // ถ้าตำแหน่งหลักมากกว่าหรือเท่ากับแถว
                            System.out.print(symbol); // พิมพ์สัญลักษณ์ที่ผู้ใช้เลือก
                        } else { // ถ้าไม่ใช่
                            System.out.print(" "); // เว้นวรรค
                        }
                        System.out.print(" "); // เว้นวรรคระหว่างสัญลักษณ์
                    }
                    System.out.println(); // ขึ้นบรรทัดใหม่
                }
            } else if (style == 3) {
                // สไตล์ 3: ตัวเลขและสัญลักษณ์ผสม ใช้สัญลักษณ์ที่ผู้ใช้กำหนด
                for(int row = 1; row <= size; row++) { // วนลูปแถว
                    for(int col = 1; col <= size; col++) { // วนลูปหลัก
                        if(col <= row) { // ถ้าตำแหน่งหลักน้อยกว่าหรือเท่ากับแถว
                            System.out.print(col + " "); // พิมพ์ตัวเลขตามลำดับ
                        } else { // ถ้าไม่ใช่
                            System.out.print(symbol + " "); // พิมพ์สัญลักษณ์ที่ผู้ใช้เลือก
                        }
                    }
                    System.out.println(); // ขึ้นบรรทัดใหม่
                }
            } else {
                // ถ้าเลือกสไตล์ไม่ถูกต้อง ให้ออกจากโปรแกรม
                stopProgram = true; // กำหนดให้หยุดโปรแกรม
                System.out.println("Bye"); // แสดงข้อความลาก่อน
            }

            // Task 3: คำนวณราคารวมตามสไตล์ที่เลือก
            if (style == 1) {
                totalBill += 100;  // สไตล์ 1 ราคา 100 บาท (ราคาพื้นฐาน)
            } else if (style == 2) {
                totalBill += 200;  // สไตล์ 2 ราคา 200 บาท (ราคาปานกลาง)
            } else if (style == 3) {
                totalBill += 300;  // สไตล์ 3 ราคา 300 บาท (ราคาพรีเมียม)
            }
        }

        // แสดงราคารวมทั้งหมดที่ลูกค้าต้องชำระ
        System.out.println("Total Bill: " + totalBill); // แสดงยอดรวมค่าใช้จ่าย
        in.close();  // ปิด Scanner เพื่อคืนทรัพยากรให้ระบบ
    }
}