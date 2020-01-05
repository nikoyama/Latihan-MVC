/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihanmvc.controller;

import javax.swing.JOptionPane;
import latihanmvc.model.PelangganModel;
import latihanmvc.view.PelangganView;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program :
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTlp().getText();
        
        if (nama.equals("") && email.equals("") && noTlp.equals("")) {
            
        } else {
            model.resetForm();
        }
    }

    public void simpanForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTlp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if (noTlp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "no Tlp Masih Kosong");
        } else {
            model.simpanForm();
        }
    }
}
