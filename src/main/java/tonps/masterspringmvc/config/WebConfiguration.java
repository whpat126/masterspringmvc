package tonps.masterspringmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import tonps.masterspringmvc.date.USLocalDateFormatter;

import java.time.LocalDate;

/**
 * @author wanghh on 2017-11-26 23:54
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatterForFieldType(LocalDate.class, new
                USLocalDateFormatter());
    }
}