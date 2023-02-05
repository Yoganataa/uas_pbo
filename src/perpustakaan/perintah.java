/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Ynata
 */
public interface perintah {

  // Method abstrak untuk koneksi ke database
  void koneksi();

  // Method abstrak untuk menampilkan data pada tabel
  void tabel();

  // Method abstrak untuk mengosongkan data pada form
  void kosongkan();

  // Method abstrak untuk menghapus seluruh data pada tabel
  void ClearTabel();
}
