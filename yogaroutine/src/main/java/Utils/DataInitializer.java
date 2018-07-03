package Utils;

import com.sanya.yogyam.examples.simple.R;

import java.util.List;

import Model.Exercise;

public class DataInitializer {

    public static void initData(List<Exercise> list, int pos) {
        int i = pos;
        if (i == 0) {
            list.add(new Exercise(R.drawable.lolasana, "Lolasana"));
            list.add(new Exercise(R.drawable.pavanmuktasana, "Pavanmuktasana"));
            list.add(new Exercise(R.drawable.cobra_pose, "Bhujangasana"));
            list.add(new Exercise(R.drawable.poorna_shalabasana, "Purna-Salabhasana"));
            list.add(new Exercise(R.drawable.paschimottanasana, "Paschimottanasana"));
        }
        if (i == 1) {
            list.add(new Exercise(R.drawable.sashankasana, "Shashankasana"));
            list.add(new Exercise(R.drawable.setu_bandha_sarvangasana, "Setu-Bandha-Sarvangasana"));
            list.add(new Exercise(R.drawable.poorna_shalabasana, "Purna-Salabhasana"));
        }
        if (i == 2) {

            list.add(new Exercise(R.drawable.kapalbhati, "Kapalbhati"));
            list.add(new Exercise(R.drawable.siddhasana, "Siddhasana"));
            list.add(new Exercise(R.drawable.shirshasana, "Shirshasana"));
            list.add(new Exercise(R.drawable.sarvangasana, "Sarvangasana-1"));
            list.add(new Exercise(R.drawable.adva_matsyasana, "Adva-Matsyasana"));
            list.add(new Exercise(R.drawable.ardha_matsyasana, "Ardha-Matsyendrasana"));
            list.add(new Exercise(R.drawable.supta_vajrasana, "Supta-Vajrasana"));
            list.add(new Exercise(R.drawable.cobra_pose, "Bhujangasana"));
        }
        if (i == 3) {
            list.add(new Exercise(R.drawable.dhanurasana, "Dhanurasana"));
            list.add(new Exercise(R.drawable.siddhasana, "Siddhasana"));
            list.add(new Exercise(R.drawable.majrasana, "Majrasana"));
            list.add(new Exercise(R.drawable.cobra_pose, "Bhujangasana"));
            list.add(new Exercise(R.drawable.gomukhasana, "Gomukhasana"));
            list.add(new Exercise(R.drawable.adva_matsyasana, "Adva-Matsyasana"));
            list.add(new Exercise(R.drawable.shirshasana, "Shirshasana"));
            list.add(new Exercise(R.drawable.akarna_dhanurasana, "Akaran-Dhanurasana"));
            list.add(new Exercise(R.drawable.sarvangasana, "Sarvangasana-1"));
            list.add(new Exercise(R.drawable.chakrasana, " Chakrasana"));
            list.add(new Exercise(R.drawable.ardha_matsyasana, "Ardha-Matsyendrasana"));
            list.add(new Exercise(R.drawable.matsyendra, "Matsyendrasana"));
        }
        if (i == 4) {
            list.add(new Exercise(R.drawable.cobra_pose, "Bhujangasana"));
            list.add(new Exercise(R.drawable.adva_matsyasana, "Adva-Matsyasana"));
            list.add(new Exercise(R.drawable.poorna_shalabasana, "Purna-Salabhasana"));
            list.add(new Exercise(R.drawable.padmasana, "Padmasana"));
            list.add(new Exercise(R.drawable.sarvangasana, "Sarvangasana-1"));
            list.add(new Exercise(R.drawable.lolasana, "Lolasana"));
        }
        if (i == 5) {
            list.add(new Exercise(R.drawable.simhasana, "Simhasana"));
        }
        if (i == 6) {
            list.add(new Exercise(R.drawable.hastapadasana, "Hastapadasana"));
            list.add(new Exercise(R.drawable.shirshasana, "Shirshasana"));
            list.add(new Exercise(R.drawable.pavanmuktasana, "Pavanmuktasana"));
            list.add(new Exercise(R.drawable.halasana, "Halasana"));
            list.add(new Exercise(R.drawable.akarna_dhanurasana, "Akaran-Dhanurasana"));
            list.add(new Exercise(R.drawable.matsyendra, "Matsyendrasana"));
            list.add(new Exercise(R.drawable.vajrasana, "Vajrasana"));
        }
        if (i == 7) {
            list.add(new Exercise(R.drawable.mudra, "Yoga-Mudra"));
            list.add(new Exercise(R.drawable.shavasana, "Shavasana"));
            list.add(new Exercise(R.drawable.hastapadasana, "Hastapadasana"));
            list.add(new Exercise(R.drawable.parvatasana, "Parvatasana"));
            list.add(new Exercise(R.drawable.shirshasana, "Shirshasana"));
            list.add(new Exercise(R.drawable.trikonasana, "Trikonasana"));
        }
        if (i == 8) {
            list.add(new Exercise(R.drawable.shavasana, "Shavasana"));
            list.add(new Exercise(R.drawable.cobra_pose, "Bhujangasana"));
            list.add(new Exercise(R.drawable.mayurasana, "Mayurasana"));
            list.add(new Exercise(R.drawable.halasana, "Halasana"));
            list.add(new Exercise(R.drawable.sarvangasana, "Sarvangasana-1"));
            list.add(new Exercise(R.drawable.matsyendra, "Matsyendrasana"));
            list.add(new Exercise(R.drawable.mudra, "Yoga-Mudra"));
            list.add(new Exercise(R.drawable.mandukasana, "Mandukasana"));
        }
        if (i == 9) {
            list.add(new Exercise(R.drawable.eye, "Neck and Eye exercises"));
        }
        if (i == 10) {
            list.add(new Exercise(R.drawable.dhanurasana, "Dhanurasana"));
            list.add(new Exercise(R.drawable.cobra_pose, "Bhujangasana"));
            list.add(new Exercise(R.drawable.mayurasana, "Mayurasana"));
            list.add(new Exercise(R.drawable.trikonasana, "Trikonasana"));
        }
        if (i == 11) {
            list.add(new Exercise(R.drawable.shavasana, "Shavasana"));
            list.add(new Exercise(R.drawable.eye, "Neck and Eye exercises"));
            list.add(new Exercise(R.drawable.sitali, "Sitali"));
        }
        if (i == 12) {
            list.add(new Exercise(R.drawable.lolasana, "Lolasana"));
            list.add(new Exercise(R.drawable.katichakrasana, "Katti-Chakrasana"));
            list.add(new Exercise(R.drawable.cobra_pose, "Bhujangasana"));
            list.add(new Exercise(R.drawable.shavasana, "Shavasana"));
            list.add(new Exercise(R.drawable.tadasana, "Tadasana"));
            list.add(new Exercise(R.drawable.mayurasana, "Mayurasana"));
            list.add(new Exercise(R.drawable.halasana, "Halasana"));
            list.add(new Exercise(R.drawable.sarvangasana, "Sarvangasana-1"));
            list.add(new Exercise(R.drawable.matsyendra, "Matsyendrasana"));
            list.add(new Exercise(R.drawable.mudra, "Yoga-Mudra"));
            list.add(new Exercise(R.drawable.vajrasana, "Vajrasana"));
            list.add(new Exercise(R.drawable.mandukasana, "Mandukasana"));
        }
        if (i == 13) {
            list.add(new Exercise(R.drawable.cobra_pose, "Bhujangasana"));
            list.add(new Exercise(R.drawable.shavasana, "Shavasana"));
            list.add(new Exercise(R.drawable.poorna_shalabasana, "Purna-Salabhasana"));
            list.add(new Exercise(R.drawable.tadasana, "Tadasana"));
            list.add(new Exercise(R.drawable.halasana, "Halasana"));
            list.add(new Exercise(R.drawable.sarvangasana, "Sarvangasana-1"));
        }
        if (i == 14) {
            list.add(new Exercise(R.drawable.dhanurasana, "Dhanurasana"));
            list.add(new Exercise(R.drawable.cobra_pose, "Bhujangasana"));
            list.add(new Exercise(R.drawable.poorna_shalabasana, "Purna-Salabhasana"));
            list.add(new Exercise(R.drawable.sarvangasana, "Sarvangasana-1"));
            list.add(new Exercise(R.drawable.matsyendra, "Matsyendrasana"));
            list.add(new Exercise(R.drawable.vakrasana, "Vakrasana"));
        }
        if (i == 15) {
            list.add(new Exercise(R.drawable.paripoorna_navasana, "Paripurna-Navasana"));
        }
        if (i == 16) {
            list.add(new Exercise(R.drawable.uddiyan_bandha, "Uddiyan-bandha"));
            list.add(new Exercise(R.drawable.majrasana, "Majrasana"));
            list.add(new Exercise(R.drawable.cobra_pose, "Bhujangasana"));
            list.add(new Exercise(R.drawable.shavasana, "Shavasana"));
            list.add(new Exercise(R.drawable.adva_matsyasana, "Adva-Matsyasana"));
            list.add(new Exercise(R.drawable.halasana, "Halasana"));
            list.add(new Exercise(R.drawable.sarvangasana, "Sarvangasana-1"));
        }
        if (i == 17) {
            list.add(new Exercise(R.drawable.uddiyan_bandha, "Uddiyan-bandha"));
            list.add(new Exercise(R.drawable.majrasana, "Majrasana"));
            list.add(new Exercise(R.drawable.cobra_pose, "Bhujangasana"));
            list.add(new Exercise(R.drawable.shavasana, "Shavasana"));
            list.add(new Exercise(R.drawable.hastapadasana, "Hastapadasana"));
            list.add(new Exercise(R.drawable.halasana, "Halasana"));
            list.add(new Exercise(R.drawable.shirshasana, "Shirshasana"));
        }
        if (i == 18) {
            list.add(new Exercise(R.drawable.shavasana, "Shavasana"));
            list.add(new Exercise(R.drawable.shirshasana, "Shirshasana"));
            list.add(new Exercise(R.drawable.veerasana, "Virasana-2"));
            list.add(new Exercise(R.drawable.siddhasana, "Siddhasana"));
            list.add(new Exercise(R.drawable.tadasana, "Tadasana"));
        }
        if (i == 19) {
            list.add(new Exercise(R.drawable.dhanurasana, "Dhanurasana"));
            list.add(new Exercise(R.drawable.cobra_pose, " Bhujangasana"));
            list.add(new Exercise(R.drawable.uddiyan_bandha, "Uddiyan-bandha"));
            list.add(new Exercise(R.drawable.hastapadasana, "Hastapadasana"));
            list.add(new Exercise(R.drawable.halasana, "Halasana"));
            list.add(new Exercise(R.drawable.matsyendra, "Matsyendrasana"));
            list.add(new Exercise(R.drawable.mandukasana, "Mandukasana"));
            list.add(new Exercise(R.drawable.supta_vajrasana, "Supta-Vajrasana"));
            list.add(new Exercise(R.drawable.paschimottanasana, "Paschimottanasana"));
            list.add(new Exercise(R.drawable.ardha_matsyasana, "Ardha-Matsyendrasana"));
        }
        if (i == 20) {
            list.add(new Exercise(R.drawable.adva_matsyasana, "Adva-Matsyasana"));
            list.add(new Exercise(R.drawable.shirshasana, "Shirshasana"));
            list.add(new Exercise(R.drawable.halasana, "Halasana"));
        }
        if (i == 21) {
            list.add(new Exercise(R.drawable.dhanurasana, "Dhanurasana"));
            list.add(new Exercise(R.drawable.ushtrasana, "Ushtrasana"));
            list.add(new Exercise(R.drawable.cobra_pose, "Bhujangasana"));
            list.add(new Exercise(R.drawable.gomukhasana, "Gomukhasana"));
            list.add(new Exercise(R.drawable.tadasana, "Tadasana"));
            list.add(new Exercise(R.drawable.tiryak_tadasana, "Tiriyaka-Tadasana"));
            list.add(new Exercise(R.drawable.trikonasana, "Trikonasana"));
        }
        if (i == 22) {
            list.add(new Exercise(R.drawable.uddiyan_bandha, "Uddiyan-bandha"));
            list.add(new Exercise(R.drawable.shirshasana, "Shirshasana"));
            list.add(new Exercise(R.drawable.sarvangasana, "Sarvangasana-1"));
        }
        if (i == 23) {
            list.add(new Exercise(R.drawable.vajrasana, "Vajrasana"));
            list.add(new Exercise(R.drawable.shirshasana, "Shirshasana"));
            list.add(new Exercise(R.drawable.sarvangasana, "Sarvangasana-1"));
            list.add(new Exercise(R.drawable.matsyendra, "Matsyendrasana"));
        }
        if (i == 24) {
            list.add(new Exercise(R.drawable.cobra_pose, "Bhujangasana"));
            list.add(new Exercise(R.drawable.shirshasana, "Shirshasana"));
            list.add(new Exercise(R.drawable.halasana, "Halasana"));
            list.add(new Exercise(R.drawable.sarvangasana, "Sarvangasana-1"));
            list.add(new Exercise(R.drawable.shavasana, "Shavasana"));
            list.add(new Exercise(R.drawable.vajrasana, "vajrasana"));
        }
        if (i == 25) {
            list.add(new Exercise(R.drawable.dhanurasana, "Dhanurasana"));
            list.add(new Exercise(R.drawable.gomukhasana, "Gomukhasana"));
            list.add(new Exercise(R.drawable.matsyendra, "Matsyendrasana"));
            list.add(new Exercise(R.drawable.trikonasana, "Trikonasana"));
        }
        if (i == 26) {
            list.add(new Exercise(R.drawable.gomukhasana, "Gomukhasana"));
            list.add(new Exercise(R.drawable.setu_bandha_sarvangasana, "Setu-Bandha-Sarvangasana"));
        }
        if (i == 27) {
            list.add(new Exercise(R.drawable.uddiyan_bandha, "Uddiyan-bandha"));
            list.add(new Exercise(R.drawable.kapalbhati, "Kapalbhati"));
            list.add(new Exercise(R.drawable.dhanurasana, "Dhanurasana"));
            list.add(new Exercise(R.drawable.cobra_pose, "Bhujangasana"));
            list.add(new Exercise(R.drawable.majrasana, "Majrasana"));
            list.add(new Exercise(R.drawable.adho_mukha_svanasana, "Adho-Mukha-Svanasana"));
            list.add(new Exercise(R.drawable.balasana, "Balasana-1"));
            list.add(new Exercise(R.drawable.shirshasana, "Shirshasana"));
            list.add(new Exercise(R.drawable.sarvangasana, "Sarvangasana-1"));
            list.add(new Exercise(R.drawable.mudra, "Yoga-Mudra"));
            list.add(new Exercise(R.drawable.matsyendra, "Matsyendrasana"));
        }
        if (i == 28) {
            list.add(new Exercise(R.drawable.eye, "Neck and Eye exercises"));
            list.add(new Exercise(R.drawable.shavasana, "Shavasana"));
            list.add(new Exercise(R.drawable.bhastrika, "Bhastrika"));
        }
        if (i == 29) {
            list.add(new Exercise(R.drawable.sun_salutation, "Sun-Salutation"));
        }
        if (i == 30) {
            list.add(new Exercise(R.drawable.simhasana, "Simhasana"));
           // list.add(new Exercise(R.drawable.ujjai, "Ujjai"));
        }
        if (i == 31) {
            list.add(new Exercise(R.drawable.setu_bandha_sarvangasana, "Setu-Bandha-Sarvangasana"));
            list.add(new Exercise(R.drawable.adva_matsyasana, "Adva-Matsyasana"));
            list.add(new Exercise(R.drawable.sarvangasana, "Sarvangasana-1"));
        }
        if (i == 32) {
            list.add(new Exercise(R.drawable.shirshasana, "Shirshasana"));
            list.add(new Exercise(R.drawable.sarvangasana, "Sarvangasana-1"));
          //  list.add(new Exercise(R.drawable., "All Inverted Posture"));
        }
        if (i == 33) {
            list.add(new Exercise(R.drawable.uddiyan_bandha, "Uddiyan-bandha"));
            list.add(new Exercise(R.drawable.pavanmuktasana, "Pavanmuktasana"));
        }
        if (i == 34) {
            list.add(new Exercise(R.drawable.mudra, "Yoga-Mudra"));
        }
    }
}


