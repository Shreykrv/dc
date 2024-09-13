package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {
	
//	@GetMapping("/")
//	public String home() {
//		return "index";
//	}
	@GetMapping("/panchang")
	public String panchang() {
		return "panchang";
	}
	@GetMapping("/astrology")
	public String astrology() {
		return "astrology";
	}
	@GetMapping("/featuredpuja")
	public String featuredpuja() {
		return "featuredpuja";
	}
	@GetMapping("/contact-us")
	public String contactus() {
		return "contactus";
	}
	@GetMapping("/satyanarayanvratkatha")
	public String satyanarayanvratkatha() {
		return "satyanarayanvratkatha";
	}
	@GetMapping("/aarti")
	public String aarti() {
		return "aarti";
	}
	@GetMapping("/horoscope")
	public String horoscope() {
		return"horoscope";
	}
	@GetMapping("/chalisa")
	public String chalisa() {
		return"chalisa";
	}
	
	@GetMapping("/ganeshaarti")
	public String ganeshaarti() {
		return"ganeshaarti";
	}
	
	@GetMapping("/success")
	public String success() {
		return"success";
	}
	
	@GetMapping("/durga-chalisa")
    public String durgaChalisa() {
        return "durga-chalisa";
    }

    @GetMapping("/hanuman-chalisa")
    public String hanumanChalisa() {
        return "hanuman-chalisa";
    }

    @GetMapping("/shiv-chalisa")
    public String shivChalisa() {
        return "shiv-chalisa";
    }

    @GetMapping("/lakshmi-chalisa")
    public String lakshmiChalisa() {
        return "lakshmi-chalisa";
    }

    @GetMapping("/ganesh-chalisa")
    public String ganeshChalisa() {
        return "ganesh-chalisa";
    }
    @GetMapping("/krishna-chalisa")
    public String krishnaChalisa() {
        return "krishna-chalisa";
}
    @GetMapping("/saraswati-chalisa")
    public String saraswatiChalisa() {
        return "saraswati-chalisa";
}
    @GetMapping("/shani-chalisa")
    public String shaniChalisa() {
        return "shani-chalisa";
}
    @GetMapping("/ram-chalisa")
    public String ramChalisa() {
        return "ram-chalisa";
}
    @GetMapping("/gayatrimataaarti")
    public String gayatrimataaarti() {
        return "gayatrimataaarti";
}
    @GetMapping("/vishawkarma-aarti")
    public String vishawkarmaaarti() {
        return "vishawkarma-aarti";
}
    @GetMapping("/vishnu-aarti")
    public String vishnuaarti() {
        return "vishnu-aarti";
}
    @GetMapping("/shivratri-aarti")
    public String shivratriaarti() {
        return "shivratri-aarti";
}
    @GetMapping("/amba-aarti")
    public String ambaaarti() {
        return "amba-aarti";
}
    @GetMapping("/saraswati-mata-aarti")
    public String saraswatimataaarti() {
        return "saraswati-mata-aarti";
}
    @GetMapping("/hanuman-ji-ki-aarti")
    public String hanumanjikiaarti() {
        return "hanuman-ji-ki-aarti";
}
    @GetMapping("/satyanarayan-bhagwan-aarti")
    public String satyanarayanbhagwanaarti() {
        return "satyanarayan-bhagwan-aarti";
}
    @GetMapping("/mantra")
    public String mantra() {
        return "mantra";
    }
    @GetMapping("/shiv-mantra")
    public String shivMantra() {
        return "shiv-mantra";
    
}
    @GetMapping("/lakshmi-mantra")
    public String lakshmiMantra() {
        return "lakshmi-mantra";
    
}
    @GetMapping("/ganesh-mantra")
    public String ganeshMantra() {
        return "ganesh-mantra";
    
}
    @GetMapping("/saraswati-mantra")
    public String sraswatiMantra() {
        return "saraswati-mantra";
    
}
    @GetMapping("/durga-mantra")
    public String durgaMantra() {
        return "durga-mantra";
    
}
    @GetMapping("/vishnu-mantra")
    public String vishnuMantra() {
        return "vishnu-mantra";
    
}
    @GetMapping("/shanidev-mantra")
    public String shanidevMantra() {
        return "shanidev-mantra";
    
}

    @GetMapping("/navgrah-mantra")
    public String navgrahMantra() {
        return "navgrah-mantra";
    
}

    @GetMapping("/gayatri-mantra")
    public String gayatriMantra() {
        return "gayatri-mantra";
    
}
    @GetMapping("/blog")
    public String blog() {
    	return "blog";
    }

    @GetMapping("/jyotirlinga")
    public String jyotirlinga() {
    	return "jyotirlinga";
    }


}
