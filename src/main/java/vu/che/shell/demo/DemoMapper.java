package vu.che.shell.demo;

import org.mapstruct.Mapper;
import vu.che.utils.mapstruct.Constants;

@Mapper(componentModel = Constants.SPRING_COMPONENT_MODEL)
public abstract class DemoMapper {

    public abstract Demo mapToModel(DemoEntity entity);
}
