/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.medicamento;

/**
 *
 * @author Rober19
 */
public class medicamentoController {

    public medicamento[] add(medicamento m1, medicamento[] mbox1) {
        medicamento[] tempBox = new medicamento[mbox1.length];

        if (mbox1.length == 0) {
            mbox1 = new medicamento[1];
        }

        if (mbox1[0] == null) {
            mbox1[mbox1.length - 1] = m1;
        } else {
            tempBox = mbox1;
            mbox1 = new medicamento[mbox1.length + 1];
            for (int i = 0; i < tempBox.length; i++) {
                mbox1[i] = tempBox[i];
            }
            mbox1[mbox1.length - 1] = m1;
        }

        return mbox1;
    }

    public medicamento[] remove(int index, medicamento[] mbox1) {
        medicamento[] tempBox = mbox1;
        mbox1[index] = null;

        mbox1 = new medicamento[mbox1.length - 1];

        for (int i = 0; i < mbox1.length; i++) {
            if (i >= index) {
                mbox1[i] = tempBox[i + 1];
            } else {
                mbox1[i] = tempBox[i];
            }
        }

        return mbox1;
    }

    public medicamento get(int index, medicamento[] mbox1) {
        return mbox1[index];
    }

    public medicamento[] clear(medicamento[] mbox1) {
        mbox1 = new medicamento[0];
        return mbox1;
    }

    public static void main(String[] args) {
        medicamento m1 = new medicamento("111", "", "", true);
        medicamento[] box = new medicamento[0];

        medicamentoController mc = new medicamentoController();

        box = mc.add(m1, box);
        box = mc.remove(0, box);
        box = mc.add(m1, box);

        for (medicamento p1 : box) {
            System.out.println(p1.getNombre());
        }
    }

}
