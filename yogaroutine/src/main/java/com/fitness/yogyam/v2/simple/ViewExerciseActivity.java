package com.sanya.yogyam.v2.simple;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.hanks.htextview.HTextView;

public class ViewExerciseActivity extends AppCompatActivity {


    private String caution;
    private TextView explainhow,explain;
    private String how,release;
    private ImageView imageDetail;
    private String url;
    private String name;
    private TextView title,text1,text2;
    HTextView hTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_exercise);
        explainhow=findViewById(R.id.explainhow);
        explain=findViewById(R.id.explain);
        title = (TextView) findViewById(R.id.title);
        text1=findViewById(R.id.text);
        text2=findViewById(R.id.text2);
       imageDetail =  findViewById(R.id.image_detail);


        if (getIntent() != null) {
            url= getIntent().getStringExtra("imageId");
            name = getIntent().getStringExtra("name");

            title.setText(name);
            if (this.name.equals("Lolasana")) {
                this.how = "Start from Padmasana and bring the hands to the floor on the outside of the thighs.\nInhale and press down into the palms as you engage the abdomen and lift the legs and buttocks off the floor.\nTake several breaths and release.";
                this.caution = "Not for the persons who have recent or chronic wrist or back injury.";
                this.release = "To release, come back to the padmasana position loose your legs and relax.";
            } else if (this.name.equals("Pavanmuktasana")) {
                this.how = "Lie on your back. Hug your knees into your chest, while you keep your head, neck and shoulders relaxed and on the floor.\nBreathe normal.\nFocus: Close your eyes or gaze beyond your knees and relax your back muscles.\nHold the posture for as long as it feels good. Practice this posture after backbends to release the muscles.";
                this.release = "While inhaling release both the legs.\nOne must rest before repeating the exercise.";
                this.caution = "1.Pregnant women should not perform this asana.\n2.People with serious back conditions, such as sciatica and slipped disc should avoid this asana.";

            } else if (this.name.equals("Bhujangasana")) {
                this.how = "Lie down on the floor with your legs together and your palms down under your shoulders and rest your forehead on the floor.\nYour elbows should touch your middle portion of the body.\nInhale, and raise the head and chest above the navel area, upwards.\nTighten the legs from the waist down to the toes.\nHold your breath and retain in the same position for a while.";
                this.release = "Exhale, and simultaneously lower the head towards the floor.\nRelax your body and rest with your right or left cheek on the floor for about 6 seconds.";
                this.caution = "1.Not for the people who are suffering from peptic ulcer, hernia or hyperthyroid.\n2.Do not practice Bhujangasana while pregnancy.";
            } else if (this.name.equals("Purna-Salabhasana")) {
                this.how = "Lie face down on the floor on your stomach, hands stretched backwards close to the body and the legs straight. Making fists of the hands bring them together beneath the thighs with the wrists touching.\nInhale as much air as you can. Holding your breath make your head straight and put the chin on the floor (on a folded blanket or towel). Tighten both the legs and lift them up as high as you can. Do not bend the knees.\nRemain in the same posture for a few seconds.\nExhale and simultaneously lower the legs slowly to the floor. Do not drop the legs. By the time the legs touch the floor you should finish exhaling. You have completed one round of a most strenuous posture. Relax.";
                this.release = "Stay for 30 seconds to 1 minute, then release with an exhalation.\nTake a few breaths and repeat 1 or 2 times more if you like.";
                this.caution = "1.Headache\n2.Serious back injury\n3.People with neck injuries\nShould keep their head in a neutral position by looking down at the floor; they might also support the forehead on a thickly folded blanket.";
            } else if (this.name.equals("Paschimottanasana")) {
                this.how = "From Staff Pose - Dandasana bring the arms straight out to the sides and up over your head.\nInhale and draw the spine up long.\nAs you exhale, begin to come forward, hinging at the hips.\nOn each inhale, extend the spine and on each exhale come a bit further into the forward bend.\nKeep the neck the natural extension of the spine.\nDo not round the back.\nTake hold of the ankles or shins, whichever you can reach.";
                release = "Stay in the pose anywhere from 1 to 5 minutes. To come up, release the hands, straighten the elbows and lift the torso away from the thighs, inhale and lift the torso up in a flat back by pulling the tailbone down and into the pelvis and engaging the abdominal muscles";
                this.caution = "1.Not for the people who have the problem of asthma and diarrhea.\n2.Back injury: Only perform this pose under the supervision of an experienced teacher.";
            } else if (this.name.equals("Shashankasana")) {
                this.how = "Sit with legs folded backwards, heels apart, knees and toes together (sit in vajrasana).\nAdjust your hips between the heels (Vajrasana). Slowly raise your arms over the head.\nWhile exhaling, slowly bend forward and stretch your palms on the floor with abdomen pressing against the thighs.\nThen bring your face downwards and touch the floor with the forehead without raising the buttocks. Inhaling slowly, return to an upright position, and then reverse the process.";
                release = "To release, slowly revert to the normal position of Vajrasana. You may do this asana at least 8 to 10 times.\n";
                this.caution = "Do not release the ankles from their position, without raising the back.\nNot for the people who are suffering from pain in the hip joint.";
            } else if (this.name.equals("Setu-Bandha-Sarvangasana")) {
                this.how = "Lie in Supine pose (Shavasana) on the floor. Bend your knees and set your feet on the floor, heels as close to the sitting bones possible.\nExhale and, pressing your inner feet and arms actively into the floor, push your tailbone upward toward the pubis, firming (but not hardening) the buttocks, and lift the buttocks off the floor. Keep your thighs and inner feet parallel. Clasp the hands below your pelvis and extend through the arms to help you stay on the tops of your shoulders.\nLift your buttocks until the thighs are about parallel to the floor. Keep your knees directly over the heels, but push them forward, away from the hips, and lengthen the tailbone toward the backs of the knees. Lift the pubis toward the navel.\nLift your chin slightly away from the sternum and, firming the shoulder blades against your back, press the top of the sternum toward the chin. Firm the outer arms, broaden the shoulder blades, and try to lift the space between them at the base of the neck (where it's resting on the blanket) up into the torso.";
                release = "Stay in the pose anywhere from 30 seconds to 1 minute. Release with an exhalation, rolling the spine slowly down onto the floor.";
                this.caution = "1.Neck injury: avoid this pose unless you are practicing under the supervision of an experienced teacher.\n2.If necessary, place a thickly folded blanket under your shoulders to protect your neck.";
            } else if (this.name.equals("Siddhasana")) {
                this.how = "Sit down with both legs outstretched.\nBend the left knee and place the sole of the left foot against the right thigh so that the heel touches the perineum.\nBend the right knee and put the right heel against the public bone.\nKeep hands with palms open if done between sunrise and sunset; otherwise reverse the palms.\nThe spine should always be held erect.";
                release = "To exit, slide the right foot forward off the left foot, straighten the right leg and do the same with the left leg, returning back into dandasana.\n";
                this.caution = "1.Siddhasana should not be practiced by those with sciatica.\n2.For men who are interested in maintaining sexual relations (ie. with no long term commitment to celibacy), use a soft sitting support to lift the genitals high enough so that the base of the penis is not compressed.\n3.Take care to situate the heels perfectly in the midline.";
            } else if (this.name.equals("Shirshasana")) {
                this.how = "Firstly kneel down on the mat. Then interlock the fingers of your hands and place them and your forearms on the extra padding on the yoga mat.\nKeep your elbows close together. Place the back of your head into the hollow of the palms.\nNow, rise up off your knees and take a step or two towards the head.\nInhale, and slowly raise the legs until they are vertical.\nNow, keep your back straight and try to relax and breathe deeply and slowly from the abdomen.\nNow, concentrate on the brain or the pineal gland between the eyebrows.";
                release = "To release or to come down, bend your knees and lower one leg and then the other.\nFor the beginners, just ask your friend to hold one of your legs while you lower the other leg.";
                this.caution = "1.Not for the persons who have high or low blood pressure, atherosclerosis (blocked blood vessels), any history of strokes, serious eye disease, pus in ears, suffering from constipation, suffering from neck injury, or also who have organically defective pituitary.\n2.But after recovering from these diseases you can try do this asana.\n";
            } else if (this.name.equals("Sarvangasana-1")) {
                this.how = "Lie on the back quite flat. Slowly raise the legs.\nLift the trunk, hips, and legs quite vertically.\nSupport the back with the two hands, one on either side.\nRest the elbows on the ground. Press the chin against the chest (Jalandhara Bandha).\nAllow the back-shoulder portion and neck to touch the ground closely.\nDo not allow the body to shake or move to and fro. Keep the legs straight.";
                release = "To release, bring the legs down very, very slowly with elegance and not with any jerks.";
                this.caution = "1.Pregnancy: If you are experienced with this pose, you can continue to practice it late into pregnancy. However, don't take up the practice of Sarvangasana after you become pregnant.\n2.Not for the persons who have the problem of diarrhea, headache, high blood pressure, menstruation, neck injury.";
            } else if (this.name.equals("Adva-Matsyasana")) {
                this.how = "Lie down on the ground on your back in shavasana .\nNow, keep your buttocks on the floor, inhale and raise the head, shoulder, back and the upper arms off the floor arching the back and raising the chest up.\nTilt your head back and place the top of the head flat on the ground.\nNow, raise your elbows off the floor and bring your hands up just below your chest and join them at the palms with the fingers pointing straight up (or we can say, in Anjali mudra).\nThen breathe gently through the nostrils to remain longer in the pose.";
                release = "When you think itâ€™s enough for you or you feel tired then come back to shavasana.";
                this.caution = "1.This asana can also be tried with padamasana but the beginners should not do this with padamasana because first one will be easier for the beginners.\n2.The persons who have migraine, high or low blood pressure and serious neck or back injury.";
            } else if (this.name.equals("Ardha-Matsyendrasana")) {
                this.how = "Sit down on the floor with your legs straight out in front of you and buttocks on the floor.\nBend the right leg at the knee and place the heel tight at the perineum.\nKeep the foot of the left leg by the side of the right thigh near the knee.\nNow, bring the right hand round the outer side of the left knee passing between the chest and the knee and catch hold of the left big toe.\nThe right shoulder blade rests on the outer side of the left knee.\nTake the left hand round the back and try to catch the right thigh. Now look back over the left shoulder.\nNow, keep your trunk in vertical position and keep in the pose for a while.";
                release = "Release the position with an exhalation.\nThen come back to the starting position.";
                this.caution = "Not for the persons who have spine or back injury.";
            } else if (this.name.equals("Supta-Vajrasana")) {
                this.how = "Sit in Vajrasana.\nSlowly take the help of right elbow, then left elbow and place them on the ground towards backside.\nSlowly straighten you hands and completely lie on your back.\nShoulders should rest on the ground. Beginners may keep their hands on respective thighs. Knees should remain together.\nAfter practicing this position well, making the shape of a scissor with both hands bring them under the shoulders.\nRight hand will remain under left shoulder and left under the right, head in the middle of them. Stay in the position for a while and then release.";
                release = "While returning to the original position, first take out your hands and place it by the side of your body.\nNow, with the help of elbows sit as in the first position.";
                this.caution = "There should never be more than normal pressure on the back, arms, and the ankle joints while doing this exercise.";
            } else if (this.name.equals("Dhanurasana")) {
                this.how = "Lie down on your stomach.\nBend your knees and hold the ankles.\nInhale and pull your hands and push with your legs, knees together, till the trunk forms an arc shape with only the stomach on the ground.\nLook up and remain in the position for a while.";
                release = "Retain breath and then exhale and lie flat.\nAfter releasing, lie in shavasan for a while.";
                this.caution = "1.Not for persons suffering from peptic ulcer, hernia, or cases of thyroid or endocrine gland disorders.\n2.Do not try to stay in position if you are feeling too much pain.";
            } else if (this.name.equals("Majrasana")) {
                this.how = "Crouch down, on all fours, like a cat; knees hip width apart, hands shoulder width apart, under your shoulders. Arms remain straight.\nLoosen your spine by contracting the abdominal muscles during exhalation, rounding your back towards the ceiling, tucking the tail-bone in and lowering the head with chin towards your chest.\nInhaling, release the contraction, tip the tail bone upwards, dip your spine towards the floor and raise your head. Expand your chest and complete inhalation.\nAlternate these positions several times, coordinating the movements with your breath.";
                release = "To release, Come back to the first posture and then relax in a comfortable posture.";
                this.caution = "If you have weak wrists, make fists and put your knuckles on the floor, thumbs forward.";
            } else if (this.name.equals("Gomukhasana")) {
                this.how = "From Knee to Ankle, slide the knees to center stacking the right knee directly over the left.\nIt may be helpful to come forward onto the hands and knees to align the knees.\nThen separate the feet and come back to sit between the feet.\nBring the left arm up towards the ceiling.\nBend the left elbow, bringing the left hand down the center of the back.\nBring the right arm out to the right side, bend the elbow and bring the right arm up the center of the back.\nHold hands behind the back.\nDraw both elbows toward the center.";
                release = "Hold the position for four to eight breaths and then come back to the relaxed posture.";
                this.caution = "Not for the persons who have serious neck, shoulder or knee problems.";
            } else if (this.name.equals("Akaran-Dhanurasana")) {
                this.how = "Bend the left leg in knee and keep the foot on the thigh of right leg. Keep the right leg straight.\nHold the big toe of the left leg with right hand; hold it between the thumb and index finger and other 3 fingers to have a good grip of the thumb. Hold big toe of the right leg with left hand.\nExhale and inhaling start lifting the left foot with the right hand and pull it up to ear. Keep the trunk and neck erect and the sight fixed on the other end of the left hand.\nContinue normal breathing.";
                release = "Inhale and exhaling, start bringing the foot down and place it on the thigh.\nRestore the hands to their place.\nTake the left foot to original position.";
                this.caution = "One should avoid the temptation of attaining the ideal position if strain is unbearable.";
            } else if (this.name.equals("Chakrasana")) {
                this.how = "Lie facing upward on the floor.\nBend your knees and set your feet on the floor, heels as close to the sitting bones as possible.\nBend your elbows and spread your palms on the floor beside your head. Forearms relatively perpendicular to the floor, fingertips pointing towards shoulders.\nWhile inhaling, slowly begin to raise the head, back and buttocks off the floor while arcing the spine.\nHold for the duration of the held inhaled breath.";
                release = "When you can't hold the breath comfortable any longer, slowly exhale and return the back to the floor.\nSlide the legs out straight returning to the shavasan.";
                this.caution = "Not for the persons, who have back injury, carpel tunnel and syndrome, diarrhoea, headache, heart problems, high or low blood pressure.";
            } else if (this.name.equals("Matsyendrasana")) {
                this.how = "Sit on the floor with your legs straight out in front of you, buttocks can be supported on a folded blanket.\nStep the right foot over the left leg and stand it on the floor outside your left hip. The right knee will point directly up at the ceiling.\nExhale and twist toward the inside of the right thigh. Press the right hand against the floor just behind your right buttock, and set your left upper arm on the outside of your right thigh near the knee. Pull your front torso and inner right thigh snugly together.\nPress the inner right foot very actively into the floor, lengthen through the body and continue to lengthen the tailbone into the floor.\nContinue the twist of the torso by turning it to the right.\nWith every inhalation lift a little more through the sternum, pushing the fingers against the floor to help.\nTwist a little more with every exhalation.\nBe sure to distribute the twist evenly throughout the entire length of the spine; don't concentrate it in the lower back, i.e. right shoulder rolling back as the left shoulder rolls forward.";
                release = "Stay for 30 seconds to 1 minute, then release with an exhalation, return to the starting position, and repeat to the left for the same length of time.";
                this.caution = "1.Women more than 2 or 3 months pregnant should avoid this practice.\n2.People suffering from peptic ulcer, hernia or hyperthyroidism should only practice this pose under expert guidance.\n3.People with sciatica or slipped disc may benefit from this asana, but great care should be taken.";
            } else if (this.name.equals("Padmasana")) {
                this.how = "Keep the right foot on the left thigh.\nStart bouncing the right knee.\nIf the bouncing knee easily touches the floor, then bend the left knee, take hold of the left foot with both hands, gently glide it over the crossed right leg and place it on the right thigh.\nThis will give symmetrical placement of the legs and you are in lotus position.\nThe hands should be kept on the knees with palms open, and the thumb and second finger of each hand should touch forming a letter O.";
                release = "Stay in the position as long as you can and after that release the pose and be comfortable.\n";
                this.caution = "1.Those suffering from chronic knee pain should not practice it.\n2.Those getting cramps in calf-muscles should practice it cautiously.\n3.After keeping one leg on the other thigh, if other leg can not be placed fully on the other thigh, do not try to put it forcefully.";
            } else if (this.name.equals("Simhasana")) {
                this.how = "Sit in Vajrasana .\nNow raise your buttock a little and cross the heel and toes of the right leg over that of left leg.\nSit on the heels and place both hands on the respective knees. Spread out the fingers.\nBring out the tongue as much as possible. Gaze should be on Nasal.";
                release = "While returning back to the original position, take the tongue in, release the tension, loosen your hands and come back to the original position.";
                this.caution = "If you have a knee injury, always be cautious in flexed-knee sitting positions and, if necessary, sit on a chair to do the pose";
            } else if (this.name.equals("Hastapadasana")) {
                this.how = "Stand erect and keep both the legs touching each other.\n" +
                        "Take a deep breath and keep both the hands up.\n" +
                        "Now go on exhaling. Bend in the front.\n" +
                        "Place both the hands on the ground on both the sides of the legs. Touch the head on the knees.\n" +
                        "Do not bend the knees. Hold the breath outside. Stand steadily in this bent position.";
                this.release = "Maintain position and suspension of breath 6 seconds.\n" +
                        "Inhale and then return to the starting position.";
                this.caution = "Not for the people who have spinal problems, vertigo, hernia, cardiac problem, hypertension, ulcers, myopia.";
            } else if (this.name.equals("Halasana")) {
                this.how = "From the shoulder stand pose, bring your feet at an angle above your head.\n" +
                        "Bring your hands behind your back to support and control the descent.\n" +
                        "If possible bring gently the toes to the floor keeping your knees straight. Once the feet touch the floor bring your arms flat on the floor with palms down touching the floor.\n" +
                        "For more advanced students, interlock the fingers keeping your hands in contact with the floor.\n" +
                        "Try breathing as comfortably and rhythmically as possible.\n" +
                        "If you do not have the necessary flexibility to do the full posture, it is okay to keep your feet up in the air and to let your knees be bent as required by your back muscles.\n" +
                        "Hold the asana from a few seconds to one minute.";
                release = "To come out of the posture, lift your feet up to a 45 degree angle, bring your palms flat on the floor and slowly bring your back, hips, legs and feet onto the floor paying attention to keep the head and shoulders on the floor.\n" +
                        "Relax on your back.";
                this.caution = "You should not do halasana if you have any neck problems. If you suffer from \"rounded shoulders\" a.k.a. kyphosis, do not stretch too far and do not hold the posture too long. Consult your doctor or chiropractor before practicing.";
            } else if (this.name.equals("Vajrasana")) {
                this.how = "Sit with legs extended together, hands by the side of the body, palm resting on the ground, fingers of the hands together pointing forward.\n" +
                        "Fold the right leg at the knee and place the foot under the right buttock. Sole will remain inside.\n" +
                        "Similarly folding the left foot, place it under the left buttock.\n" +
                        "Hands resting on the respective thighs.\n" +
                        "Sit erect, gaze in front and then close the eyes.";
                release = "While returning to the original position, bend little towards right side take out your left leg and extend it.\n" +
                        "Similarly extend your right leg and return to the original position.";
                this.caution = "While sitting on the bent feet, the heels should remain out and toes inside. Soles upward.\n" +
                        "Do not sit on the heels.";
            } else if (this.name.equals("Yoga-Mudra")) {
                this.how = "From a position sitting on your heels, press your sitting bones downward.\n" +
                        "Press the crown of your head away from your shoulders and feel the elongation of your spine.\n" +
                        "Bring your hands behind your back, interlacing your fingers and, if possible, drawing the heels of your palms together. Press your hands away from your shoulders, allowing your arms to elongate, your shoulder blades to come together, and your chest to expand.\n" +
                        "Lift your tailbone and allow the lifting to extend your torso forward over your knees, bringing your forehead to rest on the ground.\n" +
                        "Allow your arms to come over your head, pressing your little fingers toward the floor in front of you.";
                this.release = "To release, press your shins downward and drop your tailbone as you return to the starting position.";
                this.caution = "Diabetic patients should not perform this asana.\n" +
                        "People with serious eye, heart or back conditions should avoid doing this asana.";
            } else if (this.name.equals("Parvatasana")) {
                this.how = "Start from Padmasana , take both the hands forward and lock the fingers of both the hands together.\n" +
                        "Take the hands over the head and turn the palms downside up facing the roof. Stretch the body upwards with the arms stretched towards the sky.\n" +
                        "Stabilize the position and continue normal breathing.";
                this.release = "Relax the body and bring the hands as in position 1 in figure above.\n" +
                        "Take the position as in Padmasana.\n" +
                        "Straighten the left leg in the knee then straighten right leg.\n" +
                        "Get both the legs together, take the sitting posture.";
                this.caution = "Those having complaints of reeling sensation should not practice it.";
            } else if (this.name.equals("Trikonasana")) {
                this.how = "Stand with your feet well apart (about 3-4 feet).\n" +
                        "Point your left foot to the left, and your right foot slightly to the left.\n" +
                        "Stretch your arm out at shoulder level and bring the right arm straight up, against your right ear.\n" +
                        "Now inhale.\n" +
                        "As you exhale, bend to the left and slightly forward to bypass your ribs.\n" +
                        "Slide your left hand down your left leg and hold on to the lowest part you can reach.\n" +
                        "Look out at your right hand.";
                this.release = "Take several full breaths in this position before releasing it. Repeat, bending to the right.";
                this.caution = "Do not bend legs at the knees.\n" +
                        "Judge your limitations.";
            } else if (this.name.equals("Mayurasana")) {
                this.how = "Firstly, kneel down on the floor.\n" +
                        "Now, join the two arms together and rest the hands on the floor and palms down with fingers pointing toward the toes.\n" +
                        "You may curve the fingers slightly, this facilitates balancing.\n" +
                        "Keep the hands firm on the floor.\n" +
                        "Know you have firm and steady forearms for supporting the whole body.\n" +
                        "Now bring down the abdomen slowly against the co-joined elbows. Now stretch your legs, inhale and raise the legs together from the floor.\n" +
                        "Raise the legs straight on a level with the head parallel to the floor.";
                this.release = "Keep the posture for a while and then rest the toes on the floor and exhale.\n" +
                        "Rest for a while and do this again 2-3 times.";
                this.caution = "Not for the persons who are suffering from cervical spondylitis.\n" +
                        "If during practice you feel like coughing or sneezing then return and start practising again.";
            } else if (this.name.equals("Shavasana")) {
                this.how = "Lie down quietly on your back like a corpse.\n" +
                        "Rest your arms at your sides and your palms facing up.\n" +
                        "Clear your mind of thoughts.\n" +
                        "Take long deep breaths and be in a perfectly relaxed condition.";
                this.release = "Stay in the pose for ten minutes and then release the pose.";
                this.caution = "Back injury or discomfort: Do this pose with your knees bent and your feet on the floor, hip-distance apart; either bind the thighs parallel to each other with a strap (taking care not to position the heels too close to the buttocks) or support the bent knees on a bolster.\n" +
                        "In the case of pregnancy: Raise your head and chest on a bolster.";
            } else if (this.name.equals("Mandukasana")) {
                this.how = "Sit in Vajrasana with both the legs bent in the rear.\n" +
                        "Keep both the paws of the legs touching each other. Keep both the heels opened out. Sit with waist and back straight supporting the buttocks on the two heels.\n" +
                        "Now separate the knees as far apart as possible. This is Manduk sitting.\n" +
                        "Now for Mandukasana bring both the knees in the front touching each other.\n" +
                        "Close both the fists of the hands and keep them on the belly on both the sides of the navel.\n" +
                        "Lower the body in front and let the forehead touch the ground.";
                this.release = "Come back in first position and relax.";
                this.caution = "Not for the people who are suffering from peptic or duodenal ulcer, severe back pain and cardiac problem, and patients who have undergone abdominal surgery.";
            } else if (this.name.equals("Neck and Eye exercises")) {
                this.how = "";
                this.release = "";
                this.caution = "";
                Intent i=new Intent(this,eyeneck.class);
                startActivity(i);
                finish();
            } else if (this.name.equals("Sitali")) {
                this.how = "Purse your lips into a tiny \"o\" shape, like a reaching kiss. Keep your tongue floating inside, so that it doesn't touch teeth or gums?\n" +
                        "Slowly inhale through your mouth, feel the cooled air. If your mouth becomes dry, be patient and slow it down more.\n" +
                        "To exhale, use the tip of your tongue softly against the top inside roof of your mouth. Exhale even more slowly as you inhaled. The air will exit your nose, so feel the heat exiting too.";
                this.release = "";
                this.caution = "";
                text1.setText("How to do :");
                text2.setText("");
            } else if (this.name.equals("Katti-Chakrasana")) {
                this.how = "Stand with the feet about half a meter apart and the arms by the side.\n" +
                        "Take a deep breath in while raising the arms to shoulder level.\n" +
                        "Breathe out and twist the body to the left. Bring the right hand to the left shoulder and wrap the left arm around the back.\n" +
                        "Bring the left hand around the right side of the waist look over the left shoulder as far as possible.\n" +
                        "Keep the back of the neck straight. The top of the spine is the fixed point around which the head turns.\n" +
                        "Hold the breath for two seconds, accentuate the twist and try to gently stretch the abdomen.\n" +
                        "Repeat on the other side to complete one round. Keep the feet firmly on the ground while twisting.";
                this.release = "Inhale and return to the starting position, stand straight and relax.";
                this.caution = "Do not practice if you have a diagnosed disc disease in your lower back.\n" +
                        "If you are pregnant, then do not strongly contract your abdominal muscles as you twists( open twists) – allow the belly to remain soft; if you have hernia, a detached retina or glaucoma, or if you are menstruating.";
            } else if (this.name.equals(" Tadasana")) {
                this.how = "Stand erect, legs together, hands by the side of the thighs. Gaze in front.\n" +
                        "Bring the hands up straight towards the sky, fingers pointing upward.\n" +
                        "Raise your hands straight in front up to arms. Palms facing each other.\n" +
                        "Now slowly raise your heels and stand on toes. Raise heels as much as you can. Stretch body up as much as possible.";
                this.release = "For returning to the original position, bring your heels on the ground first.\n" +
                        "And then slowly bring down your hands also.";
                this.caution = "Headache\n" +
                        "Insomnia\n" +
                        "Low blood pressure";
            } else if (this.name.equals("Vakrasana")) {
                this.how = "Sit erect, stretching your legs in front together. Hands by the side, palm resting on the ground, fingers together pointing forward.\n" +
                        "Slowly fold your one leg (i.e. left) at the knee and place the sole on the ground near the knee of the right leg. The knee of the left leg should make 90° angle straight towards sky.\n" +
                        "Taking the left hand towards back, place the palm on the ground at the distance of 9\" straight from spine. Fingers together pointing backward. Then place the right hand towards the other side of the left knee. If legs are stretched towards east then fingers of the hand will point towards north.\n" +
                        "Now twist your head and back towards backside and try to look at the backside.\n" +
                        "While returning to the original position, first bring your head to the original position.\n" +
                        "Now take the right hand to its original position and then bring the left hand from the back and place it by the side of the body.\n" +
                        "Now slowly stretch out your folded leg and sit erect as in the first position.\n" +
                        "In the same way practice it from the other leg. This makes one round of Vakrasana.";
                this.release = "To release the posture, slowly stretch out your folded leg and sit erect as in the first position.\n" +
                        "In the same way practice it from the other leg. This makes one round of Vakrasana.";
                this.caution = "Those who are having a big belly may feel it difficult to place the hand to the other side of the knee, they suggested to place the hand on the knee or keep it wherever it is, if it is not possible to place it on the ground.";
            } else if (this.name.equals("Paripurna-Navasana")) {
                this.how = "Start from sitting in Dandasana.\n" +
                        "Take 2-3 deep breaths and start raising legs with knees bend and straight spine.\n" +
                        "Stretch and extend the arms horizontally.\n" +
                        "Raise the legs until knees start touching the hands.\n" +
                        "Stable yourself and straight the legs.\n" +
                        "Maintain this position till you feel confortable while breathing normally.\n" +
                        "Stop the practice if you feel abnormal pain in the lower back.";
                this.release = "Bend the legs so as to touch the floor with foots.\n" +
                        "Straight the legs and relax.";
                this.caution = "Not for the people who have following diseases:\n" +
                        "\n" +
                        "Asthma\n" +
                        "Diarrhea\n" +
                        "Headache\n" +
                        "Heart Problems\n" +
                        "Insomnia\n" +
                        "Low blood pressure\n" +
                        "Menstruation\n" +
                        "Pregnancy";
            } else if (this.name.equals("Uddiyan-bandha")) {
                this.how = "Stand up with distance of 1 to 1.5 feet between the legs.\n" +
                        "Bend a little in the knees and place left palm on the left knee and right palm on the right knee.\n" +
                        "Bend the shoulders a little towards the front and the neck also towards the front so that the weight of the body is shifted onto the knees through the hands.\n" +
                        "This reduces the strain on the stomach and the muscles of the stomach can be relaxed.\n" +
                        "Inhale deeply and then exhale gradually.";
                text1.setText("How to do:");
                text2.setText("");
                this.release = "";
                this.caution = "Persons suffering from stomach ailments, heart troubles or defective blood circulation should not attempt to perform the bandh. Persons suffering from diseases like hernia too should not perform this bandh.";
            } else if (this.name.equals("Virasana-2")) {
                this.how = "Take the left foot forward and place the left foot on the floor at the maximum distance from the initial position.\n" +
                        "Bring both the hands together, join the palms and place them on the knees of the left leg. Bend the left leg in the knee in such a way that the thigh and the calf come in 90 degrees. Keep the right leg straight.\n" +
                        "Raise the joined hands up and take them back above the head and then without bending the hands in the elbows, bend the head backward and keep the sight backward down.";
                this.release = "To release, start bringing the body forward and place the hands on the knee. Keep sight to the front.\n" +
                        "Straighten the knee and restore the hands to their original place.\n" +
                        "Restore the left leg to its place and take up standing position.";
                this.caution = "The process of the backward bending should be slow and controlled, else it becomes difficult to maintain the balance.\n" +
                        "The loss of balance may prove injurious to certain parts of the body.\n" +
                        "Slow and controlled movements help in having halt at the needed point and avoiding the unwanted strain.";
            } else if (this.name.equals("Ushtrasana")) {
                this.how = "Sit with legs stretched, heels together, palms pressing on the ground by the side of buttocks, to keep the body at right angles to the legs with an erect spine.\n" +
                        "Bend right leg backwards.\n" +
                        "Bend the left leg to come to Vajrasana.\n" +
                        "Raise up making the trunk vertical.\n" +
                        "Inhale and bend the body backwards and bring the hands on the heels.";
                this.release = "To release, inhale and lift the head up, place the hands on the hips and tilt forward into a straight line and EXHALE. Perform once or twice.";
                this.caution = "Not for the persons who have hernia, recent or chronic knee, shoulder, neck or back injury or inflammation.";
            } else if (this.name.equals("Tiriyaka-Tadasana")) {
                this.how = "Take the same position as Tadasana without lifting the heals.\n" +
                        "Stretch the body up and bend towards left from waist and hold the position for some time.\n" +
                        "Come back to pre-position and relax.\n" +
                        "Bend towards right and hold for some time.";
                this.release = "To release, come back to pre-position and relax your body.";
                this.caution = "Not for the heart patients, the very debilitated, and those suffering from high blood pressure, edema, ascites, and serious diseases of the intestines without supervision of a yoga therapist.";
            } else if (this.name.equals("Kapalbhati")) {
                this.how = "Keep breathing gradually while sitting in Padmasana .\n" +
                        "Inhale and start performing Kapalbhati as stated before, that means a strong Rechaka, natural Pooraka and again strong Rechaka and natural pooraka.\n" +
                        "Keep on doing this rotation swiftly in rhythmic manner.\n" +
                        "Perform as many cycles as possible and then keep breathing gradually. All these processes are included under one cycle of Kapalbhati.";
                this.release = "";
                text1.setText("How to do:");
                text2.setText("");
                this.caution = "The level of common person can go up to 200 repetitions. It is not advisable to increase the number beyond that.\n" +
                        "Patients suffering from heart trouble, lung trouble should practice this under an expert guidance.\n" +
                        "Those suffering from diseases of blood circulation should perform the process very carefully.\n" +
                        "They should perform the process under the guidance and care of experts.";
            } else if (this.name.equals("Adho-Mukha-Svanasana")) {
                this.how = "Come to your hands and knees with the wrists underneath the shoulders and the knees underneath the hips.\n" +
                        "Curl the toes under and push back raising the hips and straightening the legs.\n" +
                        "Spread the fingers and ground down from the forearms into the fingertips.\n" +
                        "Outwardly rotate the upper arms broadening the collarbones.";
                this.release = "Stay in this pose anywhere from 1 to 3 minutes. Then bend your knees to the floor with an exhalation and rest in Advasana";
                this.caution = "Not for the persons who have carpal tunnel syndrome or diarrhea.\n" +
                        "Pregnancy: Do not do this pose late-term.\n" +
                        "High blood pressure or headache: Support your head on a bolster or block, ears level between the arms.";
            } else if (this.name.equals("Balasana-1")) {
                this.how = "Firstly kneel on the floor.\n" +
                        "Touch your big toes together and sit on your heels, then separate your knees about as wide as your hips.\n" +
                        "Exhale and lay your torso down between your thighs.\n" +
                        "Broaden your sacrum across the back of your pelvis and narrow your hip points toward the navel, so that they nestle down onto the inner thighs.\n" +
                        "Lengthen your tailbone away from the back of the pelvis while you lift the base of your skull away from the back of your neck.\n" +
                        "Feel how the weight of the front shoulders pulls the shoulder blades wide across your back.\n" +
                        "Balasana is a resting pose.\n" +
                        "Stay anywhere from 30 seconds to a few minutes.\n" +
                        "Beginners can also use Balasana to get a taste of a deep forward bend, where the torso rests on the thighs.\n" +
                        "Stay in the pose from 1 to 3 minutes.";
                this.release = "To come up, first lengthen the front torso, and then with an inhalation lift from the tailbone as it presses down and into the pelvis.";
                this.caution = "Diarrhea.\n" +
                        "Pregnancy.\n" +
                        "Knee injury: Avoid Balasana unless you have the supervision of an experienced teacher.";
            } else if (this.name.equals("Bhastrika")) {
                this.how = "Sit on the Padmasana (Lotus Pose) with eye closed.\n" +
                        "Take a deep breath in (inhale), filling the lungs with air.\n" +
                        "After that gently breathe out.\n" +
                        "In this inhaling and exhaling should take the same length of time-2.5 seconds to breathe in and 2.5 seconds to breathe out.\n" +
                        "While you breathe in (inhale) assume that you are taking in positive energy and vibrations, and that you are being energized by them.\n" +
                        "During breathe out (exhale), imagine that you are taking out all the toxins from our body and find. (feel that during breathe out all the toxins comes out through your breathe)";
                this.caution = "You should exercise caution against the temptation of pushing too far in your initial practice of Bellows.\n" +
                        "If you have the tendency to push the limit, lie down when doing this exercise since there is a risk for you to lose consciousness and fall on the floor.\n" +
                        "Excess in practice may induce dizziness, drowsiness and loss of consciousness.";

                text1.setText("How to do :");
                text2.setText("");
                this.release="";
            } else if (this.name.equals("Sun-Salutation")) {
                this.how = "Step 1\n" +
                        "\n" +
                        "To begin sun salutation, bring your mind and body to attention facing east. Mentally visualize the rising sun. Visualize the sun radiating throughout your body.\n" +
                        "\n" +
                        "Stand up straight with your feet together and your palms prayer-like in front of your chest. Feel awareness of the whole body. Relax and begin to inhale.\n" +
                        "\n" +
                        "Step 2\n" +
                        "\n" +
                        "Continue inhaling as you raise your arms in a wide circle out to the sides and overhead. \n" +
                        "Stretch your arms back as you lift them to allow the fullest expansion of your chest. \n" +
                        "Press your palms together above your head and look up at your hands. \n" +
                        "Stretch up and hold your breath. \n" +
                        "Hold the position for a few seconds with body in pose, breath held, eyes focused, and mind silent.\n" +
                        "\n" +
                        "Step 3\n" +
                        "\n" +
                        "Breathe out as you bend forward from the waist, keeping palms together, tucking your head\n" +
                        "\n" +
                        "keep your back straight as long as you can.\n" +
                        "\n" +
                        "Step 4\n" +
                        "\n" +
                        "Breathe in as you release your legs and stand up. \n" +
                        "Breathing out, immediately lunge forward with your right leg, keeping your toes tucked under. Support your weight on the both hands, right foot, left knee, and toes of the left foot. \n" +
                        "Tilt the head back; look up. Inhale and retain breath.\n" +
                        "\n" +
                        "When you repeat this exercise, alternate the leg you lunge forward with. For example, use the left leg instead of right.\n" +
                        "\n" +
                        "You may also want to do some experimentation to determine the comfortable distance to step forward so that you can perform step 4 and 5 in one fluid movement. \n" +
                        "Try to keep your left knee off the floor.\n" +
                        "\n" +
                        "Step 5\n" +
                        "\n" +
                        "Breathe in as you gently raise your arms in a wide circle out to the sides and overhead, palms together, looking up at your hands. \n" +
                        "Hold your breath.\n" +
                        "\n" +
                        "Hold the position for a few seconds with body in pose, breath held, eyes focused, and mind silent.\n" +
                        "\n" +
                        "Step 6\n" +
                        "\n" +
                        "Breathe out. \n" +
                        "Bring both hands down on the floor on either side of your right foot.\n" +
                        "Bring your right foot back next to your left foot.\n" +
                        "Straighten your body into a \"plank\" position\n" +
                        "\n" +
                        "Step 7\n" +
                        "\n" +
                        "Hold your breath out as you lower your body so that your chin, chest, and knees touch the floor (toes are still tucked under).\n" +
                        "\n" +
                        "When your knees touch the floor, relax the held breath and start to breathe\n" +
                        "\n" +
                        "Step 8\n" +
                        "\n" +
                        "Continue breathing in as you curl your head back.\n" +
                        "Lift your chest and stomach.\n" +
                        "Keep your hipbones on the floor. \n" +
                        "Look up through your forehead. (Cobra Pose or Bhujangasana)\n" +
                        "Hold your breath.\n" +
                        "\n" +
                        "Hold the position for a few seconds with body in pose, breath held, eyes focused, and mind silent.\n" +
                        "\n" +
                        "Step 9\n" +
                        "\n" +
                        "Breathe out as you push your hips up and heels down into an inverted \"V\" position. \n" +
                        "Tuck your chin to your chest. Hold your breath out.\n" +
                        "\n" +
                        "Hold the position for a few seconds with body in pose, breath held, eyes focused, and mind silent.\n" +
                        "\n" +
                        "Step 10\n" +
                        "\n" +
                        "Start to breathe in as you bring your left foot forward between your hands and lunge forward with your left leg.\n" +
                        "Continue breathing in as you raise your arms in a wide circle to the sides and overhead, with palms together, looking up at your hands. Hold your breath.\n" +
                        "\n" +
                        "Hold the position for a few seconds with body in pose, breath held, eyes focused, and mind silent. Alternate the leg you lunge forward with in this step as you did in steps 4 and 5. Try to keep your right knee off the floor if you can\n" +
                        "\n" +
                        "Step 11\n" +
                        "\n" +
                        "Breathe out as you bring your right foot forward next to the left.\n" +
                        "Grasp the back of your ankles, calves, or thighs.\n" +
                        "Bend your elbows.\n" +
                        "Pull your upper body gently toward your legs, and tuck your chin toward your chest. \n" +
                        "Hold your breath out.\n" +
                        "\n" +
                        "Hold the position for a few seconds with body in pose, breath held, eyes focused, and mind silent.\n" +
                        "\n" +
                        "Step 12\n" +
                        "\n" +
                        "Breathe in as you straighten, bringing your arms in a wide circle out to the sides and overhead, palms together. Look up at your hands and stretch. \n" +
                        "Hold your breath.\n" +
                        "\n" +
                        "Hold the position for a few seconds with body in pose, breath held, eyes focused, and mind silent.\n" +
                        "\n" +
                        "Step 13\n" +
                        "\n" +
                        "Breathe out as you bring your arms in a circle down to the sides and back to your chest with palms together as in Step 1";
                this.release = "";
                this.caution = "";
                text1.setText("How to do :");
                text2.setText("");
            } else if (this.name.equals("Ujjai")) {
                this.how = "Place your palm facing your open lips, as if you were holding a mirror there Exhale through your mouth, as if you are trying to fog the mirror Inhale through your mouth, as if you are trying to remove the fog.\n" +
                        "Don't force the breath! Just breath easily, feeling what is going on in your throat.\n" +
                        "Listen to the sounds in the back of your throat. They sound something like what you hear when you place a conch shell against your ear, or like the sound of a whisper.\n" +
                        "Breathe 10 breaths this way.\n" +
                        "Close your mouth and continue.";
                this.release = "";
                this.caution = "Many people experience dizziness or lose consciousness while practicing beginner or advanced Breathing Techniques. Do not rush things and practice all exercises as slowly as you can.";
                text1.setText("How to do :");
                text2.setText("");
            }
        }
      /*  else if(this.name.equals("")){
            this.how="";
            this.release="";
            this.caution="";
        }
        else if(this.name.equals("")){
            this.how="";
            this.release="";
            this.caution="";
        }


*/
         //   this.imageDetail.setImageResource(this.imageId);
            this.title.setText(this.name);
            this.explainhow.setText(this.how);
            this.explain.setText(this.release);
        Glide.with(this).load(url)
                .apply(new RequestOptions().placeholder(R.drawable.loading))
                .into(imageDetail);
        }

    private void setCAution() {
        AlertDialog alertbox = new AlertDialog.Builder(this)
                .setMessage(caution)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                })

                .show();
    }
    public void didTapButton(View view) {
        Button button = (Button) findViewById(R.id.caution_button);
        Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        myAnim.setInterpolator(new MyBounceInterpolator(0.2d, 20.0d));
        button.startAnimation(myAnim);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCAution();
            }
        });
    }


}
