package com.example.scrolling_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview =(TextView)findViewById(R.id.text1);
        String para="DJI Osmo Pocket is the easiest way to record stabilized 4K video and fluidly moving time lapses without having to carry around a full-sized DSLR gimbal and bulky camera gear.\n" +
                "\n" +
                "It's a handheld camera stabilizer for the mainstream, and that means you'll soon be seeing even more silky smooth video out there. That's a good news for everyone who hates shaky video.\n" +
                "\n" +
                "    DJI Osmo Pocket at Amazon for US$299\n" +
                "\n" +
                "Read more: DJI Osmo Action\n" +
                "\n" +
                "RECOMMENDED VIDEOS FOR YOU...\n" +
                "\n" +
                "    video playing\n" +
                "    IPad Mini 2 with Retina: 2014 update review\n" +
                "    DJI Mavic Air review: A $799/£769 4K drone......\n" +
                "    15/02/18\n" +
                "    DJI Mavic Air review: A $799/£769 4K drone... worth it?\n" +
                "    Nikon D7500 review: 4K video, 8fps burst and...\n" +
                "    22/08/17\n" +
                "    Nikon D7500 review: 4K video, 8fps burst and excellent performance\n" +
                "    SNES Classic Mini unboxing video (UK...\n" +
                "    22/08/17\n" +
                "    SNES Classic Mini unboxing video (UK Edition)\n" +
                "    Samsung Galaxy S4 Mini review\n" +
                "    08/07/13\n" +
                "    Samsung Galaxy S4 Mini review\n" +
                "    Samsung Galaxy Mini 2 Review of Price, Specs...\n" +
                "    05/10/12\n" +
                "    Samsung Galaxy Mini 2 Review of Price, Specs & Features\n" +
                "\n" +
                "Since this device for everyone, let’s explain what the Osmo Pocket is: it’s a gimbal that works by adjusting for your shaky hands and bouncy walking patterns; it counteracts your uneven movement with its own stabilizing motion. This wand-shaped handle with a camera on top can also pan and track shots thanks to some nifty camera controls and smart software. \n" +
                "\n" +
                "The smoothness of the resulting video is stunning for the Osmo Pocket's miniature size. Think: it's like an old giant Hollywood crane that offers smooth video, but reduced to the size of a compact flashlight. We also found its ability to record motion time lapses to be incredibly easy to set up.\n" +
                "\n" +
                "It’s comparable in some ways to the GoPro Hero 7, which offers camera stabilization, albeit through in-camera software. And while their executions are widely different – the GoPro is more durable, while the Osmo tracking more veritable  – the results are similar. They’re all about eliminating shaky video at the end of the day. \n" +
                "\n" +
                "We found the Osmo Pocket to offer smoother video, much faster transfer rates, and exclusive features like the motion time lapses and active face tracking. It proves that gimbal stabilization is superior to electronic stabilization, if you’re willing to deal with this Osmo’s Gen 1 foibles that we'll go over.\n" +
                "\n" +
                "The DJI Osmo Pocket does almost everything larger gimbals can do and eliminates it the need for other camera gear, like bulky motorized panoramic time lapse tripod heads. We used to have to carry them around, too. All of this equipment fits in the palm of your hand now.\n" +
                "Price and release date\n" +
                "\n" +
                "The official DJI Osmo Pocket release date was December 15, 2018, following pre-orders that started as soon as the gimbal was announced on November 28. While it launched after Black Friday and Cyber Monday, DJI was able to successfully push out the latest Osmo before Christmas. Some of its best accessories, however, have yet to go on sale officially.\n" +
                "\n" +
                "It costs $349 (£329, AU$599), which is cheaper than the GoPro Hero 7 Black. This new GoPro has image stabilization built-in, so there's overlap between the two cameras. Their applications are fairly different, but the fact that they both use a lot of accessories (that cost extra) and result in stabilized footage makes them comparable.\n" +
                "\n" +
                "Design and durability\n" +
                "\n" +
                "The DJI Osmo Pocket is the camera gimbal you’ll be able to take anywhere and actually want to take anywhere thanks to its tiny size and superb video quality. Its 4K 60fps-capable camera and wand-shaped gimbal handle is no bigger than a ‘fun size’ candy bar.\n" +
                "\n" +
                "It measures 121.9 x 36.9 x 28.6mm and weighs 116g, about half the length and width an iPhone XS smartphone (though there’s more than three times the girth) and two thirds of the weight. We were able to slip it into our jeans pockets right next to our iPhone XS Max without a problem.\n" +
                "\n" +
                "It’s not just small, it’s one-hand friendly, too, with a non-slip, sweat-proof grip. That makes it easy to operate the embedded one-inch touchscreen, which is used to cycle through modes and settings. In effect, we found it to be more mobile than the also likable DJI Osmo Mobile 2.\n" +
                "Advertisement\n" +
                "\n" +
                "It's almost a miniaturized version of the DJI Osmo 2. And unlike the phone-powered DJI Osmo Mobile 2 that launched in early 2018, this gimbal won't hog your precious smartphone. It comes with a dedicated camera mounted on top. You can attach your phone for a bigger viewfinder, or rely on the small one-inch screen that’s on built into the gimbal handle. It’s good enough to frame shots and cycle through some menus and controls, but not all of the settings found on the smartphone app appear on this square one-inch screen.\n" +
                "\n" +
                "The DJI Osmo Mobile comes with a case, which we were skeptical of at first. Usually when a company mentions a case for a cool miniaturized product – especially gimbals – it means it’s going to make the device three or four times the size and not nearly as pocket-friendly. Luckily, the form-fitting protective shell for the Osmo Pocket remains svelte. It still fits into our pocket. \n" +
                "\n" +
                "You’re going to really want to use the case, too. If there’s one major issue with the Osmo Pocket design it’s that it’s not anywhere near as durable as a GoPro, which can survive your rough and tumble life. Or maybe you’re not active and just drop stuff often. That’s a no go with the DJI's smallest gimbal.\n" +
                "\n" +
                "The Osmo Pocket feels solid on the outside, but beneath the camera hinges are sophisticated motors that need to be protected from bumps, drops, and water. We couldn’t get a full range of motion with our first review unit and it wouldn’t calibrate. We may have jostled it too much. A new unit fixed the problem completely.\n" +
                "\n" +
                "Here’s something that’s infinitely better than the GoPro design: we could export video and connect to our smartphone as a viewfinder with a physical connection. The Osmo Pocket includes a universal port that accepts small Lighting and USB-C adapters. Slot one of these adapters into the port and you can instantly connect to an iPhone or Android phone.\n" +
                "\n" +
                "It’s the best way to transfer files to your phone, as transfer rate are a consistent around 10Mb/s with an unbreakable physical connection. We appreciated not having to toy around with a problematic Wi-Fi connection, especially when transferring 4K videos with hefty file sizes. When you’re not using the Lightning or USB-C adapter, you can slide it out of the port and slot it in the other way. This protects both the universal port connectors and the end the that connects to your phone. It’s the type of intelligently designed integrated physical connection we wish GoPro would adopt.\n" +
                "\n" +
                "You can buy GoPro-themed Quick Key adapters in microSD-to-Lightning or microSD-to-USB-C form, but you have to pop out your microSD card to use them and risk losing your memory card this way. Fine example: we lost the Osmo Pocket Lightning adapter on a trip, which was at least way better than popping out our precious microSD card and losing all of our photos and videos. \n" +
                "\n" +
                "Attaching your phone directly to the DJI Osmo Pocket also opens up more settings and an expansive viewfinder. We do find the the one-inch screen embedded within the confines of the gimbal to be effective for reference or tight situations and from-the-hop recording – people are often surprised that it was a touch-enabled screen. But this square-shaped screen shows a cropped frame, so it doesn't have a true-to-life live view of everything you're capturing, and having something like a 6.5-inch iPhone XS allowed us to fine tune shots and line up motion time lapses paths when we could afford the extra space.\n" +
                "\n" +
                "The DJI Osmo Pocket is cleverly designed, but very much a Gen 1 product. There’s no tripod attachment on the bottom of the gimbal handle, which is a big oversight. The bottom has a single USB-C port and not even the Wireless Module accessory for time lapses fixes this issue. There’s no 1/4-inch tripod connector here either.  \n" +
                "\n" +
                "The onboard microphone improved on launch day with an Osmo Pocket software update, but we’d still prefer a mic jack out-of-the-box. You’ll need to buy the USB-C-to-3.5mm accessory to capture the best audio. And fine tuning things like the white balance, ISO and shutter speed settings is only available within the DJI app, not on the gimbal itself. We could see DJI remedying some of these issues in software and others on a Gen 2 ‘DJI Osmo Pocket 2,’ but that’s likely a ways off.\n" +
                "DJI Osmo Pocket accessories\n" +
                "\n" +
                "We were able to test out a number of the DJI Osmo Pocket accessories for our review, and realize we might be the only ones we offer opinions on each of them this early. Not every accessory is on sale. Here’s what we think of everything we got our hands on, and a few accessory we still want and why.\n" +
                "\n" +
                "DJI Osmo Pocket Control Wheel – Recommended\n" +
                "To get the best pan and tilt motion while recording video, opt for the Control Wheel. At first, we were surprised that this wasn’t a 360-degree control stick, but we soon realized that given the miniaturized factor, it’s easier to keep a consistent side-to-side or up-and-down transition with a linear control design. There’s a switch to flip back and forth between the two linear orientations.\n" +
                "\n" +
                "The accessory also includes two extra buttons, one for re-centering the camera, and the other for flipping the camera 180-degrees. Without the Control Wheel attached, this requires pressing the power/mode button twice to re-center the camera and three-times to flip the camera. We found the standard gimbal buttons to be soft and mushy without a good tactical confirmation for multiple presses, so having the extra hard buttons on the Control Wheel dedicated to selfie and re-center made life easier.\n" +
                "\n" +
                "Wireless Module – Recommended\n" +
                "Believe it or not, you can’t wirelessly transfer video and photos, or use your smartphone as a remote viewfinder unless you have this Bluetooth and Wi-Fi base. That was a shock to us, but we found ourselves carrying around this tiny base more often than not. It makes the top-heavy gimbal easier to stand up and it’s ideal for time lapses and motion time lapses. \n" +
                "\n" +
                "In fact, if you’re going to record lengthy time lapses at all (the Osmo Pocket can record up to a five hours duration of moving time lapses and never-ending regular time lapses), you’ll get need the side-mounted USB-C port for continuous charging. Powering the Osmo Pocket without this accessory is next to impossible due to the bottom USB-C port. \n" +
                "\n" +
                "We have one complaint: the Module’s USB-C port is on the opposite side of the one-inch screen. Sticking the Osmo Pocket against a window with the USB-C cable hanging down the other side means the bright screen is more likely to reflect against the window.  \n" +
                "\n" +
                "Waterproof case – Not recommended\n" +
                "This waterproof case kept our gimbal completely dry in an underwater ‘snuba’ adventure 4.5m (15ft) below surface of the Pacific Ocean, and it’s rated for 60m (196ft), well beyond scuba diving depths. So far, so good, right?\n" +
                "\n" +
                "The problem is that this is a moving gimbal, and the case has a finite ideal window of 90 degrees. If the camera moves off-center, it picks up the hard edge that encircles this window. The focus was off, resulting in blurry photos and videos, and the entire case did fog up after a few minutes in the water. \n" +
                "\n" +
                "There’s no way to access the touchscreen through the plastic case. There are two buttons that can press through the case, so you can cycling through modes, tap record, and re-center the camera with two presses. Flipping the camera with three presses is fairly pointless here. If the case had a bubble dome shape to it, this would have worked a lot better. Stick with a GoPro under water.\n" +
                "\n" +
                "Accessory Mount and Quick Release Base – Recommended\n" +
                "Attaching the Osomo Pocket to existing GoPro mounts is possible thanks to the gimbal-hugging accessory cradle and the twist-lock attachment. If you’re looking to mount the camera to a Peak Design Capture Clip so you can use it on a belt or backpack, or stick it on a helmet, this is the best way to keep it secure. It’s the answer to not having a proper tripod mount.\n" +
                "\n" +
                "3.5mm Adapter – Recommended\n" +
                "The DJI Osmo Pocket microphone is just okay. It got better in the first major firmware update, and we like the fact that the microphone is next to the screen, thus pointing at the narrator or vlogger. But if you want everyone to hear you clearly, you’ll need a 3.5mm adapter. DJI sells one, but we found that any old USB-C-to-3.5mm adapter will work.\n" +
                "\n" +
                "Extension Rod\n" +
                "DJI is also selling an extension rod or selfie stick, and although it wasn’t available for us to test out, we do know that it offers a remedy for its tight focal length and lack of a tripod mount. It has an expandable length, gimbal control stick, buttons on the handle, and even the missing 1/4-inch tripod mount on the bottom.\n" +
                "\n" +
                "Charging Case\n" +
                "The best high-end case for the DJI Osmo Pocket isn’t the cover that comes in the box, but an actual charging case. It has more robust protection, a built-in battery and space for two microSD card, four ND filters and two smartphone connectors. If you have room for it, it sounds like an ideal travel accessory simply for the extra juice.\n" +
                "\n" +
                "ND Filters Set\n" +
                "We haven’t seen the Neutral Density filters on sale yet, but DJI has a set of four that reduce the amount of light entering the sensor. It’ll give you fewer overexposed shots the ability to enhance motion blur effects.\n" +
                "\n" +
                "Video quality, audio and camera specs\n" +
                "\n" +
                "The secret reason DJI Osmo Pocket footage looks so good is that it uses a camera sensor that keeps up with (well, is technically is a tad larger than) the best camera phones of 2019, and it sticks that on an anti-shaky gimbal wand – a magic wand in the eyes of vloggers.\n" +
                "Advertisement\n" +
                "\n" +
                "It has a 1.2/3-inch sensor (Apple’s iPhone XS Max and the Google Pixel 3 are just now up to 1/2.33-inch sensors), a 100Mbps max bitrate (your phone is likely capped at 50Mbps), and an f/2.0 aperture. The result is 4K video with quality that's slightly better than top-end smartphones, and, on top of that, fully stabilized without solely relying on optical image stabilization (OIS), Electronic Image Stabilization (EIS) or a mix of the two.\n" +
                "\n" +
                "In our testing, we found video to be more fluid than the GoPro Hero 7 and have less barrel distortion. The Osmo Pocket doesn’t warp the edges, too, though its field of view is tighter (80 degrees) and has less color vibrancy than a GoPro or an Android smartphone. You may want to invest in that Osmo Pocket Extension Rod accessory if you’re trying to capture yourself and the background, and turn on Cine Mode in the settings menu to liven up otherwise blown out skylines.\n" +
                "\n" +
                "DJI Osmo Pocket can record 4K video at 60 frames per second, which is actually something we have been waiting for on DJI’s consumer drones. Not even the new Mavic 2 Pro can do this. That said, it doesn’t have the one-inch sensor of the Mavic 2 Pro, even though the camera module looks quite similar in shape. This isn’t a Hasselblad camera – at least not in Generation 1. We did see some expected noise at higher ISOs at night and during slow motion 1080p video at 120 per second, which we also noticed was cropped. \n" +
                "\n" +
                "Sure, you’ll be able to get better video from a DSLR and gimbal rig that requires two hands, but this a more practical solution for most people who want everyday video as smooth as can be. And, often times, this fluid footage is going into cinematic-looking vacation video, time lapses, and short establishing shots. The Osmo Pocket is fully capable of handling these tasks.\n" +
                "\n" +
                "The audio is adequate, but it won’t give you the clearest sound, like an external mic can. The fact that it’s facing the gimbal holder means it’ll pick up your voice in most situations when you want to narrate or vlog. DJI thought of that at least; good positioning. But you’ll want an external mic for anything more serious.\n" +
                "\n" +
                "Our first sample video with the device took place at an impromptu concert in a New York City subway, and we did notice one flaw (and we saw a lot of frenzied YouTube commenters noticed it when viewing our video, too): the sound cut out whenever the drummer hit his cymbals. It was too loud for the audio to keep recording, resulting in blips of brief silence.\n" +
                "\n" +
                "That said, it’ll still work at concerts – we were standing way too close to the drums for the camera (and for the sake of our own ears) and DJI may have fixed this issue in its in its Osmo Pocket firmware updates. But, no, to answer everyone’s question, there’s no way to control the audio levels from the gimbal.\n" +
                "\n" +
                "Modes and effects\n" +
                "The Osmo Pocket records 1080p and 4K video at up 60fps at a max bitrate of 100Mbps, and it also captures 12MP photos in JPEG and Raw. Standard-issue stabilized video and photos are just two of the tricks here. DJI includes other modes, too.\n" +
                "\n" +
                "Time lapse and motion lapse\n" +
                "This is our new favorite way to shoot time-lapse videos. In addition to 1080p time lapses, it can shoot motion lapse videos in which you can set anywhere from two (on the gimbal) to four (using the phone app) paths. The camera head moves evenly through the pre-configured time lapse path for a moving great effect. Really, it’s a series of JPEG photos taken at intervals ranging from 3 seconds to 60 seconds with seven duration options:  5 minutes, 10 minutes, 20 minutes, 30 minutes, 1 hour, 5 hours and infinite. Infinite, for obvious reasons, is restricted to standard time lapses and is greyed out for motion lapses.\n" +
                "\n" +
                "The motion lapse effect is fantastic and the size of the DJI Osmo Pocket means you’re likely to use this in more daily situations. It’s the kind of video that spices up boring establishing shots for anyone uploading to YouTube. Paired with the Wireless Module, reviewed above, you can keep the battery charged for longer time lapses and remotely pre-set motion paths on a big phone screen. You have to output all time lapses videos through the app, but you can access all of the JPEGs to edit in your own program by plugging the gimbal directly into a computer.\n" +
                "\n" +
                "Our favorite part is that the Osmo Pocket reduces the equipment needed to capture moving time lapses. Gone is the bulky motorized panoramic time lapse tripod heads from our camera bag. Yes, our phones can do shoot time lapses just fine, too, but motion time lapses are exclusive to a form factor as small as the Osmo Pocket.\n" +
                "\n" +
                "Slow motion\n" +
                "Slow motion video from the Osmo Pocket is effective, but not outstanding next to 2019 smartphones. It records 120 frames per second at 1080p, which has a nice effect, even if it’s very cropped and there’s some noticeable noise to it. But flagship phones can do it all better.\n" +
                "\n" +
                "The Sony Xperia XZ2, Samsung Galaxy S9 and Note 9, for example, record super slow motion video of 960fps at 720p. If you’re insistent on a Full HD resolution, the iPhone X can shoot 240fps at 1080p. On top of that, Sony, Apple and Samsung’s phones allow you to edit where the video goes from real-time to slow motion. Samsung even has a neat Auto Mode to trigger the slow motion effect when it detects motion in a pre-set square. The Osmo Pocket is more straightforward; it’s all slow motion from the moment you hit record.\n" +
                "\n" +
                "Face tracking\n" +
                "You can whip the camera 180 degrees with three presses of the power/mode button or one much easier press of the recommended Control Wheel button. What’s interesting is that from here, the camera can seamlessly track your single face.\n" +
                "\n" +
                "Face Tracking pans and tilts the camera head fluidly, keeping your face in the frame as long as you’re not intentionally trying to fool is with super quick ninja motions. Vloggers will get the most use out of this face tracking feature, though it doesn’t work in 4K@60fps. Every other mode we tested does track your face surprisingly well.\n" +
                "\n" +
                "Story mode\n" +
                "Even DJI has gotten in on the ‘Stories’ craze started by Snapchat and copied by Instagram. In the case of the Osmo Pocket, Story Mode acts as a handy tool to automatically assemble video clips and edit them to your liking. It includes trendy-looking transitions like zoom-in and camera whip between clips and you can add music, stickers, and titles. The UI is incredibly intuitive, but it’s not as granular as true artisans may like. You can’t edit the size of titles, for example, and, worst of all, all video experts in 720p. The quality difference is very noticeable, so much as that we’d advise using an outside app with more precision editing and resolution control.\n" +
                "\n" +
                "DJI Mimo app\n" +
                "The DJI Osmo Pocket app itself, called DJI Mimo, is fast to connect and actually very usable – more so than the heavy-feeling GoPro app. This is because the connection hardly ever broke between the app and the camera and our file sizes were often small. The layout is similar to the apps for larger Osmo cameras or Mavic drones. The multitude of options can be overwhelming at first, but you’ll eventually find everything you need within this app.\n" +
                "\n" +
                "Staying connected to the camera through the app has been a difference maker, and it worked flawlessly whether we were tethered or using with Bluetooth via the Wireless Module. Our biggest complaint is that the tutorials play on the main page of the app... with auto-playing sound. That became annoying during week three with this device.\n" +
                "Battery life\n" +
                "\n" +
                "The Osmo Pocket battery capacity is 875 mAh with a recording time of 140 minutes when set to 1080p 30fps, according to DJI. Our tests at a full charge showed that it met that standard – without any gimbal movement.\n" +
                "\n" +
                "Obviously, opting for the superior 4K and moving the gimbal around reduced the length of the battery a bit. But it still lasted an hour in our real-world tests.\n" +
                "\n" +
                "The fact that the battery is not user-replaceable concerned DJI fans when the Osmo Pocket was first announced. But we found that it carried us through a day of recording 4K video as we created short time lapses. We became pros at turning it off after each take and set the auto-off idle time to one minute in the settings menu.\n" +
                "\n" +
                "The battery, of all things, shouldn’t dissuade you it you’re on the fence. Durability, maybe, but not battery life. We do suggest buying one of the best portable batteries to recharge the gimbal on demand. A small Anker battery is what we’ve been using for longer shoots.\n" +
                "\n" +
                "Final verdict\n" +
                "\n" +
                "The DJI Osmo Pocket is the go almost anywhere, record anything camera gimbal that leaves you with stabilized footage better than what you’ll get from top-of-the-line smartphones. You can capture 4K at 60fps footage that moves fluidly like a old-school Hollywood crane, and motion time lapses that mimic what the pros can do with much more expensive camera gear. \n" +
                "\n" +
                "Sure, you’ll get even better results from a DSLR or mirrorless camera paired with a large gimbal or a motorized panoramic time lapse tripod head. But the differences in quality are minor and the Osmo drops a lot of weight and equipment from your camera bag. That’s where it becomes a good value for YouTubers and consumers who want stunning vacation video without their usual shakiness.";
        textview.setText(para);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }
}
