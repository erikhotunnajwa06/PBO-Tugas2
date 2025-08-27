# Inheritance (Pewarisan Bertingkat)
Inheritance merupakan konsep dasar dalam PBO di mana sebuah kelas 
(class) dapat mewarisi atribut dan metode dari kelas lain. Dalam 
inheritance, terdapat hirarki kelas dengan dua lapisan, yakni:

• Kelas Induk (superclass) paling atas yang berisi atribut dan 
  metode umum.
  
• Kelas Turunan (subclass) yang mewarisi dari kelas induk dan 
  dapat menambah atau mengubah atribut/metode.
  
Contoh penerapan inheritance:

• Kelas Manusia sebagai kelas induk umum.

• Kelas Hewan sebagai subclass yang mewarisi Manusia.

Pewarisan ini membantu dalam reuse code, mengorganisasi kelas 
dalam hierarki, dan mempermudah pengelolaan program.

# Multi-Inheritance
Multi inheritance adalah kemampuan sebuah kelas untuk mewarisi 
properti dan metode dari lebih dari satu kelas induk (superclass). Dalam 
paradigma pemrograman berorientasi objek, ini memungkinkan sebuah 
kelas turunan menggabungkan sifat-sifat dari berbagai kelas induk 
sekaligus, sehingga kelas turunan dapat memiliki fitur yang lebih 
lengkap.

# Multi-Inheritance dengan Implements Interface
Java tidak mendukung multi-inheritance secara langsung (yaitu, sebuah 
kelas tidak dapat mewarisi dari lebih dari satu kelas). Namun, Java 
mendukung multi-inheritance melalui interface. Sebuah kelas dapat 
mengimplementasikan beberapa interface, yang memungkinkan kelas 
tersebut untuk memiliki perilaku dari beberapa sumber.

# Constructor
Constructor adalah sebuah metode khusus dalam pemrograman 
berorientasi objek yang secara otomatis dipanggil saat sebuah objek 
dari kelas tersebut dibuat. Fungsinya untuk menginisialisasi nilai awal 
properti objek tersebut sehingga objek siap digunakan segera setelah 
dibuat. Constructor digunakan untuk menginisialisasi 
objek.

# This dan Super
▪ Keyword “This” digunakan dalam konteks objek saat ini. Ini 
sering digunakan dalam constructor atau metode untuk 
membedakan antara variabel instance (atribut kelas) dan parameter 
metode atau constructor yang memiliki nama yang sama.

▪ Keyword “Super” digunakan untuk merujuk pada superclass 
(kelas induk) dari kelas saat ini. Ini dapat digunakan untuk 
memanggil constructor dari superclass atau untuk mengakses 
metode dan atribut dari superclass.
