package net.feng_shui.dao.interfaces;

import net.feng_shui.dao.generic.interfaces.GenericDAO;
import net.feng_shui.model.*;
import java.util.List;

/**
 * Created by mil on 30.11.15.
 * banana
 */
public interface IndividualDao extends GenericDAO<Individual> {
    List<Phone> getPhoneListByIndividualId(Integer id);
    List<Email> getEmailListByIndividualId(Integer id);
    List<Social> getSocialListByIndividualId(Integer id);
    List<Tag> getTagListByIndividualId(Integer id);
    List<Website> getWebsiteListByIndividualId(Integer id);
}
